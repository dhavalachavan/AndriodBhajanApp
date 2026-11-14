package com.example.top10bhajans.ui.screens

import android.content.Intent
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.core.net.toUri
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.example.top10bhajans.data.Bhajan
import com.example.top10bhajans.ui.theme.DevotionalColors
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

enum class LyricsLanguage {
    ENGLISH, HINDI
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerScreen(
    bhajan: Bhajan,
    isFavorite: Boolean,
    onToggleFavorite: () -> Unit,
    onBackClick: () -> Unit
) {
    var fontSizeSp by remember { mutableIntStateOf(18) }
    var selectedLanguage by remember { mutableStateOf(LyricsLanguage.ENGLISH) }
    var embedError by remember(bhajan.youtubeVideoId) { mutableStateOf(value = false) }

    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    val youTubePlayerView = remember(bhajan.youtubeVideoId) {
        YouTubePlayerView(context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            enableAutomaticInitialization = false

            val options = IFramePlayerOptions.Builder(context)
                .controls(1)
                .autoplay(1)
                .rel(0)
                .build()

            initialize(
                object : AbstractYouTubePlayerListener() {
                    override fun onReady(youTubePlayer: YouTubePlayer) {
                        youTubePlayer.loadVideo(bhajan.youtubeVideoId, 0f)
                    }

                    override fun onError(
                        youTubePlayer: YouTubePlayer,
                        error: PlayerConstants.PlayerError
                    ) {
                        embedError = true
                    }
                },
                options
            )
        }
    }

    // Automatically pauses video on ON_PAUSE (leaving screen or locking phone) and releases on dispose
    DisposableEffect(lifecycleOwner, youTubePlayerView) {
        lifecycleOwner.lifecycle.addObserver(youTubePlayerView)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(youTubePlayerView)
            youTubePlayerView.release()
        }
    }

    val openInYouTube = {
        val intent = Intent(
            Intent.ACTION_VIEW,
            "https://www.youtube.com/watch?v=${bhajan.youtubeVideoId}".toUri()
        )
        context.startActivity(intent)
    }

    Scaffold(
        containerColor = DevotionalColors.SoftCreamBackground,
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = DevotionalColors.DeepBrownText
                        )
                    }
                },
                title = {
                    Column {
                        Text(
                            text = "${bhajan.titleHindi} · ${bhajan.title}",
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = bhajan.deity,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 12.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DevotionalColors.WarmCardSurface
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(16f / 9f)
            ) {
                AndroidView(
                    factory = { youTubePlayerView },
                    modifier = Modifier.fillMaxSize()
                )

                // Graceful fallback if the video uploader restricted third-party embedding
                if (embedError) {
                    Surface(
                        color = Color(0xFF2B1B17).copy(alpha = 0.94f),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(20.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "This video cannot be embedded by its uploader.",
                                color = Color.White,
                                style = MaterialTheme.typography.titleMedium,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            Button(
                                onClick = openInYouTube,
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = DevotionalColors.SaffronPrimary,
                                    contentColor = Color.White
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.OpenInNew,
                                    contentDescription = null,
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.size(8.dp))
                                Text(
                                    text = "Watch on YouTube",
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    OutlinedButton(
                        onClick = { if (fontSizeSp > 14) fontSizeSp -= 2 },
                        border = BorderStroke(1.dp, DevotionalColors.SubtleGoldBorder),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(
                            text = "A-",
                            color = DevotionalColors.DeepBrownText,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    OutlinedButton(
                        onClick = { if (fontSizeSp < 30) fontSizeSp += 2 },
                        border = BorderStroke(1.dp, DevotionalColors.SubtleGoldBorder),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(
                            text = "A+",
                            color = DevotionalColors.DeepBrownText,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                SingleChoiceSegmentedButtonRow {
                    SegmentedButton(
                        selected = selectedLanguage == LyricsLanguage.ENGLISH,
                        onClick = { selectedLanguage = LyricsLanguage.ENGLISH },
                        shape = SegmentedButtonDefaults.itemShape(index = 0, count = 2),
                        colors = SegmentedButtonDefaults.colors(
                            activeContainerColor = DevotionalColors.SaffronPrimary,
                            activeContentColor = Color.White,
                            inactiveContainerColor = DevotionalColors.WarmCardSurface,
                            inactiveContentColor = DevotionalColors.DeepBrownText
                        )
                    ) {
                        Text("English", maxLines = 1)
                    }
                    SegmentedButton(
                        selected = selectedLanguage == LyricsLanguage.HINDI,
                        onClick = { selectedLanguage = LyricsLanguage.HINDI },
                        shape = SegmentedButtonDefaults.itemShape(index = 1, count = 2),
                        colors = SegmentedButtonDefaults.colors(
                            activeContainerColor = DevotionalColors.SaffronPrimary,
                            activeContentColor = Color.White,
                            inactiveContainerColor = DevotionalColors.WarmCardSurface,
                            inactiveContentColor = DevotionalColors.DeepBrownText
                        )
                    ) {
                        Text("Hindi", maxLines = 1)
                    }
                }

                IconButton(
                    onClick = onToggleFavorite,
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                        contentDescription = if (isFavorite) "Remove favorite" else "Save favorite",
                        tint = if (isFavorite) DevotionalColors.FavoriteRed else DevotionalColors.MutedBrownText,
                        modifier = Modifier.size(28.dp)
                    )
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = DevotionalColors.WarmCardSurface
                ),
                border = BorderStroke(1.dp, DevotionalColors.SubtleGoldBorder.copy(alpha = 0.6f))
            ) {
                val lyricsText = if (selectedLanguage == LyricsLanguage.ENGLISH) {
                    bhajan.lyricsEnglish
                } else {
                    bhajan.lyricsHindi
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(20.dp)
                ) {
                    Text(
                        text = if (selectedLanguage == LyricsLanguage.ENGLISH) "Lyrics (English)" else "गीत (हिन्दी)",
                        style = MaterialTheme.typography.titleMedium,
                        color = DevotionalColors.SaffronPrimary
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = lyricsText,
                        fontSize = fontSizeSp.sp,
                        lineHeight = (fontSizeSp * 1.6f).sp,
                        color = DevotionalColors.DeepBrownText
                    )
                }
            }
        }
    }
}

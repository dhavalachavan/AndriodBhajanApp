package com.example.top10bhajans.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.top10bhajans.data.Bhajan
import com.example.top10bhajans.ui.components.BhajanCard
import com.example.top10bhajans.ui.theme.DevotionalColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesScreen(
    favoriteBhajans: List<Bhajan>,
    onPlayBhajan: (Bhajan) -> Unit,
    onToggleFavorite: (Int) -> Unit,
    onNavigateToAllBhajans: () -> Unit
) {
    LaunchedEffect(favoriteBhajans.isEmpty()) {
        if (favoriteBhajans.isEmpty()) {
            onNavigateToAllBhajans()
        }
    }

    Scaffold(
        containerColor = DevotionalColors.SoftCreamBackground,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "My Favorite Bhajans",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DevotionalColors.WarmCardSurface,
                    titleContentColor = DevotionalColors.DeepBrownText
                ),
                actions = {
                    Button(
                        onClick = onNavigateToAllBhajans,
                        modifier = Modifier.padding(end = 8.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = DevotionalColors.SaffronPrimary,
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = "All Bhajans",
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(
                items = favoriteBhajans,
                key = Bhajan::id
            ) { bhajan ->
                BhajanCard(
                    bhajan = bhajan,
                    isFavorite = true,
                    onPlayClick = { onPlayBhajan(bhajan) },
                    onToggleFavorite = { onToggleFavorite(bhajan.id) }
                )
            }
        }
    }
}

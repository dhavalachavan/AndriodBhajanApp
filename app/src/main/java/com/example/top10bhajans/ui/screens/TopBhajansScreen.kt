package com.example.top10bhajans.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.top10bhajans.data.Bhajan
import com.example.top10bhajans.ui.components.BhajanCard
import com.example.top10bhajans.ui.theme.DevotionalColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBhajansScreen(
    bhajans: List<Bhajan>,
    favoriteIds: Set<Int>,
    onPlayBhajan: (Bhajan) -> Unit,
    onToggleFavorite: (Int) -> Unit,
    onNavigateToFavorites: () -> Unit
) {
    Scaffold(
        containerColor = DevotionalColors.SoftCreamBackground,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Popular Bhajans",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DevotionalColors.WarmCardSurface,
                    titleContentColor = DevotionalColors.DeepBrownText
                ),
                actions = {
                    if (favoriteIds.isNotEmpty()) {
                        IconButton(
                            onClick = onNavigateToFavorites,
                            modifier = Modifier.size(48.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = "Jump to My Favorites",
                                tint = DevotionalColors.FavoriteRed,
                                modifier = Modifier.size(26.dp)
                            )
                        }
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
                items = bhajans,
                key = Bhajan::id
            ) { bhajan ->
                BhajanCard(
                    bhajan = bhajan,
                    isFavorite = favoriteIds.contains(bhajan.id),
                    onPlayClick = { onPlayBhajan(bhajan) },
                    onToggleFavorite = { onToggleFavorite(bhajan.id) }
                )
            }
        }
    }
}

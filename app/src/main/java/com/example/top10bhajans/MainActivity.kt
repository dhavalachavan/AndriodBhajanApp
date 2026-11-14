package com.example.top10bhajans

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.top10bhajans.data.Bhajan
import com.example.top10bhajans.data.BhajanRepository
import com.example.top10bhajans.data.FavoritesRepository
import com.example.top10bhajans.ui.screens.FavoritesScreen
import com.example.top10bhajans.ui.screens.PlayerScreen
import com.example.top10bhajans.ui.screens.TopBhajansScreen
import com.example.top10bhajans.ui.theme.DevotionalColors
import com.example.top10bhajans.ui.theme.Top10BhajansTheme
import kotlinx.coroutines.launch

sealed interface AppScreen {
    data object Favorites : AppScreen
    data object TopBhajans : AppScreen
    data class Player(val bhajan: Bhajan, val returnTo: AppScreen) : AppScreen
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val favoritesRepository = FavoritesRepository(applicationContext)

        setContent {
            Top10BhajansTheme {
                Top10BhajansApp(favoritesRepository = favoritesRepository)
            }
        }
    }
}

@Composable
fun Top10BhajansApp(favoritesRepository: FavoritesRepository) {
    val coroutineScope = rememberCoroutineScope()
    val favoriteIds by favoritesRepository.favoriteIdsFlow.collectAsState(initial = null)
    var currentScreen by remember { mutableStateOf<AppScreen?>(null) }

    LaunchedEffect(Unit) {
        val initialFavorites = favoritesRepository.getInitialFavorites()
        currentScreen = if (initialFavorites.isNotEmpty()) {
            AppScreen.Favorites
        } else {
            AppScreen.TopBhajans
        }
    }

    val activeScreen = currentScreen
    val resolvedFavorites = favoriteIds

    if ((activeScreen == null) || (resolvedFavorites == null)) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            CircularProgressIndicator(color = DevotionalColors.SaffronPrimary)
        }
        return
    }

    val onToggleFavorite: (Int) -> Unit = { bhajanId ->
        coroutineScope.launch {
            favoritesRepository.toggleFavorite(bhajanId)
        }
    }

    when (activeScreen) {
        is AppScreen.Favorites -> {
            val favoriteBhajans = BhajanRepository.top10Bhajans.filter { (id) ->
                resolvedFavorites.contains(id)
            }
            FavoritesScreen(
                favoriteBhajans = favoriteBhajans,
                onPlayBhajan = { bhajan ->
                    currentScreen = AppScreen.Player(
                        bhajan = bhajan,
                        returnTo = AppScreen.Favorites
                    )
                },
                onToggleFavorite = onToggleFavorite,
                onNavigateToAllBhajans = {
                    currentScreen = AppScreen.TopBhajans
                }
            )
        }

        is AppScreen.TopBhajans -> {
            TopBhajansScreen(
                bhajans = BhajanRepository.top10Bhajans,
                favoriteIds = resolvedFavorites,
                onPlayBhajan = { bhajan ->
                    currentScreen = AppScreen.Player(
                        bhajan = bhajan,
                        returnTo = AppScreen.TopBhajans
                    )
                },
                onToggleFavorite = onToggleFavorite,
                onNavigateToFavorites = {
                    currentScreen = AppScreen.Favorites
                }
            )
        }

        is AppScreen.Player -> {
            val navigateBack = {
                currentScreen = if (
                    activeScreen.returnTo == AppScreen.Favorites &&
                    resolvedFavorites.isEmpty()
                ) {
                    AppScreen.TopBhajans
                } else {
                    activeScreen.returnTo
                }
            }

            BackHandler(onBack = navigateBack)

            PlayerScreen(
                bhajan = activeScreen.bhajan,
                isFavorite = resolvedFavorites.contains(activeScreen.bhajan.id),
                onToggleFavorite = { onToggleFavorite(activeScreen.bhajan.id) },
                onBackClick = navigateBack
            )
        }
    }
}

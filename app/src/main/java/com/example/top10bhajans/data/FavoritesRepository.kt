package com.example.top10bhajans.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.bhajanDataStore: DataStore<Preferences> by preferencesDataStore(
    name = "top_10_bhajans_prefs"
)

class FavoritesRepository(private val context: Context) {

    private object Keys {
        val FAVORITE_IDS = stringSetPreferencesKey("favorite_bhajan_ids")
    }

    val favoriteIdsFlow: Flow<Set<Int>> = context.bhajanDataStore.data.map { prefs ->
        val rawIds = prefs[Keys.FAVORITE_IDS] ?: emptySet()
        rawIds.mapNotNull { it.toIntOrNull() }.toSet()
    }

    suspend fun getInitialFavorites(): Set<Int> {
        return favoriteIdsFlow.first()
    }

    suspend fun toggleFavorite(bhajanId: Int) {
        context.bhajanDataStore.edit { prefs ->
            val current = prefs[Keys.FAVORITE_IDS]?.toMutableSet() ?: mutableSetOf()
            val idString = bhajanId.toString()
            if (current.contains(idString)) {
                current.remove(idString)
            } else {
                current.add(idString)
            }
            prefs[Keys.FAVORITE_IDS] = current
        }
    }
}

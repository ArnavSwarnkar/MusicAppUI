package com.example.musicappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier


@Composable
fun BrowseView() {
    val categoriesWithImages = mapOf(
        "Hits" to "file:///android_asset/TopHitsImage.jpeg",
        "Happy" to "file:///android_asset/HappyMusicImage.jpeg",
        "Workout" to "file:///android_asset/WorkoutImage.jpeg",
        "Romantic" to "file:///android_asset/RomanticSongsImages.jpeg",
        "Party" to "file:///android_asset/PartySongsImages.jpeg",
        "Breakup" to "file:///android_asset/BreakupSongsImages.jpeg"
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff1a1a1a))
            .padding(8.dp)
    ) {
        items(categoriesWithImages.keys.toList()) { cat ->
            BrowserItem(
                cat = cat,
                imageUrl = categoriesWithImages[cat] ?: "")
        }
    }
}
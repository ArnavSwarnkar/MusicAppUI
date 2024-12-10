package com.example.musicappui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home() {
    val categoriesWithImages = mapOf(
        "Hits" to "file:///android_asset/TopHitsImage.jpeg",
        "Happy" to "file:///android_asset/HappyMusicImage.jpeg",
        "Workout" to "file:///android_asset/WorkoutImage.jpeg",
        "Romantic" to "file:///android_asset/RomanticSongsImages.jpeg",
        "Party" to "file:///android_asset/PartySongsImages.jpeg",
        "Breakup" to "file:///android_asset/BreakupSongsImages.jpeg"
    )

    val grouped = listOf("New Releases", "Top Rated", "Favourites").groupBy {
        it
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff1a1a1a))
    ) {
        grouped.forEach { (header, items) ->
            stickyHeader {
                Text(
                    text = header.toString(),
                    modifier = Modifier.padding(16.dp),
                    color = Color.White
                )
            }
            items(items) {
                LazyRow(
                    modifier = Modifier.padding(vertical = 8.dp)
                ) {
                    items(categoriesWithImages.keys.toList()) { cat ->
                        BrowserItem(
                            cat = cat,
                            imageUrl = categoriesWithImages[cat] ?: ""
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun BrowserItem(cat: String, imageUrl: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .size(150.dp),
            border = BorderStroke(3.dp, color = Color.Gray)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = imageUrl,
                    contentDescription = "Image for $cat",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        Text(
            text = cat,
            color = Color.White,
            modifier = Modifier.padding(top = 8.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Home()
}













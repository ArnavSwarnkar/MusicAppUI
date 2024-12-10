package com.example.musicappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Library() {
    LazyColumn(modifier = Modifier.fillMaxSize()
        .background(Color(0xff1a1a1a))) {
        items(libraries) {
            lib ->
            LibraryItem(lib = lib)
        }
    }
}


@Composable
fun LibraryItem(lib: Lib) {
    Column(modifier = Modifier.fillMaxSize()
        .background(Color(0xff1a1a1a))) {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Row {
                Icon(painter = painterResource(id = lib.icon),
                    contentDescription = lib.name,
                    modifier = Modifier.padding(horizontal = 8.dp),
                    tint = Color.White)
                Text(lib.name,
                    color = Color.White)
            }
            Icon(imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                tint = Color.White)
        }
        Divider(color = Color.LightGray)
    }
}


@Preview(showBackground = true)
@Composable
fun LibraryPreview() {
    Library()
}


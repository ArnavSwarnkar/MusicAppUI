package com.example.musicappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AccountView() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xff1a1a1a))) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Row() {
                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier.padding(end = 8.dp,
                        top = 4.dp),
                    tint = Color.White)
                Column() {
                    Text("Arnav Swarnkar",
                        color = Color.White,
                        modifier = Modifier.padding(top = 4.dp))
                    Text("@arnavswarnkar",
                        color = Color.White)
                }
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.AutoMirrored
                    .Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color.White)
            }
        }
        Row(modifier = Modifier.padding(top = 16.dp)) {
            Icon(painter = painterResource(
                id = R.drawable.baseline_music_note_24),
                contentDescription = "My music",
                modifier = Modifier.padding(end = 2.dp),
                tint = Color.White)
            Text("My Music",
                modifier = Modifier.padding(top = 3.dp),
                color = Color.White)
        }
        Divider()
    }
}

@Preview(showBackground = true)
@Composable
fun AccountPreview() {
    AccountView()
}









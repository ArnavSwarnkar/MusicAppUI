package com.example.musicappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.concurrent.Flow

@Composable
fun Subscription() {
    Column(modifier = Modifier.fillMaxSize()
        .background(Color(0xff1a1a1a)),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Manage Subscriptions",
            color = Color.White)
        Card(modifier = Modifier.padding(8.dp)
            .background(Color(0xff383838)),
            elevation = 4.dp) {
            Column(modifier = Modifier.background(Color(0xff383838))) {
                Column() {
                    Text("Musical",
                        color = Color.White,
                        modifier = Modifier.padding(start = 4.dp,
                            top = 4.dp))
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("free tier",
                            color = Color.White,
                            modifier = Modifier.padding(start = 4.dp))
                        TextButton(onClick = {}) {
                            Row {
                                Text("See all plans",
                                    color = Color.White)
                                Icon(imageVector = Icons.AutoMirrored
                                    .Filled.KeyboardArrowRight,
                                    contentDescription = "See all plans",
                                    tint = Color.White)
                            }
                        }
                    }
                }
                Divider(thickness = 1.dp,
                    modifier = Modifier.padding(horizontal = 8.dp))
                Row(modifier = Modifier.padding(vertical = 16.dp)) {
                    Icon(imageVector = Icons.Default.AccountBox,
                        contentDescription = "Get a plan",
                        tint = Color.White,
                        modifier = Modifier.padding(start = 4.dp))
                    Text("Get a plan",
                        color = Color.White,
                        modifier = Modifier.padding(start = 2.dp))
            }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SubscriptionPreview() {
    Subscription()
}













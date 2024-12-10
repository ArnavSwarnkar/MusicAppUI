package com.example.musicappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalDrawer
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AccountDialog(dialogOpen: MutableState<Boolean>) {
    val isFocused by remember { mutableStateOf(false) }
    if (dialogOpen.value) {
        AlertDialog(
            onDismissRequest = {
                dialogOpen.value = false
            },
            confirmButton = {
                TextButton(onClick = {
                    dialogOpen.value = false
                }) {
                    Text("Confirm",
                        color = Color(0xFF43d14a))
                }
            },
            dismissButton = {
                TextButton(onClick = {
                    dialogOpen.value = false
                }) {
                    Text("Dismiss",
                        color = Color(0xFF43d14a))
                }
            },
            title = {
                Text("Add account",
                    modifier = Modifier.padding(bottom = 16.dp),
                    color = Color.White)
            },
            text = {
                Column(modifier = Modifier
                    .padding(top = 8.dp, bottom = 4.dp)) {
                    TextField(value = "", onValueChange = {},
                        modifier = Modifier.padding(top = 8.dp),
                        label = {
                            Text("Email")
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            cursorColor = Color.Gray,
                            focusedIndicatorColor = Color.Gray,
                            focusedLabelColor = Color.Gray,
                            backgroundColor = Color(0xff383838)
                        ))

                    TextField(value = "", onValueChange = {},
                        modifier = Modifier.padding(top = 20.dp),
                        label = {
                            Text("Password")
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            cursorColor = Color.Gray,
                            focusedIndicatorColor = Color.Gray,
                            focusedLabelColor = Color.Gray,
                            backgroundColor = Color(0xff383838)
                        ))
                }
            },
            modifier = Modifier.clip(RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .background(Color(0xFF43D14A))
                .padding(8.dp),
            shape = RoundedCornerShape(12.dp),
            backgroundColor = Color(0xff1a1a1a),
            properties = DialogProperties(
                dismissOnClickOutside = true,
                dismissOnBackPress = true
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AccountDialogPreview() {
    AccountDialog(dialogOpen = remember { mutableStateOf(true) })
}


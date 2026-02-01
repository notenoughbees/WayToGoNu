package com.example.waytogonu.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen(onOpenSettings: () -> Unit) {

    Column {
        Text("Main")

        Button(
            onClick = {
                onOpenSettings()
            }
        ) { Text(text = "go to settings screen") }
    }

}
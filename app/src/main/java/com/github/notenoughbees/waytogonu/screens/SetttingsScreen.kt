package com.github.notenoughbees.waytogonu.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SettingsScreen(onOpenMain: () -> Unit) {

    Column {
        Text("Settings")

        Button(
            onClick = {
                onOpenMain()
            }
        ) { Text(text = "go to main screen") }
    }

}
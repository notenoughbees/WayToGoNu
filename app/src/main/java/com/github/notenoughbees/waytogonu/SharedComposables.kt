package com.github.notenoughbees.waytogonu

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.github.notenoughbees.waytogonu.ui.theme.TopAppBarColour

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(content: String, textStyle: TextStyle?) {
    CenterAlignedTopAppBar(
        modifier = Modifier.height(50.dp),
        title = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center // centre the text vertically
            ) {
                Text(
                    text = content,
                    style = textStyle ?: MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center, // centre the text horizontally
                )
            }
        },
        colors = TopAppBarDefaults.largeTopAppBarColors(
            containerColor = TopAppBarColour,
            titleContentColor = Color.White
        )
    )
}

package com.github.notenoughbees.waytogonu.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.notenoughbees.waytogonu.R

@Composable
fun MainScreen(onOpenSettings: () -> Unit) {

    val rectRadius = 32.dp
    val margin = 16.dp

    Column(
        modifier = Modifier
            .padding(50.dp),
        verticalArrangement = Arrangement.spacedBy(margin),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .weight(0.2f), //height
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = stringResource(R.string.app_name) + "!",
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f),
            shape = RoundedCornerShape(rectRadius),
            onClick = { onOpenSettings() }
        ) {
            Text(
                text = stringResource(R.string.main_start_drive),
                style = MaterialTheme.typography.headlineMedium,
                fontSize = (MaterialTheme.typography.headlineMedium.fontSize.value + 4).sp,
                textAlign = TextAlign.Center
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f),
            shape = RoundedCornerShape(rectRadius),
            onClick = { onOpenSettings() }
        ) {
            Text(
                text = stringResource(R.string.main_create_route),
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center
            )
        }

        Row(
            modifier = Modifier
                .weight(0.2f), //height
            horizontalArrangement = Arrangement.spacedBy(margin),
        ) {
            Button(
                modifier = Modifier
                    .weight(0.5f) //width
                    .fillMaxHeight(),
                shape = RoundedCornerShape(rectRadius),
                contentPadding = PaddingValues(
                    horizontal = 12.dp, // decrease default padding so the text fits
                ),
                onClick = { onOpenSettings() }
            ) {
                Text(
                    text = stringResource(R.string.main_routes_list),
                    style = MaterialTheme.typography.headlineMedium,
                    fontSize = (MaterialTheme.typography.headlineMedium.fontSize.value - 4).sp,
                    textAlign = TextAlign.Center
                )
            }
            Button(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxHeight(),
                shape = RoundedCornerShape(rectRadius),
                onClick = { onOpenSettings() }
            ) {
                Text(
                    text = stringResource(R.string.main_driving_log),
                    style = MaterialTheme.typography.headlineMedium,
                    fontSize = (MaterialTheme.typography.headlineMedium.fontSize.value - 4).sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        Row(
            modifier = Modifier
                .weight(0.1f)
        ) {
            IconButton(
                onClick = { onOpenSettings() },
                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(1f) // square button
            ) {
                Icon(
                Icons.Filled.Settings,
                null,
                    modifier = Modifier
                        .fillMaxSize(),
                    tint = MaterialTheme.colorScheme.primary // foreground colour
                )
            }
        }
    }
}
package com.github.notenoughbees.waytogonu.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.github.notenoughbees.waytogonu.BuildConfig
import com.github.notenoughbees.waytogonu.MyTopAppBar
import com.github.notenoughbees.waytogonu.R
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun SettingsScreen(onOpenMain: () -> Unit) {
    Scaffold(
        topBar = {
            Box(modifier = Modifier.statusBarsPadding()) { // don't do edge-to-edge for top bar
                MyTopAppBar(stringResource(R.string.settings_title), null)
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Button(
                onClick = {
                    onOpenMain()
                }
            ) { Text(text = "go to main screen") }

            AppInstallTimestamp()
        }
    }
}


@Composable
fun AppInstallTimestamp() {
    val context = LocalContext.current
    val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)

    val installTime = packageInfo.firstInstallTime // updates each time we reinstall app
    val buildTime = Date(BuildConfig.BUILD_TIME) // updates each time we rebuild the app

    val formattedInstallTime = SimpleDateFormat("yyyy-MM-dd\tHH:mm", Locale.getDefault()).format(Date(installTime))
    val formattedBuildTime = SimpleDateFormat("yyyy-MM-dd\tHH:mm", Locale.getDefault()).format(buildTime)

    Text(
        text = "app last installed:\t$formattedInstallTime",
        style = MaterialTheme.typography.labelSmall,
        color = Color(31, 191, 31)
    )
    Text(
        text = "app last built:\t\t\t\t$formattedBuildTime",
        style = MaterialTheme.typography.labelSmall,
        color = Color(31, 255, 31)
    )
}
package com.example.waytogonu.nav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.waytogonu.screens.MainScreen
import com.example.waytogonu.screens.SettingsScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    val navActions = remember(navController) { NavActions(navController) }

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            MainScreen(
                onOpenSettings = { navActions.navigateToSettings() }
            )
        }

        composable(route = Screen.Settings.route) {
            SettingsScreen(
                onOpenMain = { navActions.navigateToMain() }
            )
        }
    }
}
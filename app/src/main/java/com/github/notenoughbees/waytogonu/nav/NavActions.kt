package com.github.notenoughbees.waytogonu.nav

import androidx.navigation.NavHostController

class NavActions(private val navController: NavHostController) {
    val navigateToMain: () -> Unit = {
        navController.navigate(Screen.Home.route) {
            popUpTo(Screen.Home.route) { inclusive = true }
            launchSingleTop = true
            restoreState = true
        }
    }

    val navigateToSettings: () -> Unit = {
        navController.navigate(Screen.Settings.route) {
            launchSingleTop = true
        }
    }
}
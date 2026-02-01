package com.example.waytogonu.nav

// single source of truth for routes & route builders
sealed class Screen(val route: String) {
    data object Home: Screen("home")
    data object Settings: Screen("settings")
}
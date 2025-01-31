package com.example.interactive.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
//        composable("home") { HomeScreen(navController) }
//        composable("team") { TeamScreen(navController) }
//        composable("players") { PlayersScreen(navController) }
    }
}
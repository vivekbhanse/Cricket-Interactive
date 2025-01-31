package com.example.interactive.presentation.navgraph

sealed class Route(val route: String) {

    object HomeScreen : Route(route = "homeScreen")
    object DetailsScreen : Route(route = "detailsScreen")


}
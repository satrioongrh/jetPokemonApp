package com.example.jetpokedexapp.ui.screen.navigation

sealed class Screen (val route: String){
    object Home : Screen("home")
    object Detail : Screen("Detail")
}
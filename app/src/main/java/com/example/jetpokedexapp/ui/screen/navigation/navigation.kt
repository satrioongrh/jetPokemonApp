package com.example.jetpokedexapp.ui.screen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpokedexapp.data.viewmodel.PokemonListViewModel
import com.example.jetpokedexapp.ui.screen.home.HomeScreen

@Composable
fun Navigation() {
    val viewModel = hiltViewModel<PokemonListViewModel>()
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable(
            route = ("${Screen.Detail.route}/{Color}/{pokemonName}"),
            arguments = listOf(
                navArgument("Color") {
                    type = NavType.IntType
                },
                navArgument("pokemonName") {
                    type = NavType.StringType
                }
            )) {
            val dominantColor = remember {
                val color = it.arguments?.getInt("Color")
                color?.let { Color(it) ?: Color.White }
            }
            val pokemonName = remember {
                it.arguments?.getString("pokemonName")
            }
        }
    }

}
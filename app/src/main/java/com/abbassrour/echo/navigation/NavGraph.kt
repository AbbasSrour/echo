package com.abbassrour.echo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abbassrour.echo.screens.LoginInstanceScreen
import com.abbassrour.echo.screens.LoginScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavRoute.LoginInstance.path) {
        composable(NavRoute.Login.path) {
            LoginScreen(navController = navController)
        }

        composable(NavRoute.LoginInstance.path) {
            LoginInstanceScreen(navController = navController)
        }

    }
}
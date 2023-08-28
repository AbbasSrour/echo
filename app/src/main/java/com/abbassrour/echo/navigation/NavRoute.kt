package com.abbassrour.echo.navigation

sealed class NavRoute(val path: String) {

    object Home : NavRoute("home")

    object Login : NavRoute("login")
    object LoginInstance : NavRoute("loginInstance")

    object NotFound : NavRoute("notFound")

    fun fromPath(path: String): NavRoute {
        return when (path) {
            Home.path -> Home
            Login.path -> Login
            else -> NotFound
        }
    }

    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
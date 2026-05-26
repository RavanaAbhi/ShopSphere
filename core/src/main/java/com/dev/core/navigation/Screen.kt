package com.dev.core.navigation

sealed class Screen(
    val route: String
) {

    data object Login : Screen("login")

    data object Home : Screen("home")

    data object Product : Screen("product")

    data object Cart : Screen("cart")

    data object Search : Screen("search")
}
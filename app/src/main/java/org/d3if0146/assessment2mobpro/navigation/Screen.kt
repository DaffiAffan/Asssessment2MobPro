package org.d3if0146.assessment2mobpro.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("mainScreen")
    data object  FormBaru:Screen("detailScreen")
}
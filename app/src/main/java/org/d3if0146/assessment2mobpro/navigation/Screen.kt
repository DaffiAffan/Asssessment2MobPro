package org.d3if0146.assessment2mobpro.navigation

import org.d3if0146.assessment2mobpro.ui.screen.KEY_ID_MOBIL



sealed class Screen(val route: String) {
    data object Home : Screen("mainScreen")
    data object  FormBaru:Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_MOBIL}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}
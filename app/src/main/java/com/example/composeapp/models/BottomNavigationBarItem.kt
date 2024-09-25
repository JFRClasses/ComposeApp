package com.example.composeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.core.graphics.rotationMatrix

data class BottomNavigationBarItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    companion object {
        val items = listOf(
            BottomNavigationBarItem(route = "home", title = "Home", icon = Icons.Default.Home),
            BottomNavigationBarItem(
                route = "calendar",
                title = "Calendar",
                icon = Icons.Default.DateRange
            ),
            BottomNavigationBarItem(
                route = "settings",
                title = "Settings",
                icon = Icons.Default.Settings
            ),
            BottomNavigationBarItem(
                route = "list",
                title = "List",
                icon = Icons.Default.Menu
            ),
            BottomNavigationBarItem(
                route = "layout",
                title = "Layout",
                icon = Icons.Default.CheckCircle
            )
        )
    }
}

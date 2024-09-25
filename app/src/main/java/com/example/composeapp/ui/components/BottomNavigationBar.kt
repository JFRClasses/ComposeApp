package com.example.composeapp.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.example.composeapp.models.BottomNavigationBarItem

@Composable
fun BottomNavigationBarItem(navController: NavController){
    NavigationBar {
        var selectedBottomItem by remember {
            mutableStateOf(0)
        }
        BottomNavigationBarItem.items.forEachIndexed { index, bottomNavigationBarItem ->
            NavigationBarItem(
                selected = selectedBottomItem == index,
                onClick = {
                    selectedBottomItem = index
                    navController.navigate(bottomNavigationBarItem.route)
                },
                label = {
                    Text(bottomNavigationBarItem.title)
                },
                icon = {
                    Icon(
                        imageVector = bottomNavigationBarItem.icon,
                        contentDescription = bottomNavigationBarItem.title
                    )
                })
        }
    }
}
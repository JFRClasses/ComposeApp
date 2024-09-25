package com.example.composeapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController){
    var heroId = 10
    Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally ) {
        Text(text = "Home Screen")
        Row {
            Button(onClick = { navController.navigate("settings/$heroId") }) {
                Text(text = "Navegar a Settings")        }
            Button(onClick = { navController.navigate("calendar") })
            {
                Text(text = "Navegar a Calendar")
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview(){
    val navController = rememberNavController()
    HomeScreen(navController)
}
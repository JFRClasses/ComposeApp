package com.example.composeapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListScreen() {
    val productList = listOf("Hamburguesa", "Pizza", "Tacos", "Sushi", "Ensalada")
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(productList) { product ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
                    .clickable {
                        print("Product clicked $product")
                    }) {
                Icon(imageVector = Icons.Default.List, contentDescription = "Product icon")
                Text(text = product, modifier = Modifier.padding(8.dp))
            }
        }
    }
}
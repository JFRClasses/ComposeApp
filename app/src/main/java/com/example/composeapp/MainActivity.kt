package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        CardWithImage()
                    }
                }
            }
        }
    }
}

@Composable
fun MyColumn() {
//    Column(modifier = Modifier.fillMaxSize()) {
//        Text("Ejemplo 1", modifier = Modifier.background(Color.Red).weight(1f))
//        Text("Ejemplo 2", modifier = Modifier.background(Color.Black).weight(1f))
//        Text("Ejemplo 3", modifier = Modifier.background(Color.Cyan).weight(1f))
//    }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text("Ejemplo 21", modifier = Modifier.background(Color.Red))
        Text("Ejemplo 2", modifier = Modifier.background(Color.Black))
        Text("Ejemplo 3", modifier = Modifier.background(Color.Cyan))
    }


}

@Composable
fun MyRow() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .horizontalScroll(
            rememberScrollState()
        )) {
//        Text("Ejemplo 1", modifier = Modifier
//            .background(Color.Red)
//            .weight(1f))
//        Text("Ejemplo 2", modifier = Modifier
//            .background(Color.Black)
//            .weight(1f))
//        Text("Ejemplo 3", modifier = Modifier
//            .background(Color.Cyan)
//            .weight(1f))

        Text(
            "Ejemplo 1", modifier = Modifier
                .background(Color.Red)
                .width(100.dp)
        )
        Text(
            "Ejemplo 2", modifier = Modifier
                .background(Color.Black)
                .width(100.dp)
        )
        Text(
            "Ejemplo 3", modifier = Modifier
                .background(Color.Cyan)
                .width(100.dp)
        )
        Text(
            "Ejemplo 2", modifier = Modifier
                .background(Color.Black)
                .width(100.dp)
        )
        Text(
            "Ejemplo 3", modifier = Modifier
                .background(Color.Cyan)
                .width(100.dp)
        )

    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Cyan)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            Text("Hola a todos como se encuentran")
        }
    }
}


@Composable
fun MyList() {
    val productList = listOf("Hamburguesa", "Pizza", "Tacos", "Sushi", "Ensalada")
    LazyColumn(modifier = Modifier.fillMaxSize()){
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

@Composable
fun MyComplexLayout(){
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier= Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan)) {

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Yellow), contentAlignment = Alignment.BottomEnd) {
                Text("Hola a todos")
            }
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Green), contentAlignment = Alignment.Center) {
                Text("Hola a todos")
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Magenta)) {

        }
    }

}
@Composable
fun MyAdvancedComplexLayoutWithoutCards() {
    val foodList = listOf("Hamburguesa","Pizza","Tacos","Sushi","Ensalada", "Hot Dogs", "Lasagna")
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        // Encabezado
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text("Encabezado", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }


        // Filas con diferentes elementos
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            // Caja 1
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Caja 1", fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = { /* Acción del botón */ }) {
                        Text("Acción")
                    }
                }
            }

            // Caja 2
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Caja 2", fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = { /* Acción del botón */ }) {
                        Text("Acción")
                    }
                }
            }
        }

        // Lista de elementos
        Column(
            modifier = Modifier
                .weight(1f)
                .background(Color.LightGray)
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("Lista de Elementos", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            LazyColumn {
                items(foodList) { index ->
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(Color.LightGray)
                            .fillMaxWidth()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.DateRange,
                                contentDescription = index,
                            )
                            Text(
                                index,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }

        // Pie de página
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text("Pie de página", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun MyStateExample(){
    // var counter = 0
     val counter = remember { mutableStateOf(0) }
    // val coutner = rememberSaveable { mutableStateOf(0) }
    //var counter by remember { mutableIntStateOf(0) }
    Column(Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("El valor del contador es: ${counter.value}")
        Button(onClick = { counter.value ++ }) {
            Text("Incrementar")
        }
    }
}

@Composable
fun CardWithImage() {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()

    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = "https://static.wikia.nocookie.net/doblaje/images/a/ad/Marvel_Super_Hero_Adventures.png/revision/latest?cb=20240215235222&path-prefix=es"),
                contentDescription = "Loaded from internet",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Image Loaded from Internet",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview(
    name = "Preview 1 Guay",
    showBackground = true,
    showSystemUi = true,
    device = Devices.NEXUS_5
)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        CardWithImage()
    }
}
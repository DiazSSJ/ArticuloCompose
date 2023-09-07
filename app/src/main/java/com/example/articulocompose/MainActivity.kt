package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulocompose.ui.theme.ArticuloComposeTheme
import java.security.MessageDigest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticuloApp()
                }
            }
        }
    }
}

@Composable
fun ArticuloApp (){
    ArticuloCard(titulo = "Jetpack Compose tutorial",
        parrafo1= stringResource(R.string.parrafo1),
        parrafo2= stringResource(R.string.parrafo2),
        imagenPainter = painterResource(R.drawable.bg_compose_background )
    )
}


@Composable
fun ArticuloCard(
    titulo: String,
    parrafo1: String,
    parrafo2: String,
    imagenPainter: Painter,
    modifier: Modifier = Modifier) {

    Column (modifier = modifier){
        Image(
            painter = imagenPainter,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = titulo,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = parrafo1,
            modifier = Modifier.padding(
                start =16.dp,
                end = 16.dp
            ),
            textAlign = TextAlign.Justify
        )
        Text(
            text = parrafo2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )


    }
}



@Preview(showBackground = true)
@Composable
fun ArticuloPreview() {
    ArticuloComposeTheme {
        ArticuloApp()
    }
}
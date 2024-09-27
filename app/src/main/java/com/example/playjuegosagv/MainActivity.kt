package com.example.playjuegosagv

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.playjuegosagv.ui.theme.PlayJuegosAGVTheme
import com.example.playjuegosagv.ui.theme.PurpleAplicacion

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlayJuegosAGVTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    PantallaInicio( name = "Android")
                }
            }
        }
    }
}


@Composable
fun PantallaInicio(name: String) {

    Text(text = "Play Juegos", color = Color.Black)

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center){
        Box(modifier = Modifier.weight(1f).background(Color(0xFF6200EE)),
            contentAlignment = Alignment.Center)
        {
            Text(text = "Play", color = Color.White)
        }
        Box(modifier = Modifier.weight(1f).background(Color(0xFF6200EE)),
            contentAlignment = Alignment.Center)
        {
            Text(text = "New Player", color = Color.White)
        }
        Box(modifier = Modifier.weight(1f).background(Color(0xFF6200EE)),
            contentAlignment = Alignment.Center)
        {
            Text(text = "Preferences", color = Color.White)
        }
        Box(modifier = Modifier.weight(1f).background(Color(0xFF6200EE)),
            contentAlignment = Alignment.Center)
        {
            Text(text = "About", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlayJuegosAGVTheme {
        PantallaInicio("Android")
    }
}
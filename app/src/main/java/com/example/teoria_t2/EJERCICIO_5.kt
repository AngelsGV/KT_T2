package com.example.teoria_t2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.teoria_t2.ui.theme.Teoria_T2Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Teoria_T2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MyBox(name = "Android")
                }
                }
            }
        }
    }


@Composable
fun MyBox(name: String){
    Box( modifier= Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
            .width(80.dp)
            .height(30.dp)
            .background(Color.Cyan)
            .verticalScroll(
                rememberScrollState()
            )){
        Text(text = "Esto es un texto")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MyBoxPreview() {
    Teoria_T2Theme {
        MyBox(name = "Preview Text") // Llamada al componente con valor por defecto para el preview
    }
}

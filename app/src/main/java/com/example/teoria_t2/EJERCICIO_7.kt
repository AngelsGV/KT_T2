package com.example.teoria_t2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.teoria_t2.ui.theme.Teoria_T2Theme

@Composable
fun MyColumn(name: String){
    Column( modifier= Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround){
        Text(text = "linea 1", modifier = Modifier.background(Color.Red))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan))
        Text(text = "linea 2", modifier = Modifier.background(Color.Gray))
        Text(text = "linea 4", modifier = Modifier.background(Color.Green))

    }
}


@Preview(showBackground = true)
@Composable
fun MyColumnPreview() {
    Teoria_T2Theme {
        MyColumn(name = "Preview Text") // Llamada al componente con valor por defecto para el preview
    }
}
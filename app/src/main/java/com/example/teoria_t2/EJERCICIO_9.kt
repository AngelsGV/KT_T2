package com.example.teoria_t2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyColumn(){
    Column( modifier= Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween){
        Text(text = "linea 1", modifier = Modifier.background(Color.Red)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Gray)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 4", modifier = Modifier.background(Color.Green)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 1", modifier = Modifier.background(Color.Red)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Gray)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 4", modifier = Modifier.background(Color.Green)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 1", modifier = Modifier.background(Color.Red)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Gray)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 4", modifier = Modifier.background(Color.Green)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 1", modifier = Modifier.background(Color.Red)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 2", modifier = Modifier.background(Color.Gray)
            .fillMaxWidth().height(100.dp))
        Text(text = "linea 4", modifier = Modifier.background(Color.Green)
            .fillMaxWidth().height(100.dp))

    }
}


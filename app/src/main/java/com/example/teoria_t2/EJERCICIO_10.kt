package com.example.teoria_t2

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.teoria_t2.ui.theme.Teoria_T2Theme


@Composable
fun MyRow(name: String){
    Row( modifier= Modifier.fillMaxSize().horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Start){
        Text(text = "linea 1", modifier = Modifier.background(Color.Red))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan))
        Text(text = "linea 3", modifier = Modifier.background(Color.Gray))
        Text(text = "linea 4", modifier = Modifier.background(Color.Green))
        Text(text = "linea 1", modifier = Modifier.background(Color.Red))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan))
        Text(text = "linea 3", modifier = Modifier.background(Color.Gray))
        Text(text = "linea 4", modifier = Modifier.background(Color.Green))
        Text(text = "linea 1", modifier = Modifier.background(Color.Red))
        Text(text = "linea 2", modifier = Modifier.background(Color.Cyan))

    }
}


@Preview(showBackground = true)
@Composable
fun MyRowPreview() {
    Teoria_T2Theme {
        MyRow(name = "Preview Text")
    }
}
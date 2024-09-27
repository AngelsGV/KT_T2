package com.example.teoria_t2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyComplexLayout11() {
    Column (Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f).background(Color.Red),
            contentAlignment = Alignment.Center){
            Text(text = "Texto prueba 1")
        }
        Box(modifier = Modifier.weight(1f).background(Color.DarkGray),
            contentAlignment = Alignment.Center){
            Text(text = "Texto prueba 2")
        }
    }
}

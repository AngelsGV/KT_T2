package com.example.teoria_t2

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun pruebaTexto() {
    Text(text = "Prueba de preview", modifier = Modifier.fillMaxSize().padding(end=20.dp))
}

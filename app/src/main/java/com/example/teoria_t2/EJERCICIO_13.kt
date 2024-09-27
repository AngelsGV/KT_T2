package com.example.teoria_t2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyComplexLayout13(){
    Column( modifier= Modifier.fillMaxSize() ){
        Box(
            Modifier.fillMaxSize().weight(1f).background(Color.Cyan),
            contentAlignment = Alignment.TopCenter){
            Text(text = "Texto prueba 1", color = Color.Black)
        }
        Spacer(modifier = Modifier.width(5.dp).height(30.dp))

        Row(Modifier.fillMaxSize().weight(1f)){
            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(Color.Red),
                contentAlignment = Alignment.Center){
                Text(text = "Texto prueba 2", color = Color.Green)
            }
            Spacer(modifier = Modifier.width(30.dp).height(5.dp))

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(Color.DarkGray),
                contentAlignment = Alignment.CenterEnd){
                Text(text = "Texto prueba 3", color = Color.White)
            }
        }
        Spacer(modifier = Modifier.width(5.dp).height(30.dp))

        Box(
            Modifier.fillMaxSize().weight(1f).background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter){
            Text(text = "Texto prueba 1", color = Color.Yellow)

        }

    }
}

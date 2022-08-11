package com.chalilayang.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    Button(
        modifier = Modifier.padding(vertical = 40.dp),
        onClick = { text = "Hello, ${getPlatformName()}" }
    ) {
        Text(text, color = Color.Blue, fontSize = 56.sp)
    }
}

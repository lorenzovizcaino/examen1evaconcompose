package com.example.examen1evaconcompose.ui.screens

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myTextField(number: String, function: (String) -> Unit, operando: String) {
    TextField(
        value = number,
        onValueChange = function,
        label = { Text(operando) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}
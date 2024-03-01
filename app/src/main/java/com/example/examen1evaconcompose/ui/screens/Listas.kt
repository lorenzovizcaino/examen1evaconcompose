package com.example.examen1evaconcompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext

@Composable
fun Listas(viewModel: LoginViewModel) {
    val items = List(20) { "Lista ${it + 1}" }
    val context= LocalContext.current
    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally){
        items(items){
            Button(onClick = { showToast2("has pulsado el boton $it",context) }) {
                Text(text = "Boton $it")
            }
        }
    }
    

}
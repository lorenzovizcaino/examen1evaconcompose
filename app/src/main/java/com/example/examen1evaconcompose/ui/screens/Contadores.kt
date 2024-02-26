package com.example.examen1evaconcompose.ui.screens

import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Contadores(viewModel: LoginViewModel) {
    Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround){
        Text(modifier = Modifier.fillMaxWidth().padding(end = 50.dp), text = viewModel.usuario, textAlign = TextAlign.End)
        Row(modifier=Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically){
            Button(onClick = { viewModel.sumarLike1() }) {
                Text(text = "Like 1")
            }
            Text(text = viewModel.like1.toString())
            Icon(Icons.Default.Close, contentDescription = "Aspa", tint = Color.Red,modifier = Modifier.size(50.dp).clickable {
                if(viewModel.like1>0) viewModel.restarLike1()
            })
        }

        Row(modifier=Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically){
            Button(onClick = { viewModel.sumarLike2() }) {
                Text(text = "Like 2")
            }
            Text(text = viewModel.like2.toString())
            Icon(Icons.Default.Close, contentDescription = "Aspa", tint = Color.Red,modifier = Modifier.size(50.dp).clickable {
                if(viewModel.like2>0) viewModel.restarLike2()
            })
        }

        Row(modifier=Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically){
            Text(text = "Likes")
            Text(text = (viewModel.like1+viewModel.like2).toString())
            Icon(Icons.Default.CheckCircle, contentDescription = "Verificado", tint = Color.Blue,modifier = Modifier.size(50.dp))
        }
    }
}

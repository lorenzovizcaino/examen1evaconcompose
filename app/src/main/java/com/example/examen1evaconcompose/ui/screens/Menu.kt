package com.example.examen1evaconcompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController





@Composable
fun Menu(navController: NavController,viewModel: LoginViewModel){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        myTextField(number = viewModel.usuario, function = {viewModel.ObtenerUsuario(it)}, operando ="Usuario" )
        myTextField(number = viewModel.password, function = {viewModel.ObtenerPassword(it)}, operando ="Contraseña" )
        Text(text = "Ver Contraseña")
        Button(onClick = { viewModel.ValidarDatos() }) {
            Text(text = "Entrar")
        }
        Text(text = "Registrarse")

    }
}
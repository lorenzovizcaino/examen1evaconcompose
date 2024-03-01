package com.example.examen1evaconcompose.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.examen1evaconcompose.ui.miscompose.EspacioH
import com.example.examen1evaconcompose.ui.miscompose.myTextField
import com.example.examen1evaconcompose.ui.miscompose.myTextFieldPass
import com.example.examen1evaconcompose.ui.navigation.Screens


@Composable
fun Menu(navController: NavController, viewModel: LoginViewModel) {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        myTextField(
            number = viewModel.usuario,
            function = { viewModel.ObtenerUsuario(it) },
            operando = "Usuario"
        )
        myTextFieldPass(
            number = viewModel.password,
            function = { viewModel.ObtenerPassword(it) },
            operando = "Contraseña",
            viewModel.PasswordVisible
        )
        EspacioH(30)
        Text(
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 60.dp)
                .clickable {
                           viewModel.verOcultarPassword()
                },
            text = if(viewModel.PasswordVisible) "Ocultar contraseña" else "Ver contraseña",

        )
        EspacioH(30)
        Button(modifier = Modifier
            .align(Alignment.End)
            .padding(end = 60.dp), onClick = {
            viewModel.ValidarDatos()
            if (viewModel.banderaAceso) {
                navController.navigate(route = Screens.Contadores.route)

            } else {
                showToast2(string = "Datos invalidos", context = context)
            }
        }) {
            Text(text = "Entrar")

        }
        EspacioH(30)
        Text(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 60.dp).clickable {
                    navController.navigate(route = Screens.Registro.route)
                }, text = "Registrarse",
        )

    }
}

fun showToast2(string: String, context: Context) {

    Toast.makeText(context, string, Toast.LENGTH_SHORT).show()

}
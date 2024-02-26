package com.example.examen1evaconcompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun Registro(viewModel: LoginViewModel) {
    var context= LocalContext.current
    Column(modifier = Modifier.padding(top = 180.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {
        myTextField(number = viewModel.usuario, function ={viewModel.ObtenerUsuario(it)} , operando ="Usuario" )
        myTextFieldPass(number = viewModel.password, function ={viewModel.ObtenerPassword(it)} , operando ="Contraseña",viewModel.PasswordVisible )
        Text(modifier = Modifier
            .align(Alignment.End)
            .padding(end = 50.dp).clickable {
                      viewModel.verOcultarPassword()
            },
            text = if(viewModel.PasswordVisible) "Ocultar contraseña" else "Ver contraseña",

        )
        myTextFieldPass(number = viewModel.password2, function ={viewModel.ObtenerPassword2(it)} , operando ="Repite contraseña", viewModel.PasswordVisible )
        Button(modifier = Modifier
            .align(Alignment.End)
            .padding(end = 50.dp),onClick = {
            viewModel.ValidarRegistro()
            if(viewModel.banderaRegistro){
                showToast2(string = "Registro realizado correctamente", context = context)
            }else{
                showToast2(string = "Datos incorrectos, Registro no realizado", context = context)
            }

        }) {
            Text(text = "Registrar")
        }
        
    }
}



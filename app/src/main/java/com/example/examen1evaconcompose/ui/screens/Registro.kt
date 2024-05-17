package com.example.examen1evaconcompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.examen1evaconcompose.ui.navigation.Screens


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Registro(navController: NavHostController, viewModel: LoginViewModel) {
    var context= LocalContext.current
    Column(modifier = Modifier.padding(top = 180.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {
        TextField(value = viewModel.usuario,
            onValueChange = { viewModel.ObtenerUsuario(it) },
            label={
                Text(text = "Usuario")
            },
            keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Email)
        )
        //myTextField(number = viewModel.usuario, function ={viewModel.ObtenerUsuario(it)} , operando ="Usuario" )

        TextField(value = viewModel.password,
            onValueChange = { viewModel.ObtenerPassword(it) },
            label={
                Text(text = "Contraseña")
            },
            visualTransformation =
            if(viewModel.PasswordVisible) VisualTransformation.None
            else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType=KeyboardType.Password)

        )

        //myTextFieldPass(number = viewModel.password, function ={viewModel.ObtenerPassword(it)} , operando ="Contraseña",viewModel.PasswordVisible )
        Text(modifier = Modifier
            .align(Alignment.End)
            .padding(end = 50.dp).clickable {
                      viewModel.verOcultarPassword()
            },
            text = if(viewModel.PasswordVisible) "Ocultar contraseña" else "Ver contraseña",

        )
        TextField(value = viewModel.password2,
            onValueChange = { viewModel.ObtenerPassword2(it) },
            label={
                Text(text = "Repite contraseña")
            },
            visualTransformation =
            if(viewModel.PasswordVisible) VisualTransformation.None
            else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType=KeyboardType.Password)

        )
        //myTextFieldPass(number = viewModel.password2, function ={viewModel.ObtenerPassword2(it)} , operando ="Repite contraseña", viewModel.PasswordVisible )
        Button(modifier = Modifier
            .align(Alignment.End)
            .padding(end = 50.dp),onClick = {
            viewModel.ValidarRegistro()
            if(viewModel.banderaRegistro){
                showToast2(string = "Registro realizado correctamente", context = context)
                navController.navigate(route=Screens.Menu.route)
            }else{
                showToast2(string = "Datos incorrectos, Registro no realizado", context = context)
            }

        }) {
            Text(text = "Registrar")
        }
        
    }
}



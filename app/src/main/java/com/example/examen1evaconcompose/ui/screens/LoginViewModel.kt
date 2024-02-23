package com.example.examen1evaconcompose.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    var usuario by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set

    var bandera by mutableStateOf(false)
        private set

    fun ObtenerUsuario(user:String){
        this.usuario=user
    }

    fun ObtenerPassword(pass:String){
        this.password=pass
    }


    fun ValidarDatos(){

        var booluser=false
        var boolpass=false
        if(usuario.isNotEmpty()) booluser=true

        if(password.isEmpty()) boolpass=false
        else if(password.length<6)
        else boolpass=true;

        if(booluser && boolpass){
           bandera=true


        }

    }

    fun showToast(string: String, context: Context) {

        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()

    }


}
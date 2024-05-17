package com.example.examen1evaconcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examen1evaconcompose.ui.screens.Contadores
import com.example.examen1evaconcompose.ui.screens.LoginViewModel
import com.example.examen1evaconcompose.ui.screens.Menu
import com.example.examen1evaconcompose.ui.screens.Registro

@Composable
fun Navigation() {
    val navController = rememberNavController() //linea para recordar NavController entre pantallas
    val viewModel=remember{LoginViewModel()} //linea para recordar viewModel entre pantallas
    NavHost(navController, startDestination = Screens.Menu.route) {
        //pantalla principal con la navegación
        composable(route = Screens.Menu.route) {
            Menu(navController, viewModel) }//Nombre del fichero .kt al que navegar

        composable(route = Screens.Contadores.route) {
            Contadores(viewModel) //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.Registro.route) {
            Registro(navController,viewModel) //Nombre de la función composable a la que navegar
        }


    }
}
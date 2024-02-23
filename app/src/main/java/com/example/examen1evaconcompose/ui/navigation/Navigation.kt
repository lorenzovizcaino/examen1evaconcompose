package com.example.examen1evaconcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examen1evaconcompose.ui.screens.Contadores
import com.example.examen1evaconcompose.ui.screens.Menu

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.Menu.route) {
        //pantalla principal con la navegación
        composable(route = Screens.Menu.route) { Menu(navController) }//Nombre d

        composable(route = Screens.Contadores.route) {
            Contadores() //Nombre de la función composable a la que navegar
        }
    }
}
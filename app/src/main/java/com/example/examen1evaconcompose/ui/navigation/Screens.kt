package com.example.examen1evaconcompose.ui.navigation

sealed class Screens(val route:String){
    object Menu: Screens("initial_screen")//info a aparecer en pantalla


    object Contadores: Screens("tablaMultiplicar")//info a aparecer en pantalla
}

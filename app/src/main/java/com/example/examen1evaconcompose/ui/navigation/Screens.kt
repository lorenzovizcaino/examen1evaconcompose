package com.example.examen1evaconcompose.ui.navigation

sealed class Screens(val route:String){
    object Menu: Screens("initial_screen")//info a aparecer en pantalla


    object Contadores: Screens("Contadores")//info a aparecer en pantalla
    object Registro: Screens("Registro")//info a aparecer en pantalla
}

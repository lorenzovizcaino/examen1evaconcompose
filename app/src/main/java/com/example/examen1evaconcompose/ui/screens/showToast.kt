package com.example.examen1evaconcompose.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable

@Composable
fun showToast(string: String, context: Context) {

    Toast.makeText(context, string, Toast.LENGTH_SHORT).show()

}
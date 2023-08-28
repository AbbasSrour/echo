package com.abbassrour.echo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun LoginInstanceScreen(
    navController: NavController
) {
    val instance = remember {
        mutableStateOf(TextFieldValue())
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Instance",
        )
        OutlinedTextField(
            value = instance.value,
            onValueChange = { it -> instance.value = it },
        )
    }
}
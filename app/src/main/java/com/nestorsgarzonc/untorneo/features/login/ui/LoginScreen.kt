package com.nestorsgarzonc.untorneo.features.login.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    Column() {
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Bienvenido Juanito :)")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "")
    }
}
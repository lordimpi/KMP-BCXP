package org.example.project

import androidx.compose.runtime.*

@Composable
fun App() {
    var currentScreen by remember { mutableStateOf("login") }

    when (currentScreen) {
        "login" -> LoginScreen { currentScreen = "catalogo" }
        "catalogo" -> CatalogoScreen()
    }
}

// Declaración expect para implementar en cada plataforma
expect fun isAndroidPlatform(): Boolean

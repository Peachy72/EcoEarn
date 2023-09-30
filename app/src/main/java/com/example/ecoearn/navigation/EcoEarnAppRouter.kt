package com.example.ecoearn.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen() {
    object WelcomeScreen : Screen()
    object SignUpScreen : Screen()
    object LoginScreen : Screen()
    object TermsAndConditionsScreen : Screen()
}

object EcoEarnAppRouter {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}
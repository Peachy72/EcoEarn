package com.example.ecoearn.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen() {
    object WelcomeScreen : Screen()
    object SignUpScreen : Screen()
    object LoginScreen : Screen()
    object ProfileScreen: Screen()
    object TermsAndConditionsScreen : Screen()
    object RedeemScreen : Screen()
    object VoucherScreen : Screen()
    object CashOutScreen : Screen()
    object LensScreen : Screen()
}

object EcoEarnAppRouter {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.LensScreen)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}
package com.example.ecoearn.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen
import com.example.ecoearn.screens.WelcomeScreen
import com.example.ecoearn.screens.SignUpScreen
import com.example.ecoearn.screens.LoginScreen
import com.example.ecoearn.screens.TermsAndConditionsScreen
import com.example.ecoearn.screens.ProfileScreen
import com.example.ecoearn.screens.RedeemScreen
import com.example.ecoearn.screens.VoucherScreen
import com.example.ecoearn.screens.CashOutScreen

@Composable
fun EcoEarnApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = EcoEarnAppRouter.currentScreen, label = "") { currentState ->
            when (currentState.value) {
                is Screen.WelcomeScreen -> WelcomeScreen()
                is Screen.SignUpScreen -> SignUpScreen()
                is Screen.LoginScreen -> LoginScreen()
                is Screen.TermsAndConditionsScreen -> TermsAndConditionsScreen()
                is Screen.ProfileScreen -> ProfileScreen()
                is Screen.RedeemScreen -> RedeemScreen()
                is Screen.VoucherScreen -> VoucherScreen()
                is Screen.CashOutScreen -> CashOutScreen()

                else -> {}
            }
        }
    }
}
package com.example.ecoearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecoearn.R
import com.example.ecoearn.components.HeadingTextComponent
import com.example.ecoearn.components.NormalTextComponent
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen
import com.example.ecoearn.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_header))
            NormalTextComponent(value = "1. Acceptance of Terms By accessing and using this website (the “Site”), you accept and agree to be bound by the terms and provisions of this agreement (the “Terms”). In addition, when using the Site’s particular services, you shall be subject to any posted guidelines or rules applicable to such services.",)
            NormalTextComponent(value = "2. Modification of Terms We reserve the right, at our sole discretion, to modify or replace these Terms at any time. If a revision is material we will provide at least 30 days’ notice prior to any new terms taking effect.")
            NormalTextComponent(value = "3. User Conduct You agree to use the Site only for lawful purposes. You agree not to take any action that might compromise the security of the Site, render the Site inaccessible to others, or otherwise cause damage to the Site or its content.")
            NormalTextComponent(value = "4. Intellectual Property All intellectual property rights in the Site and its content (including without limitation trademarks and copyright) are owned by us or our licensors.")
            NormalTextComponent(value = "5. Limitation of Liability In no event will we be liable for any direct, indirect, special, consequential damages or any other damages whatsoever arising out of the use of or inability to use the Site.")
            NormalTextComponent(value = "6. Governing Law These Terms shall be governed by and construed in accordance with the laws of [Your Jurisdiction].")
        }
    }
    SystemBackButtonHandler {
        EcoEarnAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun PreviewTermsAndConditionsScreen() {
    TermsAndConditionsScreen()
}
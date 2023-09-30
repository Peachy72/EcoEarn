package com.example.ecoearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecoearn.R
import com.example.ecoearn.components.ButtonComponent
import com.example.ecoearn.components.CheckboxComponent
import com.example.ecoearn.components.ClickableForgotPasswordTextComponent
import com.example.ecoearn.components.ClickableLoginTextComponent
import com.example.ecoearn.components.ClickableSignUpTextComponent
import com.example.ecoearn.components.ClickableTextComponent
import com.example.ecoearn.components.DividerTextComponent
import com.example.ecoearn.components.HeadingTextComponent
import com.example.ecoearn.components.MyTextFieldComponent
import com.example.ecoearn.components.NormalTextComponent
import com.example.ecoearn.components.PasswordTextFieldComponent
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen

@Composable
fun LoginScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                imageVector = Icons.Filled.Email,
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                leadingImage = Icons.Filled.Lock,
                trailingImage = Icons.Filled.Visibility,
            )
            ClickableForgotPasswordTextComponent(
                onTextSelected = {
                    // TODO:Navigate to Forgot Password Screen
                }
            )
            Spacer(modifier = Modifier.height(80.dp))
            ButtonComponent(value = stringResource(id = R.string.login))
            DividerTextComponent()
            ClickableSignUpTextComponent(
                onTextSelected = {
                    EcoEarnAppRouter.navigateTo(Screen.SignUpScreen)
                }
            )
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
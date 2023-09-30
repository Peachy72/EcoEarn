package com.example.ecoearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecoearn.R
import com.example.ecoearn.components.ButtonComponent
import com.example.ecoearn.components.CheckboxComponent
import com.example.ecoearn.components.ClickableForgotPasswordTextComponent
import com.example.ecoearn.components.ClickableLoginTextComponent
import com.example.ecoearn.components.ClickableTextComponent
import com.example.ecoearn.components.DividerTextComponent
import com.example.ecoearn.components.HeadingTextComponent
import com.example.ecoearn.components.MyTextFieldComponent
import com.example.ecoearn.components.NormalTextComponent
import com.example.ecoearn.components.PasswordTextFieldComponent
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen
import com.example.ecoearn.ui.theme.Primary

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
            Spacer(modifier = Modifier.height(80.dp))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(250.dp))
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
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = {
                    EcoEarnAppRouter.navigateTo(Screen.ProfileScreen)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(Primary)
            ) {
                Text(
                    text = stringResource(id = R.string.login),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal
                    ),
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
            DividerTextComponent()
            ClickableLoginTextComponent(
                tryingToLogin = false,
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
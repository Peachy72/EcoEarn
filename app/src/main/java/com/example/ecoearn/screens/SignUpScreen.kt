package com.example.ecoearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecoearn.R
import com.example.ecoearn.app.EcoEarnApp
import com.example.ecoearn.components.ButtonComponent
import com.example.ecoearn.components.CheckboxComponent
import com.example.ecoearn.components.ClickableLoginTextComponent
import com.example.ecoearn.components.DividerTextComponent
import com.example.ecoearn.components.HeadingTextComponent
import com.example.ecoearn.components.MyTextFieldComponent
import com.example.ecoearn.components.NormalTextComponent
import com.example.ecoearn.components.PasswordTextFieldComponent
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen
import com.example.ecoearn.ui.theme.Secondary


@Composable
fun SignUpScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Secondary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.full_name),
                imageVector = Icons.Filled.Person,
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                imageVector = Icons.Filled.Email,
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.phone_number),
                imageVector = Icons.Filled.Phone,
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.current_location),
                imageVector = Icons.Filled.AddLocation,
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                leadingImage = Icons.Filled.Lock,
                trailingImage = Icons.Filled.Visibility,
            )
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected =  {
                    EcoEarnAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                }
            )
            Spacer(modifier = Modifier.height(80.dp))
            ButtonComponent(
                value = stringResource(id = R.string.register),
                onButtonClicked = {
//                    { TODO: Do sth }
                },
                isEnabled = true,
            )
            DividerTextComponent()
            ClickableLoginTextComponent(
                onTextSelected = {
                    EcoEarnAppRouter.navigateTo(Screen.LoginScreen)
                }
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}
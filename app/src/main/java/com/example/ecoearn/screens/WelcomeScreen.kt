package com.example.ecoearn.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecoearn.R
import com.example.ecoearn.components.ButtonComponent
import com.example.ecoearn.components.GreetingTextComponent
import com.example.ecoearn.components.HeadingTextComponent
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen
import com.example.ecoearn.ui.theme.Primary
import com.example.ecoearn.ui.theme.TextColor
import java.time.format.TextStyle

@Composable
fun WelcomeScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White),
    ) {
        Column {
            Spacer(modifier = Modifier.height(100.dp))
            HeadingTextComponent(value = stringResource(id = R.string.app_name))
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                alignment = Alignment.Center
            )
            Text(
                text = "Manage your waste effectively",
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(),
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                ),
                color = TextColor,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(20.dp))
            GreetingTextComponent(value = "Wasty is a waste")
            GreetingTextComponent(value = "management application.")
            GreetingTextComponent(value = "Here you'll be able to connect")
            GreetingTextComponent(value = "with your nearest vendors")
            GreetingTextComponent(value = "based on your location")
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    EcoEarnAppRouter.navigateTo(Screen.SignUpScreen)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(Primary)
            ) {
                Text(
                    text = "Get Started",
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(),
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal
                    ),
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen()
}
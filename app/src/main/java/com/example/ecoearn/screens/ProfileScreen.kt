package com.example.ecoearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AppSettingsAlt
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.CardGiftcard
import androidx.compose.material.icons.outlined.ImageSearch
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecoearn.R
import com.example.ecoearn.components.BottomBarComponent
import com.example.ecoearn.components.ButtonComponent
import com.example.ecoearn.components.ClickableTextComponentWithIcon
import com.example.ecoearn.components.ProfileComponent
import com.example.ecoearn.navigation.Screen
import com.example.ecoearn.ui.theme.Primary

@Composable
fun ProfileScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column {
            ProfileComponent()
            ClickableTextComponentWithIcon(
                value = stringResource(id = R.string.account),
                imageVector = Icons.Outlined.AccountCircle
            )
            ClickableTextComponentWithIcon(
                value = stringResource(id = R.string.settings),
                imageVector = Icons.Outlined.AppSettingsAlt
            )
            ClickableTextComponentWithIcon(
                value = stringResource(id = R.string.points),
                imageVector = Icons.Outlined.CardGiftcard
            )
            ClickableTextComponentWithIcon(
                value = stringResource(id = R.string.history),
                imageVector = Icons.Outlined.ImageSearch
            )
            ClickableTextComponentWithIcon(
                value = stringResource(id = R.string.support),
                imageVector = Icons.Outlined.Call
            )
            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(
                value = stringResource(id = R.string.contact_vendor),
                screen = Screen.TermsAndConditionsScreen,
            )
            BottomBarComponent()
        }
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
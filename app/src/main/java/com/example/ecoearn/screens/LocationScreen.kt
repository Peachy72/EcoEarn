package com.example.ecoearn.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import com.example.ecoearn.components.MyTextFieldComponent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecoearn.components.BottomBarComponent
import com.example.ecoearn.components.LocationCardComponent
import com.example.ecoearn.ui.theme.TextColor

@Composable
fun LocationScreen() {
    Column(
        modifier = Modifier
    ) {
        Box(
            modifier = Modifier.padding(top = 32.dp,start = 16.dp, end = 16.dp)
        ) {
            MyTextFieldComponent(
                labelValue = "Enter your location",
                imageVector = Icons.Filled.AddLocation,
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Locations Nearby",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal
            ),
            color = TextColor,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        LocationCardComponent(
            distance = 1,
            locationLable = "Location A")
        LocationCardComponent(
            distance = 2,
            locationLable = "Location B")
        LocationCardComponent(
            distance = 3,
            locationLable = "Location C")
        LocationCardComponent(
            distance = 4,
            locationLable = "Location D")
        BottomBarComponent()
    }
}
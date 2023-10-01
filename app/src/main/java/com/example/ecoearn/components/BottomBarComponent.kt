package com.example.ecoearn.components

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.CardGiftcard
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarComponent() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Spacer(modifier = Modifier.width(1.dp))
                    Icon(
                        imageVector = Icons.Filled.CameraAlt,
                        contentDescription = "LensScreen",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {
                                EcoEarnAppRouter.navigateTo(
                                    destination = Screen.LensScreen)
                            }
                    )
                    Icon(
                        imageVector = Icons.Filled.AddLocation,
                        contentDescription = "Location",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {
//                                EcoEarnAppRouter.navigateTo(
//                                    destination = Screen.LocationScreen)
                            }
                    )
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Home",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable(onClick = {
//                                EcoEarnAppRouter.navigateTo(
//                                    destination = Screen.HomeScreen)
                            })
                    )
                    Icon(
                        imageVector = Icons.Filled.CardGiftcard,
                        contentDescription = "Gift",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {
                                EcoEarnAppRouter.navigateTo(
                                    destination = Screen.RedeemScreen)
                            }
                    )
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {
                                EcoEarnAppRouter.navigateTo(
                                    destination = Screen.ProfileScreen)
                            }
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                }
            }
        }
    ) {

    }
}
package com.example.ecoearn.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecoearn.R
import com.example.ecoearn.components.PointsComponent
import com.example.ecoearn.components.VoucherDescriptionComponent
import com.example.ecoearn.ui.theme.Primary

@Composable
fun VoucherScreen() {
    Column {
        PointsComponent(points = 50)
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Primary)
        ) {

        }
        VoucherDescriptionComponent()
    }

}

@Preview
@Composable
fun VoucherScreenPreview() {
    VoucherScreen()
}
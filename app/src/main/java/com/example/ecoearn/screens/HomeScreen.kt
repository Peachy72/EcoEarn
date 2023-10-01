package com.example.ecoearn.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecoearn.components.ArticleComponent
import com.example.ecoearn.components.BottomBarComponent
import com.example.ecoearn.components.SeeMoreComponent
import com.example.ecoearn.ui.theme.Primary
import com.example.ecoearn.ui.theme.TextColor

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "News",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center
        )
        repeat(2) {
            ArticleComponent()
        }
        SeeMoreComponent {}
        BottomBarComponent()
    }
}
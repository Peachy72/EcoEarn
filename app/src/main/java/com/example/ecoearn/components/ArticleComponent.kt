package com.example.ecoearn.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecoearn.ui.theme.Primary
import com.example.ecoearn.ui.theme.Secondary

@Composable
fun ArticleComponent(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(Secondary)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Primary)
        )
        Text(
            text = "Article Title: Lorem ipsum dolor sit amet",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal
            ),
            modifier = Modifier.padding(
                start = 8.dp,
                end = 8.dp,
            )
        )
        Text(
            text = "Article Description: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            modifier = Modifier.padding(
                start = 8.dp,
                end = 8.dp,
                bottom = 16.dp
            )
        )
    }

}
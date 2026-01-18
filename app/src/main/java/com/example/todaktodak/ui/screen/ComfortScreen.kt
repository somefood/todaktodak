package com.example.todaktodak.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todaktodak.ui.viewmodel.ComfortViewModel

@Composable
fun ComfortScreen(
    viewModel: ComfortViewModel = viewModel()
) {
    val message by viewModel.todayMessage.collectAsState()

    val lavenderTop = Color(0xFFE8E0F0)
    val white = Color.White
    val darkGray = Color(0xFF4A4A4A)
    val pink = Color(0xFFE91E63)
    val lightGray = Color(0xFF9E9E9E)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(lavenderTop, white)
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = message.text,
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                color = darkGray,
                lineHeight = 36.sp
            )

            Spacer(modifier = Modifier.height(48.dp))

            IconButton(
                onClick = { viewModel.refreshMessage() },
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        color = Color(0xFFFCE4EC),
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = Icons.Default.Refresh,
                    contentDescription = "새로고침",
                    tint = pink,
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "탭하여 다른 문장 보기",
                fontSize = 14.sp,
                color = lightGray
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "토닥토닥 © 2026",
                fontSize = 12.sp,
                color = lightGray
            )
        }
    }
}

@Preview
@Composable
fun ComfortScreePreview() {
    ComfortScreen()
}

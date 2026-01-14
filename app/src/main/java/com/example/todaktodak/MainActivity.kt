package com.example.todaktodak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.todaktodak.ui.screen.ComfortScreen
import com.example.todaktodak.ui.theme.TodaktodakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodaktodakTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ComfortScreen()
                }
            }
        }
    }
}
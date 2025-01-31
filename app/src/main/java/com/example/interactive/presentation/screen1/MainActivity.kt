package com.example.interactive.presentation.screen1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.interactive.presentation.navigation.MatchNavigator
import com.example.interactive.presentation.ui.theme.SampleAppForAPITheme

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            val isSystemInDarkMode = isSystemInDarkTheme()
            val systemController = rememberSystemUiController()
            SideEffect {
                systemController.setSystemBarsColor(
                    color = Color(0xFFB71C1C), darkIcons = !isSystemInDarkMode
                )
            }
            SampleAppForAPITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    MatchNavigator()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SampleAppForAPITheme {
        Greeting()
    }
}
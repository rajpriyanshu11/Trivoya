package com.example.trivoya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.trivoya.ui.WelcomeScreen.LoginScreen
import com.example.trivoya.ui.WelcomeScreen.SignupScreen
import com.example.trivoya.ui.theme.TrivoyaTheme
import com.example.trivoya.ui.WelcomeScreen.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrivoyaTheme {
                    WelcomeScreen()
                    LoginScreen()
                    SignupScreen()
            }
        }
    }
}

package com.ideasapp.globallifeplaner.presentation

import android.content.pm.PackageManager
import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.ideasapp.globallifeplaner.presentation.theme.GlobalLifePlanerTheme
import androidx.compose.material3.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.ideasapp.globallifeplaner.presentation.ui.screens.SuggestionScreen

//TODO
// 1. List for time bound plans and events for them
// 2. Logic to suggest plan for today
// 3. List for ideas and logic to suggest ideas
// Features:
// 1. additional 3 triggers - weather; data; previous events

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GlobalLifePlanerTheme {
                MainScreen()
            }
        }
    }
}


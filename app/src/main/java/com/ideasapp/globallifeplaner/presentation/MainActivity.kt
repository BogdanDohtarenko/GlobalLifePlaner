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

//TODO
// 1. List for time bound plans and events for them
// 2. Logic to suggest plan for today
// 3. List for ideas and logic to suggest ideas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GlobalLifePlanerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {innerPadding->
                    Button(modifier = Modifier.padding(innerPadding), onClick = { requestCameraPermission() }) {
                        Text("Filled")
                    }
                }
            }
        }
    }

    private fun requestCameraPermission() {
        if (PackageManager.PERMISSION_GRANTED ==
            ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)) {

        } else {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), CAMERA_CODE)
        }
    }

    companion object {
        const val CAMERA_CODE = 1
    }
}


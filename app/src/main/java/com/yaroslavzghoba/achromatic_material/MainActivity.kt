package com.yaroslavzghoba.achromatic_material

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yaroslavzghoba.achromatic_material.ui.theme.AchromaticMaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AchromaticMaterialTheme {

            }
        }
    }
}
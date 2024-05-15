package com.yaroslavzghoba.achromatic_material.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.yzghoba.achromatic.AchromaticTheme
import com.yzghoba.achromatic.color.darkAchromaticColorScheme
import com.yzghoba.achromatic.color.lightAchromaticColorScheme

@Composable
fun AchromaticMaterialTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Cannot be applied while you use Achromatic Material
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colorfulColorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkColorScheme()
        else -> lightColorScheme()
    }

    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> darkAchromaticColorScheme()
        else -> lightAchromaticColorScheme()
    }

    AchromaticTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
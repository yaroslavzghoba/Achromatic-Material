package com.yaroslavzghoba.achromatic_material.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.yzghoba.achromatic.AchromaticTheme
import com.yzghoba.achromatic.color.darkColorScheme
import com.yzghoba.achromatic.color.lightColorScheme

@Composable
fun AchromaticMaterialTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Cannot be applied while you use Achromatic Material
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> darkColorScheme()
        else -> lightColorScheme()
    }

    AchromaticTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
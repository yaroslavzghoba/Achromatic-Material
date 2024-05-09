package com.yaroslavzghoba.achromatic_material.ui.theme

import androidx.compose.runtime.Composable
import com.yaroslavzghoba.achromatic_material.AchromaticTheme
import com.yaroslavzghoba.achromatic_material.styles.color.lightColorScheme

@Composable
fun AchromaticMaterialTheme(
    // darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        // dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
        //     val context = LocalContext.current
        //     if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        // }

        // darkTheme -> darkColorScheme
        else -> lightColorScheme()
    }

    AchromaticTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
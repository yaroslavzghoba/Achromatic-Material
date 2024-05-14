package com.yaroslavzghoba.achromatic

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.yaroslavzghoba.achromatic.color.ColorScheme
import com.yaroslavzghoba.achromatic.color.LocalColorScheme

@Composable
fun AchromaticTheme(
    colorScheme: ColorScheme = AchromaticTheme.colorScheme,
    shapes: Shapes = MaterialTheme.shapes,
    typography: Typography = MaterialTheme.typography,

    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
    ) {
        MaterialTheme(
            shapes = shapes,
            typography = typography,
            content = content
        )
    }
}

// TODO: Write documentation
object AchromaticTheme {
    val colorScheme: ColorScheme
        @Composable
        get() = LocalColorScheme.current
}
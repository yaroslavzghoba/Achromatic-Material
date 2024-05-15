package com.yzghoba.achromatic

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.yzghoba.achromatic.color.ColorScheme
import com.yzghoba.achromatic.color.LocalColorScheme

// TODO: Write documentation
@Composable
fun AchromaticTheme(
    colorScheme: ColorScheme = AchromaticTheme.colorScheme,
    colorfulColorScheme: androidx.compose.material3.ColorScheme = MaterialTheme.colorScheme,
    shapes: Shapes = MaterialTheme.shapes,
    typography: Typography = MaterialTheme.typography,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
    ) {
        MaterialTheme(
            colorScheme = colorfulColorScheme,
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
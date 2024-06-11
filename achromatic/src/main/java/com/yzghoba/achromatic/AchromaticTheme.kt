package com.yzghoba.achromatic

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.yzghoba.achromatic.color.LocalAchromaticColors
import com.yzghoba.achromatic.util.LocalThemeConfig
import com.yzghoba.achromatic.util.defaultThemeConfig

/**
 * Defines application theme
 *
 * @param useAchromaticColors specify should [MaterialTheme] use achromatic colors instead of
 * standard. If it's true use [achromaticScheme] else [colorScheme]
 * @param colorScheme original Material Design 3 colorful color scheme
 * @param achromaticScheme achromatic color scheme
 * @param shapes A set of corner shapes
 * @param typography A set of text styles
 */
@Composable
fun AchromaticTheme(
    useAchromaticColors: Boolean = defaultThemeConfig.useAchromaticColors,
    colorScheme: ColorScheme = MaterialTheme.colorScheme,
    achromaticScheme: ColorScheme = LocalAchromaticColors.current,
    shapes: Shapes = MaterialTheme.shapes,
    typography: Typography = MaterialTheme.typography,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalThemeConfig provides LocalThemeConfig.current.copy(
            useAchromaticColors = useAchromaticColors,
        )
    ) {
        MaterialTheme(
            colorScheme = if (useAchromaticColors) achromaticScheme else colorScheme,
            shapes = shapes,
            typography = typography,
            content = content,
        )
    }
}
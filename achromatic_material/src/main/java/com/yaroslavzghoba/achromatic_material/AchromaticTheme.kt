package com.yaroslavzghoba.achromatic_material

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.yaroslavzghoba.achromatic_material.styles.color.ColorScheme
import com.yaroslavzghoba.achromatic_material.styles.color.LocalColorScheme
import com.yaroslavzghoba.achromatic_material.styles.shape.LocalShapes
import com.yaroslavzghoba.achromatic_material.styles.shape.Shapes
import com.yaroslavzghoba.achromatic_material.styles.typography.LocalTypography
import com.yaroslavzghoba.achromatic_material.styles.typography.Typography

@Composable
fun AchromaticTheme(
    colorScheme: ColorScheme = AchromaticTheme.colorScheme,
    shapes: Shapes = AchromaticTheme.shapes,
    typography: Typography = AchromaticTheme.typography,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalShapes provides shapes,
        LocalTypography provides typography,
    ) {
        MaterialTheme(content = content)
    }
}

object AchromaticTheme {
    /**
     * Retrieves the current [ColorScheme] at the call site's position in the hierarchy.
     */
    val colorScheme: ColorScheme
        @Composable
        get() = LocalColorScheme.current

    /**
     * Retrieves the current [Typography] at the call site's position in the hierarchy.
     */
    val typography: Typography
        @Composable
        get() = LocalTypography.current

    /**
     * Retrieves the current [Shapes] at the call site's position in the hierarchy.
     */
    val shapes: Shapes
        @Composable
        get() = LocalShapes.current
}
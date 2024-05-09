package com.yaroslavzghoba.achromatic_material.styles.typography

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

private val materialTypography = androidx.compose.material3.Typography()

@Immutable
data class Typography(
    val displayLarge: TextStyle = materialTypography.displayLarge,
    val displayMedium: TextStyle = materialTypography.displayMedium,
    val displaySmall: TextStyle = materialTypography.displaySmall,
    val headlineLarge: TextStyle = materialTypography.headlineLarge,
    val headlineMedium: TextStyle = materialTypography.headlineMedium,
    val headlineSmall: TextStyle = materialTypography.headlineSmall,
    val titleLarge: TextStyle = materialTypography.titleLarge,
    val titleMedium: TextStyle = materialTypography.titleMedium,
    val titleSmall: TextStyle = materialTypography.titleLarge,
    val bodyLarge: TextStyle = materialTypography.bodyLarge,
    val bodyMedium: TextStyle = materialTypography.bodyMedium,
    val bodySmall: TextStyle = materialTypography.bodySmall,
    val labelLarge: TextStyle = materialTypography.labelLarge,
    val labelMedium: TextStyle = materialTypography.labelMedium,
    val labelSmall: TextStyle = materialTypography.labelSmall,
)

internal val LocalTypography = staticCompositionLocalOf { Typography() }

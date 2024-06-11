package com.yzghoba.achromatic.util

import androidx.compose.runtime.staticCompositionLocalOf

internal data class ThemeConfig(
    val useAchromaticColors: Boolean,
)

internal val defaultThemeConfig = ThemeConfig(
    useAchromaticColors = true,
)

internal val LocalThemeConfig = staticCompositionLocalOf {
    defaultThemeConfig
}
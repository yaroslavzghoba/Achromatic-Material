package com.yzghoba.achromatic.util

import androidx.compose.runtime.staticCompositionLocalOf

/**Using to store the complex of theme preferences*/
internal data class ThemeConfig(
    val useAchromaticColors: Boolean,
)

/**Default theme preferences*/
internal val defaultThemeConfig = ThemeConfig(
    useAchromaticColors = true,
)

/**Represent current state of theme preferences*/
internal val LocalThemeConfig = staticCompositionLocalOf {
    defaultThemeConfig
}
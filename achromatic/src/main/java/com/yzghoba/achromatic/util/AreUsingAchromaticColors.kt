package com.yzghoba.achromatic.util

import androidx.compose.runtime.Composable

/**
 * Return true if theme use achromatic color scheme
 * and false if it use original Material Design 3 colors
 */
@Composable
fun areUsingAchromaticColors(): Boolean {
    return LocalThemeConfig.current.useAchromaticColors
}
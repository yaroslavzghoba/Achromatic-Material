package com.yzghoba.achromatic.util

import androidx.compose.runtime.Composable

@Composable
fun areUsingAchromaticColors(): Boolean {
    return LocalThemeConfig.current.useAchromaticColors
}
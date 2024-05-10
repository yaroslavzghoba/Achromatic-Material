package com.yaroslavzghoba.achromatic_material.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class ColorScheme(
    val achromatic: Color,
    val onAchromatic: Color,
    val achromaticContainer: Color,
    val onAchromaticContainer: Color,
    val error: Color,
    val onError: Color,
    val errorContainer: Color,
    val onErrorContainer: Color,
    val background: Color,
    val onBackground: Color,
    val scrim: Color,
)

fun lightColorScheme(
    achromatic: Color = ColorLightTokens.Achromatic,
    onAchromatic: Color = ColorLightTokens.OnAchromatic,
    achromaticContainer: Color = ColorLightTokens.AchromaticContainer,
    onAchromaticContainer: Color = ColorLightTokens.OnAchromaticContainer,
    error: Color = ColorLightTokens.Error,
    onError: Color = ColorLightTokens.OnError,
    errorContainer: Color = ColorLightTokens.ErrorContainer,
    onErrorContainer: Color = ColorLightTokens.OnErrorContainer,
    background: Color = ColorLightTokens.Background,
    onBackground: Color = ColorLightTokens.OnBackground,
    scrim: Color = ColorLightTokens.Scrim,
): ColorScheme = ColorScheme(
    achromatic = achromatic,
    onAchromatic = onAchromatic,
    achromaticContainer = achromaticContainer,
    onAchromaticContainer = onAchromaticContainer,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    background = background,
    onBackground = onBackground,
    scrim = scrim,
)

fun darkColorScheme(
    achromatic: Color = ColorDarkTokens.Achromatic,
    onAchromatic: Color = ColorDarkTokens.OnAchromatic,
    achromaticContainer: Color = ColorDarkTokens.AchromaticContainer,
    onAchromaticContainer: Color = ColorDarkTokens.OnAchromaticContainer,
    error: Color = ColorDarkTokens.Error,
    onError: Color = ColorDarkTokens.OnError,
    errorContainer: Color = ColorDarkTokens.ErrorContainer,
    onErrorContainer: Color = ColorDarkTokens.OnErrorContainer,
    background: Color = ColorDarkTokens.Background,
    onBackground: Color = ColorDarkTokens.OnBackground,
    scrim: Color = ColorDarkTokens.Scrim,
): ColorScheme = ColorScheme(
    achromatic = achromatic,
    onAchromatic = onAchromatic,
    achromaticContainer = achromaticContainer,
    onAchromaticContainer = onAchromaticContainer,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    background = background,
    onBackground = onBackground,
    scrim = scrim,
)

internal val LocalColorScheme = staticCompositionLocalOf { lightColorScheme() }

package com.yzghoba.achromatic.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.ln

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
    val surface: Color,
    val surfaceBright: Color,
    val surfaceDim: Color,
    val surfaceContainerLowest: Color,
    val surfaceContainerLow: Color,
    val surfaceContainer: Color,
    val surfaceContainerHigh: Color,
    val surfaceContainerHighest: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val surfaceTint: Color,
    val inverseSurface: Color,
    val inverseOnSurface: Color,
    val outline: Color,
    val outlineVariant: Color,
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
    surface: Color = ColorLightTokens.Surface,
    surfaceBright: Color = ColorLightTokens.SurfaceBright,
    surfaceDim: Color = ColorLightTokens.SurfaceDim,
    surfaceContainerLowest: Color = ColorLightTokens.SurfaceContainerLowest,
    surfaceContainerLow: Color = ColorLightTokens.SurfaceContainerLow,
    surfaceContainer: Color = ColorLightTokens.SurfaceContainer,
    surfaceContainerHigh: Color = ColorLightTokens.SurfaceContainerHigh,
    surfaceContainerHighest: Color = ColorLightTokens.SurfaceContainerHighest,
    onSurface: Color = ColorLightTokens.OnSurface,
    surfaceVariant: Color = ColorLightTokens.SurfaceVariant,
    onSurfaceVariant: Color = ColorLightTokens.OnSurfaceVariant,
    surfaceTint: Color = ColorLightTokens.SurfaceTint,
    inverseSurface: Color = ColorLightTokens.InverseSurface,
    inverseOnSurface: Color = ColorLightTokens.InverseOnSurface,
    outline: Color = ColorLightTokens.Outline,
    outlineVariant: Color = ColorLightTokens.OutlineVariant,
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
    surface = surface,
    surfaceBright = surfaceBright,
    surfaceDim = surfaceDim,
    surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow,
    surfaceContainer = surfaceContainer,
    surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    onSurface = onSurface,
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    surfaceTint = surfaceTint,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    outline = outline,
    outlineVariant = outlineVariant,
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
    surface: Color = ColorDarkTokens.Surface,
    surfaceBright: Color = ColorDarkTokens.SurfaceBright,
    surfaceDim: Color = ColorDarkTokens.SurfaceDim,
    surfaceContainerLowest: Color = ColorDarkTokens.SurfaceContainerLowest,
    surfaceContainerLow: Color = ColorDarkTokens.SurfaceContainerLow,
    surfaceContainer: Color = ColorDarkTokens.SurfaceContainer,
    surfaceContainerHigh: Color = ColorDarkTokens.SurfaceContainerHigh,
    surfaceContainerHighest: Color = ColorDarkTokens.SurfaceContainerHighest,
    onSurface: Color = ColorDarkTokens.OnSurface,
    surfaceVariant: Color = ColorDarkTokens.SurfaceVariant,
    onSurfaceVariant: Color = ColorDarkTokens.OnSurfaceVariant,
    surfaceTint: Color = ColorDarkTokens.SurfaceTint,
    inverseSurface: Color = ColorDarkTokens.InverseSurface,
    inverseOnSurface: Color = ColorDarkTokens.InverseOnSurface,
    outline: Color = ColorDarkTokens.Outline,
    outlineVariant: Color = ColorDarkTokens.OutlineVariant,
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
    surface = surface,
    surfaceBright = surfaceBright,
    surfaceDim = surfaceDim,
    surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow,
    surfaceContainer = surfaceContainer,
    surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    onSurface = onSurface,
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    surfaceTint = surfaceTint,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim,
)

/**
 * Computes the surface tonal color at different elevation levels e.g. surface1 through surface5.
 *
 * @param elevation Elevation value used to compute alpha of the color overlay layer.
 *
 * @return the [ColorScheme.surface] color with an alpha of the [ColorScheme.surfaceTint] color
 * overlaid on top of it.
 */
@Stable
fun ColorScheme.surfaceColorAtElevation(
    elevation: Dp,
): Color {
    if (elevation == 0.dp) return surface
    val alpha = ((4.5f * ln(elevation.value + 1)) + 2f) / 100f
    return surfaceTint.copy(alpha = alpha).compositeOver(surface)
}

internal val LocalColorScheme = staticCompositionLocalOf { lightColorScheme() }

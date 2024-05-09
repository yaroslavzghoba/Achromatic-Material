package com.yaroslavzghoba.achromatic_material.styles.shape

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

private val materialShape = androidx.compose.material3.Shapes()

@Immutable
data class Shapes(
    val extraSmall: CornerBasedShape = materialShape.extraSmall,
    val small: CornerBasedShape = materialShape.small,
    val medium: CornerBasedShape = materialShape.medium,
    val large: CornerBasedShape = materialShape.large,
    val extraLarge: CornerBasedShape = materialShape.extraLarge,
)

internal val LocalShapes = staticCompositionLocalOf { Shapes() }

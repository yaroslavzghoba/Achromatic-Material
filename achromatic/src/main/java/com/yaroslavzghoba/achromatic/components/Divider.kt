package com.yaroslavzghoba.achromatic.components

import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.yaroslavzghoba.achromatic.AchromaticTheme

/**Achromatic Material divider*/
@Composable
fun AchromaticHorizontalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = DividerDefaults.Thickness,
    color: Color = DividerDefaults.achromaticColor,
) {
    HorizontalDivider(
        modifier = modifier,
        thickness = thickness,
        color = color,
    )
}

/**Achromatic Material divider*/
@Composable
fun AchromaticVerticalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = DividerDefaults.Thickness,
    color: Color = DividerDefaults.achromaticColor,
) {
    VerticalDivider(
        modifier = modifier,
        thickness = thickness,
        color = color,
    )
}

val DividerDefaults.achromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.outlineVariant
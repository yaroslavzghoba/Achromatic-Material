package com.yzghoba.achromatic.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material switch*/
@Composable
fun AchromaticSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    thumbContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    colors: SwitchColors = SwitchDefaults.achromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        thumbContent = thumbContent,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource
    )
}

/**
 * Creates a [SwitchColors] that represents the different colors used in a [AchromaticSwitch] in
 * different states.
 *
 * @param checkedThumbColor the color used for the thumb when enabled and checked
 * @param checkedTrackColor the color used for the track when enabled and checked
 * @param checkedBorderColor the color used for the border when enabled and checked
 * @param checkedIconColor the color used for the icon when enabled and checked
 * @param uncheckedThumbColor the color used for the thumb when enabled and unchecked
 * @param uncheckedTrackColor the color used for the track when enabled and unchecked
 * @param uncheckedBorderColor the color used for the border when enabled and unchecked
 * @param uncheckedIconColor the color used for the icon when enabled and unchecked
 * @param disabledCheckedThumbColor the color used for the thumb when disabled and checked
 * @param disabledCheckedTrackColor the color used for the track when disabled and checked
 * @param disabledCheckedBorderColor the color used for the border when disabled and checked
 * @param disabledCheckedIconColor the color used for the icon when disabled and checked
 * @param disabledUncheckedThumbColor the color used for the thumb when disabled and unchecked
 * @param disabledUncheckedTrackColor the color used for the track when disabled and unchecked
 * @param disabledUncheckedBorderColor the color used for the border when disabled and unchecked
 * @param disabledUncheckedIconColor the color used for the icon when disabled and unchecked
 */
@Composable
fun SwitchDefaults.achromaticColors(
    checkedThumbColor: Color = AchromaticTheme.colorScheme.onAchromatic,
    checkedTrackColor: Color = AchromaticTheme.colorScheme.achromatic,
    checkedBorderColor: Color = Color.Transparent,
    checkedIconColor: Color = AchromaticTheme.colorScheme.onAchromaticContainer,
    uncheckedThumbColor: Color = AchromaticTheme.colorScheme.outline,
    uncheckedTrackColor: Color = AchromaticTheme.colorScheme.surfaceVariant,
    uncheckedBorderColor: Color = AchromaticTheme.colorScheme.outline,
    uncheckedIconColor: Color = AchromaticTheme.colorScheme.surfaceVariant,
    disabledCheckedThumbColor: Color = AchromaticTheme.colorScheme.surface
        .copy(alpha = 1f)  // TODO: Consider possibility inject this value
        .compositeOver(AchromaticTheme.colorScheme.surface),
    disabledCheckedTrackColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = 0.12f)  // TODO: Consider possibility inject this value
        .compositeOver(AchromaticTheme.colorScheme.surface),
    disabledCheckedBorderColor: Color = Color.Transparent,
    disabledCheckedIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = 0.38f)  // TODO: Consider possibility inject this value
        .compositeOver(MaterialTheme.colorScheme.surface),
    disabledUncheckedThumbColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = 0.38f)  // TODO: Consider possibility inject this value
        .compositeOver(MaterialTheme.colorScheme.surface),
    disabledUncheckedTrackColor: Color = AchromaticTheme.colorScheme.surfaceVariant
        .copy(alpha = 0.12f)  // TODO: Consider possibility inject this value
        .compositeOver(MaterialTheme.colorScheme.surface),
    disabledUncheckedBorderColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = 0.12f)  // TODO: Consider possibility inject this value
        .compositeOver(MaterialTheme.colorScheme.surface),
    disabledUncheckedIconColor: Color = AchromaticTheme.colorScheme.surfaceVariant
        .copy(alpha = 0.38f)  // TODO: Consider possibility inject this value
        .compositeOver(MaterialTheme.colorScheme.surface),
): SwitchColors = SwitchColors(
    checkedThumbColor = checkedThumbColor,
    checkedTrackColor = checkedTrackColor,
    checkedBorderColor = checkedBorderColor,
    checkedIconColor = checkedIconColor,
    uncheckedThumbColor = uncheckedThumbColor,
    uncheckedTrackColor = uncheckedTrackColor,
    uncheckedBorderColor = uncheckedBorderColor,
    uncheckedIconColor = uncheckedIconColor,
    disabledCheckedThumbColor = disabledCheckedThumbColor,
    disabledCheckedTrackColor = disabledCheckedTrackColor,
    disabledCheckedBorderColor = disabledCheckedBorderColor,
    disabledCheckedIconColor = disabledCheckedIconColor,
    disabledUncheckedThumbColor = disabledUncheckedThumbColor,
    disabledUncheckedTrackColor = disabledUncheckedTrackColor,
    disabledUncheckedBorderColor = disabledUncheckedBorderColor,
    disabledUncheckedIconColor = disabledUncheckedIconColor,
)
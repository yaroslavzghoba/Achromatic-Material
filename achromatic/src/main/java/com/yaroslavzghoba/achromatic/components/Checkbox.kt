package com.yaroslavzghoba.achromatic.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import com.yaroslavzghoba.achromatic.AchromaticTheme

/**Achromatic Material checkbox*/
@Composable
fun AchromaticCheckbox(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CheckboxColors = CheckboxDefaults.achromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Checkbox(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource,
    )
}

/**Achromatic Material checkbox parent*/
@Composable
fun AchromaticTriStateCheckbox(
    state: ToggleableState,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CheckboxColors = CheckboxDefaults.achromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    TriStateCheckbox(
        state = state,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource,
    )
}

/**
 * Creates a [CheckboxColors] that will animate between the provided colors according to the
 * Material specification.
 *
 * @param checkedColor the color that will be used for the border and box when checked
 * @param uncheckedColor color that will be used for the border when unchecked. By default, the
 * inner box is transparent when unchecked.
 * @param checkmarkColor color that will be used for the checkmark when checked
 * @param disabledCheckedColor color that will be used for the box and border when disabled and
 * checked
 * @param disabledUncheckedColor color that will be used for the border when disabled and
 * unchecked. By default, the inner box is transparent when unchecked.
 * @param disabledIndeterminateColor color that will be used for the box and
 * border in a [TriStateCheckbox] when disabled AND in an [ToggleableState.Indeterminate] state
 */
@Composable
fun CheckboxDefaults.achromaticColors(
    checkedColor: Color = AchromaticTheme.colorScheme.achromatic,
    uncheckedColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    checkmarkColor: Color = AchromaticTheme.colorScheme.onAchromatic,
    disabledCheckedColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledCheckedBoxColor.alpha),
    disabledUncheckedColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledUncheckedBorderColor.alpha),
    disabledIndeterminateColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledIndeterminateBoxColor.alpha),
): CheckboxColors = CheckboxColors(
    checkedCheckmarkColor = checkmarkColor,
    uncheckedCheckmarkColor = Color.Transparent,
    checkedBoxColor = checkedColor,
    uncheckedBoxColor = Color.Transparent,
    disabledCheckedBoxColor = disabledCheckedColor,
    disabledUncheckedBoxColor = Color.Transparent,
    disabledIndeterminateBoxColor = disabledIndeterminateColor,
    checkedBorderColor = checkedColor,
    uncheckedBorderColor = uncheckedColor,
    disabledBorderColor = disabledCheckedColor,
    disabledUncheckedBorderColor = disabledUncheckedColor,
    disabledIndeterminateBorderColor = disabledIndeterminateColor
)
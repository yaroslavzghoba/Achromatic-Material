package com.yzghoba.achromatic.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.MenuItemColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material list item*/
@Composable
fun AchromaticDropdownMenuItem(
    text: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    enabled: Boolean = true,
    colors: MenuItemColors = MenuDefaults.itemAchromaticColors(),
    contentPadding: PaddingValues = MenuDefaults.DropdownMenuItemContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    DropdownMenuItem(
        text = text,
        onClick = onClick,
        modifier = modifier,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        enabled = enabled,
        colors = colors,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
    )
}

/**
 * Creates a [MenuItemColors] that represents the default text and icon colors used in a
 * [AchromaticDropdownMenuItem].
 *
 * @param textColor the text color of this [AchromaticDropdownMenuItem] when enabled
 * @param leadingIconColor the leading icon color of this [AchromaticDropdownMenuItem] when enabled
 * @param trailingIconColor the trailing icon color of this [AchromaticDropdownMenuItem] when
 * enabled
 * @param disabledTextColor the text color of this [AchromaticDropdownMenuItem] when not enabled
 * @param disabledLeadingIconColor the leading icon color of this [AchromaticDropdownMenuItem] when
 * not enabled
 * @param disabledTrailingIconColor the trailing icon color of this [AchromaticDropdownMenuItem]
 * when not enabled
 */
@Composable
fun MenuDefaults.itemAchromaticColors(
    textColor: Color = AchromaticTheme.colorScheme.onSurface,
    leadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    trailingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledTextColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = itemColors().disabledTextColor.alpha),
    disabledLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = itemColors().disabledLeadingIconColor.alpha),
    disabledTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = itemColors().disabledTrailingIconColor.alpha),
): MenuItemColors = MenuItemColors(
    textColor = textColor,
    leadingIconColor = leadingIconColor,
    trailingIconColor = trailingIconColor,
    disabledTextColor = disabledTextColor,
    disabledLeadingIconColor = disabledLeadingIconColor,
    disabledTrailingIconColor = disabledTrailingIconColor,
)
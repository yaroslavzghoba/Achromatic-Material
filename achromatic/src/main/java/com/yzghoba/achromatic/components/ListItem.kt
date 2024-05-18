package com.yzghoba.achromatic.components

import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemColors
import androidx.compose.material3.ListItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material list item*/
@Composable
fun AchromaticListItem(
    headlineContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    overlineContent: @Composable (() -> Unit)? = null,
    supportingContent: @Composable (() -> Unit)? = null,
    leadingContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
    colors: ListItemColors = ListItemDefaults.achromaticColors(),
    tonalElevation: Dp = ListItemDefaults.Elevation,
    shadowElevation: Dp = ListItemDefaults.Elevation,
) {
    ListItem(
        headlineContent = headlineContent,
        modifier = modifier,
        overlineContent = overlineContent,
        supportingContent = supportingContent,
        leadingContent = leadingContent,
        trailingContent = trailingContent,
        colors = colors,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation
    )
}

/**
 * Creates a [ListItemColors] that represents the default container and content colors used in a
 * [AchromaticListItem].
 *
 * @param containerColor the container color of this list item when enabled.
 * @param headlineColor the headline text content color of this list item when
 * enabled.
 * @param leadingIconColor the color of this list item's leading content when enabled.
 * @param overlineColor the overline text color of this list item
 * @param supportingColor the supporting text color of this list item
 * @param trailingIconColor the color of this list item's trailing content when enabled.
 * @param disabledHeadlineColor the content color of this list item when not enabled.
 * @param disabledLeadingIconColor the color of this list item's leading content when not
 * enabled.
 * @param disabledTrailingIconColor the color of this list item's trailing content when not
 * enabled.
 */
@Composable
fun ListItemDefaults.achromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surface,
    headlineColor: Color = AchromaticTheme.colorScheme.onSurface,
    leadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    overlineColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    supportingColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    trailingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledHeadlineColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledHeadlineColor.alpha),
    disabledLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledLeadingIconColor.alpha),
    disabledTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledTrailingIconColor.alpha),
): ListItemColors = ListItemColors(
    containerColor = containerColor,
    headlineColor = headlineColor,
    leadingIconColor = leadingIconColor,
    overlineColor = overlineColor,
    supportingTextColor = supportingColor,
    trailingIconColor = trailingIconColor,
    disabledHeadlineColor = disabledHeadlineColor,
    disabledLeadingIconColor = disabledLeadingIconColor,
    disabledTrailingIconColor = disabledTrailingIconColor,
)
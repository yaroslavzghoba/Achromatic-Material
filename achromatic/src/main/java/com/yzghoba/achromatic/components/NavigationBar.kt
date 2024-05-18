package com.yzghoba.achromatic.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material bottom navigation bar*/
@Composable
fun AchromaticNavigationBar(
    modifier: Modifier = Modifier,
    containerColor: Color = NavigationBarDefaults.containerAchromaticColor,
    contentColor: Color = NavigationBarDefaults.contentAchromaticColor,
    tonalElevation: Dp = NavigationBarDefaults.Elevation,
    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets,
    content: @Composable RowScope.() -> Unit,
) {
    NavigationBar(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        tonalElevation = tonalElevation,
        windowInsets = windowInsets,
        content = content,
    )
}

/**Container color for [AchromaticNavigationBar]*/
val NavigationBarDefaults.containerAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.surfaceContainer

/**Content color for [AchromaticNavigationBar]*/
val NavigationBarDefaults.contentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.onSurface

/**Achromatic Material bottom navigation bar item*/
@Composable
fun RowScope.AchromaticNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
    colors: NavigationBarItemColors = NavigationBarItemDefaults.achromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = icon,
        modifier = modifier,
        enabled = enabled,
        label = label,
        alwaysShowLabel = alwaysShowLabel,
        colors = colors,
        interactionSource = interactionSource,
    )
}

/**
 * Creates a [NavigationBarItemColors] with the provided colors according to the Material
 * specification.
 *
 * @param selectedIconColor the color to use for the icon when the item is selected.
 * @param selectedTextColor the color to use for the text label when the item is selected.
 * @param indicatorColor the color to use for the indicator when the item is selected.
 * @param unselectedIconColor the color to use for the icon when the item is unselected.
 * @param unselectedTextColor the color to use for the text label when the item is unselected.
 * @param disabledIconColor the color to use for the icon when the item is disabled.
 * @param disabledTextColor the color to use for the text label when the item is disabled.
 * @return the resulting [NavigationBarItemColors] used for [AchromaticNavigationBarItem]
 */
@Composable
fun NavigationBarItemDefaults.achromaticColors(
    selectedIconColor: Color = AchromaticTheme.colorScheme.onAchromaticContainer,
    selectedTextColor: Color = AchromaticTheme.colorScheme.onSurface,
    indicatorColor: Color = AchromaticTheme.colorScheme.achromaticContainer,
    unselectedIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unselectedTextColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = colors().disabledIconColor.alpha),
    disabledTextColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = colors().disabledTextColor.alpha),
): NavigationBarItemColors = NavigationBarItemColors(
    selectedIconColor = selectedIconColor,
    selectedTextColor = selectedTextColor,
    selectedIndicatorColor = indicatorColor,
    unselectedIconColor = unselectedIconColor,
    unselectedTextColor = unselectedTextColor,
    disabledIconColor = disabledIconColor,
    disabledTextColor = disabledTextColor,
)

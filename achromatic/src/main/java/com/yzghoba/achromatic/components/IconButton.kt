package com.yzghoba.achromatic.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.FilledTonalIconToggleButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.IconToggleButtonColors
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.OutlinedIconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material icon button*/
@Composable
fun AchromaticIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.iconButtonAchromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [IconButtonColors] that represents the default colors used in a [AchromaticIconButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 */
@Composable
fun IconButtonDefaults.iconButtonAchromaticColors(
    containerColor: Color = Color.Transparent,
    contentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledContainerColor: Color = Color.Transparent,
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = iconButtonColors().disabledContentColor.alpha)
): IconButtonColors = IconButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**Achromatic Material icon toggle button*/
@Composable
fun AchromaticIconToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconToggleButtonColors = IconButtonDefaults.iconToggleButtonAchromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    IconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [IconToggleButtonColors] that represents the default colors used in a
 * [AchromaticIconToggleButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 * @param checkedContainerColor the container color of this icon button when checked.
 * @param checkedContentColor the content color of this icon button when checked.
 */
@Composable
fun IconButtonDefaults.iconToggleButtonAchromaticColors(
    containerColor: Color = Color.Transparent,
    contentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledContainerColor: Color = Color.Transparent,
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = iconToggleButtonColors().disabledContentColor.alpha),
    checkedContainerColor: Color = Color.Transparent,
    checkedContentColor: Color = AchromaticTheme.colorScheme.achromatic
): IconToggleButtonColors = IconToggleButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
    checkedContainerColor = checkedContainerColor,
    checkedContentColor = checkedContentColor,
)

/**Achromatic Material filled icon button*/
@Composable
fun AchromaticFilledIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = IconButtonDefaults.filledShape,
    colors: IconButtonColors = IconButtonDefaults.filledIconButtonAchromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    FilledIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [IconButtonColors] that represents the default colors used in a
 * [AchromaticFilledIconButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 */
@Composable
fun IconButtonDefaults.filledIconButtonAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.achromatic,
    contentColor: Color = AchromaticTheme.colorScheme.onAchromatic,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledIconButtonColors().disabledContainerColor.alpha),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledIconButtonColors().disabledContentColor.alpha)
): IconButtonColors = IconButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**Achromatic Material filled icon toggle button*/
@Composable
fun AchromaticFilledIconToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = IconButtonDefaults.filledShape,
    colors: IconToggleButtonColors = IconButtonDefaults.filledIconToggleButtonAchromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    FilledIconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [IconToggleButtonColors] that represents the default colors used in a
 * [AchromaticFilledIconToggleButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 * @param checkedContainerColor the container color of this icon button when checked.
 * @param checkedContentColor the content color of this icon button when checked.
 */
@Composable
fun IconButtonDefaults.filledIconToggleButtonAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surfaceVariant,
    contentColor: Color = AchromaticTheme.colorScheme.achromatic,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledIconToggleButtonColors().disabledContainerColor.alpha),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledIconToggleButtonColors().disabledContentColor.alpha),
    checkedContainerColor: Color = AchromaticTheme.colorScheme.achromatic,
    checkedContentColor: Color = AchromaticTheme.colorScheme.onAchromatic
): IconToggleButtonColors = IconToggleButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
    checkedContainerColor = checkedContainerColor,
    checkedContentColor = checkedContentColor,
)

/**Achromatic Material filled tonal icon button*/
@Composable
fun AchromaticFilledTonalIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = IconButtonDefaults.filledShape,
    colors: IconButtonColors = IconButtonDefaults.filledTonalIconButtonAchromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    FilledTonalIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [IconButtonColors] that represents the default colors used in a
 * [AchromaticFilledTonalIconButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 */
@Composable
fun IconButtonDefaults.filledTonalIconButtonAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surfaceContainerHighest,
    contentColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledTonalIconButtonColors().disabledContainerColor.alpha),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledTonalIconButtonColors().disabledContentColor.alpha),
): IconButtonColors = IconButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**Achromatic Material filled tonal icon toggle button*/
@Composable
fun AchromaticFilledTonalIconToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = IconButtonDefaults.filledShape,
    colors: IconToggleButtonColors = IconButtonDefaults
        .filledTonalIconToggleButtonAchromaticColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    FilledTonalIconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        interactionSource = interactionSource,
        content = content
    )
}

/**
 * Creates a [IconToggleButtonColors] that represents the default colors used in a
 * [AchromaticFilledTonalIconToggleButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 * @param checkedContainerColor the container color of this icon button when checked.
 * @param checkedContentColor the content color of this icon button when checked.
 */
@Composable
fun IconButtonDefaults.filledTonalIconToggleButtonAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surfaceContainerHighest,
    contentColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledTonalIconButtonColors().disabledContainerColor.alpha),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledTonalIconButtonColors().disabledContentColor.alpha),
    checkedContainerColor: Color = AchromaticTheme.colorScheme.surfaceContainerHighest,
    checkedContentColor: Color = AchromaticTheme.colorScheme.onSurface,
): IconToggleButtonColors = IconToggleButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
    checkedContainerColor = checkedContainerColor,
    checkedContentColor = checkedContentColor,
)

/**Achromatic Material outlined icon button*/
@Composable
fun AchromaticOutlinedIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = IconButtonDefaults.outlinedShape,
    colors: IconButtonColors = IconButtonDefaults.outlinedIconButtonAchromaticColors(),
    border: BorderStroke? = IconButtonDefaults.outlinedIconButtonAchromaticBorder(enabled),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    OutlinedIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        border = border,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [IconButtonColors] that represents the default colors used in a
 * [AchromaticOutlinedIconButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 */
@Composable
fun IconButtonDefaults.outlinedIconButtonAchromaticColors(
    containerColor: Color = Color.Transparent,
    contentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledContainerColor: Color = Color.Transparent,
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = outlinedIconButtonColors().disabledContentColor.alpha)
): IconButtonColors = IconButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**
 * Represents the [BorderStroke] for an [AchromaticOutlinedIconButton], depending on
 * its [enabled] state.
 *
 * @param enabled whether the icon button is enabled
 */
@Composable
fun IconButtonDefaults.outlinedIconButtonAchromaticBorder(enabled: Boolean): BorderStroke {
    val width = outlinedIconButtonBorder(enabled = enabled).width
    val color: Color = if (enabled) {
        AchromaticTheme.colorScheme.onSurface
    } else {
        AchromaticTheme.colorScheme.onSurface.copy(alpha = 0.12f)
    }
    return remember(color) { BorderStroke(width = width, color = color) }
}

/**Achromatic Material outlined icon toggle button*/
@Composable
fun AchromaticOutlinedIconToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = IconButtonDefaults.outlinedShape,
    colors: IconToggleButtonColors = IconButtonDefaults.outlinedIconToggleButtonAchromaticColors(),
    border: BorderStroke? = IconButtonDefaults
        .outlinedIconToggleButtonAchromaticBorder(enabled, checked),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    OutlinedIconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        border = border,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [IconToggleButtonColors] that represents the default colors used in a
 * [AchromaticOutlinedIconToggleButton].
 *
 * @param containerColor the container color of this icon button when enabled.
 * @param contentColor the content color of this icon button when enabled.
 * @param disabledContainerColor the container color of this icon button when not enabled.
 * @param disabledContentColor the content color of this icon button when not enabled.
 * @param checkedContainerColor the container color of this icon button when checked.
 * @param checkedContentColor the content color of this icon button when checked.
 */
@Composable
fun IconButtonDefaults.outlinedIconToggleButtonAchromaticColors(
    containerColor: Color = Color.Transparent,
    contentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledContainerColor: Color = Color.Transparent,
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = outlinedIconButtonColors().disabledContentColor.alpha),
    checkedContainerColor: Color = AchromaticTheme.colorScheme.inverseSurface,
    checkedContentColor: Color = AchromaticTheme.colorScheme.inverseOnSurface
): IconToggleButtonColors = IconToggleButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
    checkedContainerColor = checkedContainerColor,
    checkedContentColor = checkedContentColor,
)

/**
 * Represents the [BorderStroke] for an [AchromaticOutlinedIconToggleButton], depending on
 * its [enabled] and [checked] state.
 *
 * @param enabled whether the icon button is enabled
 * @param checked whether the icon button is checked
 */
@Composable
fun IconButtonDefaults.outlinedIconToggleButtonAchromaticBorder(
    enabled: Boolean,
    checked: Boolean,
): BorderStroke? {
    if (checked) return null
    return outlinedIconButtonAchromaticBorder(enabled = enabled)
}

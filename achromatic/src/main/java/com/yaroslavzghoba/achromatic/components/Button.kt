package com.yaroslavzghoba.achromatic.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.yaroslavzghoba.achromatic.AchromaticTheme

/**Achromatic Material button*/
@Composable
fun AchromaticButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.shape,
    colors: ButtonColors = ButtonDefaults.buttonAchromaticColors(),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [ButtonColors] that represents the default container and content colors
 * used in a [AchromaticButton].
 *
 * @param containerColor the container color of this [AchromaticButton] when enabled.
 * @param contentColor the content color of this [AchromaticButton] when enabled.
 * @param disabledContainerColor the container color of this [AchromaticButton] when not enabled.
 * @param disabledContentColor the content color of this [AchromaticButton] when not enabled.
 */
@Composable
fun ButtonDefaults.buttonAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.achromatic,
    contentColor: Color = AchromaticTheme.colorScheme.onAchromatic,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = buttonColors().disabledContainerColor.alpha),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = buttonColors().disabledContentColor.alpha),
): ButtonColors = ButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**Achromatic Material outlined button*/
@Composable
fun AchromaticOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.outlinedShape,
    colors: ButtonColors = ButtonDefaults.outlinedButtonAchromaticColors(),
    elevation: ButtonElevation? = null,
    border: BorderStroke? = ButtonDefaults.outlinedButtonAchromaticBorder,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [ButtonColors] that represents the default container and content colors
 * used in an [AchromaticOutlinedButton].
 *
 * @param containerColor the container color of this [AchromaticOutlinedButton] when enabled
 * @param contentColor the content color of this [AchromaticOutlinedButton] when enabled
 * @param disabledContainerColor the container color of this [AchromaticOutlinedButton] when not enabled
 * @param disabledContentColor the content color of this [AchromaticOutlinedButton] when not enabled
 */
@Composable
fun ButtonDefaults.outlinedButtonAchromaticColors(
    containerColor: Color = Color.Transparent,
    contentColor: Color = AchromaticTheme.colorScheme.achromatic,
    disabledContainerColor: Color = Color.Transparent,
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = outlinedButtonColors().disabledContentColor.alpha),
): ButtonColors = ButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/** The default [BorderStroke] used by [AchromaticOutlinedButton]. */
val ButtonDefaults.outlinedButtonAchromaticBorder: BorderStroke
    @Composable
    get() = BorderStroke(
        width = outlinedButtonBorder.width,
        color = AchromaticTheme.colorScheme.outline,
    )

/**Achromatic Material elevated button*/
@Composable
fun AchromaticTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.textShape,
    colors: ButtonColors = ButtonDefaults.textButtonAchromaticColors(),
    elevation: ButtonElevation? = null,
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.TextButtonContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [ButtonColors] that represents the default container and content colors
 * used in a [AchromaticTextButton].
 *
 * @param containerColor the container color of this [AchromaticTextButton] when enabled
 * @param contentColor the content color of this [AchromaticTextButton] when enabled
 * @param disabledContainerColor the container color of this [AchromaticTextButton] when not enabled
 * @param disabledContentColor the content color of this [AchromaticTextButton] when not enabled
 */
@Composable
fun ButtonDefaults.textButtonAchromaticColors(
    containerColor: Color = Color.Transparent,
    contentColor: Color = AchromaticTheme.colorScheme.achromatic,
    disabledContainerColor: Color = Color.Transparent,
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = textButtonColors().disabledContentColor.alpha),
): ButtonColors = ButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor
)

/**Achromatic Material elevated button*/
@Composable
fun AchromaticElevatedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.elevatedShape,
    colors: ButtonColors = ButtonDefaults.elevatedButtonAchromaticColors(),
    elevation: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    ElevatedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [ButtonColors] that represents the default container and content colors
 * used in an [AchromaticElevatedButton].
 *
 * @param containerColor the container color of this [AchromaticElevatedButton] when enabled
 * @param contentColor the content color of this [AchromaticElevatedButton] when enabled
 * @param disabledContainerColor the container color of this [AchromaticElevatedButton] when not enabled
 * @param disabledContentColor the content color of this [AchromaticElevatedButton] when not enabled
 */
@Composable
fun ButtonDefaults.elevatedButtonAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surfaceContainerLow,
    contentColor: Color = AchromaticTheme.colorScheme.achromatic,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = elevatedButtonColors().disabledContainerColor.alpha),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = elevatedButtonColors().disabledContentColor.alpha),
): ButtonColors = ButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**Achromatic Material filled tonal button*/
@Composable
fun AchromaticFilledTonalButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.filledTonalShape,
    colors: ButtonColors = ButtonDefaults.filledTonalButtonAchromaticColors(),
    elevation: ButtonElevation? = ButtonDefaults.filledTonalButtonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    FilledTonalButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [ButtonColors] that represents the default container and content colors
 * used in an [AchromaticFilledTonalButton].
 *
 * @param containerColor the container color of this [AchromaticFilledTonalButton] when enabled
 * @param contentColor the content color of this [AchromaticFilledTonalButton] when enabled
 * @param disabledContainerColor the container color of this [AchromaticFilledTonalButton] when not enabled
 * @param disabledContentColor the content color of this [AchromaticFilledTonalButton] when not enabled
 */
@Composable
fun ButtonDefaults.filledTonalButtonAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surfaceContainerHighest,
    contentColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledTonalButtonColors().disabledContainerColor.alpha),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = filledTonalButtonColors().disabledContentColor.alpha),
): ButtonColors = ButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)
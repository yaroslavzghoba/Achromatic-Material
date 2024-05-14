package com.yaroslavzghoba.achromatic.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.yaroslavzghoba.achromatic.AchromaticTheme

/**
 * Achromatic Material floating action button.
 * No different from [AchromaticFAB]
 */
@Composable
fun AchromaticFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.shape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    FloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material floating action button.
 * No different from [AchromaticFloatingActionButton]
 */
@Composable
fun AchromaticFAB(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.shape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    AchromaticFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material small floating action button.
 * No different from [AchromaticSmallFAB]
 */
@Composable
fun AchromaticSmallFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.smallShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    SmallFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material small floating action button.
 * No different from [AchromaticSmallFloatingActionButton]
 */
@Composable
fun AchromaticSmallFAB(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.smallShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    AchromaticSmallFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material large floating action button.
 * No different from [AchromaticLargeFAB]
 */
@Composable
fun AchromaticLargeFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.largeShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    LargeFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material large floating action button.
 * No different from [AchromaticLargeFloatingActionButton]
 */
@Composable
fun AchromaticLargeFAB(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.largeShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    AchromaticLargeFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material extended floating action button.
 * No different from [AchromaticExtendedFAB]
 */
@Composable
fun AchromaticExtendedFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.extendedFabShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material extended floating action button.
 * No different from [AchromaticExtendedFloatingActionButton]
 */
@Composable
fun AchromaticExtendedFAB(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FloatingActionButtonDefaults.extendedFabShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    AchromaticExtendedFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Achromatic Material extended floating action button.
 * No different from [AchromaticExtendedFAB]
 */
@Composable
fun AchromaticExtendedFloatingActionButton(
    text: @Composable () -> Unit,
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    expanded: Boolean = true,
    shape: Shape = FloatingActionButtonDefaults.extendedFabShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    ExtendedFloatingActionButton(
        text = text,
        icon = icon,
        onClick = onClick,
        modifier = modifier,
        expanded = expanded,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
    )
}

/**
 * Achromatic Material extended floating action button.
 * No different from [AchromaticExtendedFloatingActionButton]
 */
@Composable
fun AchromaticExtendedFAB(
    text: @Composable () -> Unit,
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    expanded: Boolean = true,
    shape: Shape = FloatingActionButtonDefaults.extendedFabShape,
    containerColor: Color = FloatingActionButtonDefaults.achromaticContainerColor,
    contentColor: Color = FloatingActionButtonDefaults.achromaticContentColor,
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    AchromaticExtendedFloatingActionButton(
        text = text,
        icon = icon,
        onClick = onClick,
        modifier = modifier,
        expanded = expanded,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        elevation = elevation,
        interactionSource = interactionSource,
    )
}

/**Container color for floating action buttons*/
val FloatingActionButtonDefaults.achromaticContainerColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.achromaticContainer

/**Content color for floating action buttons*/
val FloatingActionButtonDefaults.achromaticContentColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.onAchromaticContainer

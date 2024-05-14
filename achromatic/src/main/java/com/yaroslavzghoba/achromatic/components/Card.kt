package com.yaroslavzghoba.achromatic.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.dp
import com.yaroslavzghoba.achromatic.AchromaticTheme
import com.yaroslavzghoba.achromatic.color.surfaceColorAtElevation

/**Achromatic Material outlined card*/
@Composable
fun AchromaticOutlinedCard(
    modifier: Modifier = Modifier,
    shape: Shape = CardDefaults.outlinedShape,
    colors: CardColors = CardDefaults.outlinedCardAchromaticColors(),
    elevation: CardElevation = CardDefaults.outlinedCardElevation(),
    border: BorderStroke = CardDefaults.outlinedCardAchromaticBorder(),
    content: @Composable ColumnScope.() -> Unit
) {
    OutlinedCard(
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        content = content,
    )
}

/**Achromatic Material clickable outlined card*/
@Composable
fun AchromaticOutlinedCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = CardDefaults.outlinedShape,
    colors: CardColors = CardDefaults.outlinedCardAchromaticColors(),
    elevation: CardElevation = CardDefaults.outlinedCardElevation(),
    border: BorderStroke = CardDefaults.outlinedCardAchromaticBorder(enabled),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable ColumnScope.() -> Unit,
) {
    OutlinedCard(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [CardColors] that represents the default container and content colors
 * used in an [AchromaticOutlinedCard].
 *
 * @param containerColor the container color of this [AchromaticOutlinedCard] when enabled.
 * @param contentColor the content color of this [AchromaticOutlinedCard] when enabled.
 * @param disabledContainerColor the container color of this [AchromaticOutlinedCard] when not enabled.
 * @param disabledContentColor the content color of this [AchromaticOutlinedCard] when not enabled.
 */
@Composable
fun CardDefaults.outlinedCardAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surface,
    contentColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.surface,
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = outlinedCardColors().disabledContentColor.alpha),
): CardColors = CardColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**
 * Creates a [BorderStroke] that represents the default achromatic border
 * used in [AchromaticOutlinedCard].
 *
 * @param enabled whether the card is enabled
 */
@Composable
fun CardDefaults.outlinedCardAchromaticBorder(enabled: Boolean = true): BorderStroke {
    val width = outlinedCardBorder().width
    val color = if (enabled) {
        AchromaticTheme.colorScheme.outlineVariant
    } else {
        AchromaticTheme.colorScheme.outline
            .copy(alpha = 0.12f)  // TODO: Consider possibility inject this value
            .compositeOver(AchromaticTheme.colorScheme.surface)
    }
    return remember(color) { BorderStroke(width = width, color = color) }
}

/**Achromatic Material elevated card*/
@Composable
fun AchromaticElevatedCard(
    modifier: Modifier = Modifier,
    shape: Shape = CardDefaults.elevatedShape,
    colors: CardColors = CardDefaults.elevatedCardAchromaticColors(),
    elevation: CardElevation = CardDefaults.elevatedCardElevation(),
    content: @Composable ColumnScope.() -> Unit,
) {
    ElevatedCard(
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        content = content,
    )
}

/**Achromatic Material clickable elevated card*/
@Composable
fun AchromaticElevatedCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = CardDefaults.elevatedShape,
    colors: CardColors = CardDefaults.elevatedCardColors(),
    elevation: CardElevation = CardDefaults.elevatedCardElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable ColumnScope.() -> Unit,
) {
    ElevatedCard(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [CardColors] that represents the default container and content colors
 * used in an [AchromaticElevatedCard].
 *
 * @param containerColor the container color of this [AchromaticElevatedCard] when enabled.
 * @param contentColor the content color of this [AchromaticElevatedCard] when enabled.
 * @param disabledContainerColor the container color of this [AchromaticElevatedCard] when not enabled.
 * @param disabledContentColor the content color of this [AchromaticElevatedCard] when not enabled.
 */
@Composable
fun CardDefaults.elevatedCardAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surfaceContainerLow,
    contentColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.surface
        .copy(alpha = 0.38f)  // TODO: Consider possibility inject this value
        .compositeOver(AchromaticTheme.colorScheme.surfaceColorAtElevation(1.dp)),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = elevatedCardColors().disabledContentColor.alpha),
): CardColors = CardColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

/**Achromatic Material filled card*/
@Composable
fun AchromaticCard(
    modifier: Modifier = Modifier,
    shape: Shape = CardDefaults.shape,
    colors: CardColors = CardDefaults.cardAchromaticColors(),
    elevation: CardElevation = CardDefaults.cardElevation(),
    border: BorderStroke? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        content = content,
    )
}

/**Achromatic Material clickable filled card*/
@Composable
fun AchromaticCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = CardDefaults.shape,
    colors: CardColors = CardDefaults.cardColors(),
    elevation: CardElevation = CardDefaults.cardElevation(),
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Creates a [CardColors] that represents the default container and content colors
 * used in a [AchromaticCard].
 *
 * @param containerColor the container color of this [AchromaticCard] when enabled.
 * @param contentColor the content color of this [AchromaticCard] when enabled.
 * @param disabledContainerColor the container color of this [AchromaticCard] when not enabled.
 * @param disabledContentColor the content color of this [AchromaticCard] when not enabled.
 */
@Composable
fun CardDefaults.cardAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surfaceContainerHighest,
    contentColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.surfaceVariant
        .copy(alpha = 0.38f)  // TODO: Consider possibility inject this value
        .compositeOver(AchromaticTheme.colorScheme.surface),
    disabledContentColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = cardColors().disabledContentColor.alpha),
): CardColors = CardColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)

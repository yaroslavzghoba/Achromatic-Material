package com.yzghoba.achromatic.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarDefaults
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material snackbar*/
@Composable
fun AchromaticSnackbar(
    modifier: Modifier = Modifier,
    action: @Composable (() -> Unit)? = null,
    dismissAction: @Composable (() -> Unit)? = null,
    actionOnNewLine: Boolean = false,
    shape: Shape = SnackbarDefaults.shape,
    containerColor: Color = SnackbarDefaults.achromaticColor,
    contentColor: Color = SnackbarDefaults.contentAchromaticColor,
    actionContentColor: Color = SnackbarDefaults.actionContentAchromaticColor,
    dismissActionContentColor: Color = SnackbarDefaults.dismissActionContentAchromaticColor,
    content: @Composable () -> Unit,
) {
    Snackbar(
        modifier = modifier,
        action = action,
        dismissAction = dismissAction,
        actionOnNewLine = actionOnNewLine,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        actionContentColor = actionContentColor,
        dismissActionContentColor = dismissActionContentColor,
        content = content,
    )
}

/**Achromatic Material snackbar*/
@Composable
fun AchromaticSnackbar(
    snackbarData: SnackbarData,
    modifier: Modifier = Modifier,
    actionOnNewLine: Boolean = false,
    shape: Shape = SnackbarDefaults.shape,
    containerColor: Color = SnackbarDefaults.achromaticColor,
    contentColor: Color = SnackbarDefaults.contentAchromaticColor,
    actionColor: Color = SnackbarDefaults.actionAchromaticColor,
    actionContentColor: Color = SnackbarDefaults.actionContentAchromaticColor,
    dismissActionContentColor: Color = SnackbarDefaults.dismissActionContentAchromaticColor,
) {
    val actionLabel = snackbarData.visuals.actionLabel
    val actionComposable: (@Composable () -> Unit)? = actionLabel?.let {
        @Composable {
            AchromaticFilledTonalButton(
                colors = ButtonDefaults.filledTonalButtonAchromaticColors(
                    containerColor = actionColor,
                    contentColor = actionContentColor,
                ),
                onClick = { snackbarData.performAction() },
                content = { Text(actionLabel) }
            )
        }
    }
    val dismissActionComposable: (@Composable () -> Unit)? =
        snackbarData.visuals.withDismissAction.let {
            @Composable {
                IconButton(
                    onClick = { snackbarData.dismiss() },
                    content = {
                        Icon(
                            Icons.Filled.Close,
                            // TODO: Consider possibility inject this value
                            contentDescription = null,
                        )
                    }
                )
            }
        }
    AchromaticSnackbar(
        modifier = modifier.padding(12.dp),
        action = actionComposable,
        dismissAction = dismissActionComposable,
        actionOnNewLine = actionOnNewLine,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        actionContentColor = actionContentColor,
        dismissActionContentColor = dismissActionContentColor,
        content = { Text(snackbarData.visuals.message) },
    )
}

/**Achromatic Material snackbar host*/
@Composable
fun AchromaticSnackbarHost(
    hostState: SnackbarHostState,
    modifier: Modifier = Modifier,
    snackbar: @Composable (SnackbarData) -> Unit = { AchromaticSnackbar(it) },
) {
    SnackbarHost(
        hostState = hostState,
        modifier = modifier,
        snackbar = snackbar,
    )
}

/**Container color for [AchromaticSnackbar]*/
val SnackbarDefaults.achromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.inverseSurface

/**Content color for [AchromaticSnackbar]*/
val SnackbarDefaults.contentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.inverseOnSurface

/**Action container color for [AchromaticSnackbar]*/
val SnackbarDefaults.actionAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.inverseOnSurface

/**Action content color for [AchromaticSnackbar]*/
val SnackbarDefaults.actionContentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.inverseSurface

/**Action content color for [AchromaticSnackbar]*/
val SnackbarDefaults.dismissActionContentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.inverseOnSurface
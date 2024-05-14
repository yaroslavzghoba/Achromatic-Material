package com.yaroslavzghoba.achromatic.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties
import com.yaroslavzghoba.achromatic.AchromaticTheme

/**Achromatic Material alert dialog*/
@Composable
fun AchromaticAlertDialog(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    title: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    shape: Shape = AlertDialogDefaults.shape,
    containerColor: Color = AlertDialogDefaults.containerAchromaticColor,
    iconContentColor: Color = AlertDialogDefaults.iconContentAchromaticColor,
    titleContentColor: Color = AlertDialogDefaults.titleContentAchromaticColor,
    textContentColor: Color = AlertDialogDefaults.textContentAchromaticColor,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    properties: DialogProperties = DialogProperties()
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = confirmButton,
        modifier = modifier,
        dismissButton = dismissButton,
        icon = icon,
        title = title,
        text = text,
        shape = shape,
        containerColor = containerColor,
        iconContentColor = iconContentColor,
        titleContentColor = titleContentColor,
        textContentColor = textContentColor,
        tonalElevation = tonalElevation,
        properties = properties,
    )
}

/**Container color for [AchromaticAlertDialog]*/
val AlertDialogDefaults.containerAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.surface

/**Title content color for [AchromaticAlertDialog]*/
val AlertDialogDefaults.iconContentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.onSurface

/**Title content color for [AchromaticAlertDialog]*/
val AlertDialogDefaults.titleContentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.onSurface

/**Text content color for [AchromaticAlertDialog]*/
val AlertDialogDefaults.textContentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.onSurfaceVariant
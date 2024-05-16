package com.yzghoba.achromatic.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalBottomSheetDefaults
import androidx.compose.material3.ModalBottomSheetProperties
import androidx.compose.material3.SheetState
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material modal bottom sheet*/
@ExperimentalMaterial3Api
@Composable
fun AchromaticModalBottomSheet(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    sheetState: SheetState = rememberModalBottomSheetState(),
    sheetMaxWidth: Dp = BottomSheetDefaults.SheetMaxWidth,
    shape: Shape = BottomSheetDefaults.ExpandedShape,
    containerColor: Color = BottomSheetDefaults.containerAchromaticColor,
    contentColor: Color = BottomSheetDefaults.contentAchromaticColor,
    tonalElevation: Dp = BottomSheetDefaults.Elevation,
    scrimColor: Color = BottomSheetDefaults.scrimAchromaticColor,
    dragHandle: @Composable (() -> Unit)? = { BottomSheetDefaults.AchromaticDragHandle() },
    windowInsets: WindowInsets = BottomSheetDefaults.windowInsets,
    properties: ModalBottomSheetProperties = ModalBottomSheetDefaults.properties(),
    content: @Composable ColumnScope.() -> Unit,
) {
    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        sheetState = sheetState,
        sheetMaxWidth = sheetMaxWidth,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        tonalElevation = tonalElevation,
        scrimColor = scrimColor,
        dragHandle = dragHandle,
        windowInsets = windowInsets,
        properties = properties,
        content = content
    )
}

/**Achromatic Material bottom sheet scaffold*/
@ExperimentalMaterial3Api
@Composable
fun AchromaticBottomSheetScaffold(
    sheetContent: @Composable ColumnScope.() -> Unit,
    modifier: Modifier = Modifier,
    scaffoldState: BottomSheetScaffoldState = rememberBottomSheetScaffoldState(),
    sheetPeekHeight: Dp = BottomSheetDefaults.SheetPeekHeight,
    sheetMaxWidth: Dp = BottomSheetDefaults.SheetMaxWidth,
    sheetShape: Shape = BottomSheetDefaults.ExpandedShape,
    sheetContainerColor: Color = BottomSheetDefaults.containerAchromaticColor,
    sheetContentColor: Color = BottomSheetDefaults.contentAchromaticColor,
    sheetTonalElevation: Dp = BottomSheetDefaults.Elevation,
    sheetShadowElevation: Dp = BottomSheetDefaults.Elevation,
    sheetDragHandle: @Composable (() -> Unit)? = { BottomSheetDefaults.AchromaticDragHandle() },
    sheetSwipeEnabled: Boolean = true,
    topBar: @Composable (() -> Unit)? = null,
    snackbarHost: @Composable (SnackbarHostState) -> Unit = { SnackbarHost(it) },
    containerColor: Color = AchromaticTheme.colorScheme.surface,
    contentColor: Color = AchromaticTheme.colorScheme.onSurface,
    content: @Composable (PaddingValues) -> Unit,
) {
    BottomSheetScaffold(
        sheetContent = sheetContent,
        modifier = modifier,
        scaffoldState = scaffoldState,
        sheetPeekHeight = sheetPeekHeight,
        sheetMaxWidth = sheetMaxWidth,
        sheetShape = sheetShape,
        sheetContainerColor = sheetContainerColor,
        sheetContentColor = sheetContentColor,
        sheetTonalElevation = sheetTonalElevation,
        sheetShadowElevation = sheetShadowElevation,
        sheetDragHandle = sheetDragHandle,
        sheetSwipeEnabled = sheetSwipeEnabled,
        topBar = topBar,
        snackbarHost = snackbarHost,
        containerColor = containerColor,
        contentColor = contentColor,
        content = content,
    )
}

/**Container color for [AchromaticModalBottomSheet]*/
@ExperimentalMaterial3Api
val BottomSheetDefaults.containerAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.surfaceContainerLow

/**Content color for [AchromaticModalBottomSheet]*/
@ExperimentalMaterial3Api
val BottomSheetDefaults.contentAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.onSurface

/**Scrim color for [AchromaticModalBottomSheet]*/
@ExperimentalMaterial3Api
val BottomSheetDefaults.scrimAchromaticColor: Color
    @Composable
    get() = AchromaticTheme.colorScheme.scrim

/**
 * The optional visual marker placed on top of a bottom sheet to indicate it may be dragged.
 */
@ExperimentalMaterial3Api
@Composable
fun BottomSheetDefaults.AchromaticDragHandle(
    modifier: Modifier = Modifier,
    width: Dp = 32.dp,  // TODO: Consider possibility inject this value
    height: Dp = 4.dp,  // TODO: Consider possibility inject this value
    shape: Shape = MaterialTheme.shapes.extraLarge,
    color: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = 0.4f),  // TODO: Consider possibility inject this value
) {
    DragHandle(
        modifier = modifier,
        width = width,
        height = height,
        shape = shape,
        color = color,
    )
}
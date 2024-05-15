package com.yzghoba.achromatic.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material center aligned top app bar*/
@ExperimentalMaterial3Api
@Composable
fun AchromaticCenterAlignedTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = { },
    actions: @Composable RowScope.() -> Unit = { },
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarAchromaticColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    CenterAlignedTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior,
    )
}

/**
 * Creates a [TopAppBarColors] for [AchromaticCenterAlignedTopAppBar]s. The default implementation
 * animates between the provided colors according to the Material Design specification.
 *
 * @param containerColor the container color
 * @param scrolledContainerColor the container color when content is scrolled behind it
 * @param navigationIconContentColor the content color used for the navigation icon
 * @param titleContentColor the content color used for the title
 * @param actionIconContentColor the content color used for actions
 * @return the resulting [TopAppBarColors] used for the top app bar
 */
@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.centerAlignedTopAppBarAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surface,
    scrolledContainerColor: Color = AchromaticTheme.colorScheme.surfaceContainer,
    navigationIconContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    titleContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    actionIconContentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
): TopAppBarColors = TopAppBarColors(
    containerColor = containerColor,
    scrolledContainerColor = scrolledContainerColor,
    navigationIconContentColor = navigationIconContentColor,
    titleContentColor = titleContentColor,
    actionIconContentColor = actionIconContentColor,
)

/**Achromatic Material top app bar*/
@ExperimentalMaterial3Api
@Composable
fun AchromaticTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = { },
    actions: @Composable RowScope.() -> Unit = { },
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarAchromaticColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    TopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior,
    )
}

/**
 * Creates a [TopAppBarColors] for [AchromaticTopAppBar]. The default implementation animates
 * between the provided colors according to the Material Design specification.
 *
 * @param containerColor the container color
 * @param scrolledContainerColor the container color when content is scrolled behind it
 * @param navigationIconContentColor the content color used for the navigation icon
 * @param titleContentColor the content color used for the title
 * @param actionIconContentColor the content color used for actions
 * @return the resulting [TopAppBarColors] used for the top app bar
 */
@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.topAppBarAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surface,
    scrolledContainerColor: Color = AchromaticTheme.colorScheme.surfaceContainer,
    navigationIconContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    titleContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    actionIconContentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
): TopAppBarColors = TopAppBarColors(
    containerColor = containerColor,
    scrolledContainerColor = scrolledContainerColor,
    navigationIconContentColor = navigationIconContentColor,
    titleContentColor = titleContentColor,
    actionIconContentColor = actionIconContentColor,
)

/**Achromatic Material medium top app bar*/
@ExperimentalMaterial3Api
@Composable
fun AchromaticMediumTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = { },
    actions: @Composable RowScope.() -> Unit = { },
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.mediumTopAppBarAchromaticColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    MediumTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior,
    )
}

/**
 * Creates a [TopAppBarColors] for [MediumTopAppBar]s. The default implementation interpolates
 * between the provided colors as the top app bar scrolls according to the Material Design
 * specification.
 *
 * @param containerColor the container color
 * @param scrolledContainerColor the container color when content is scrolled behind it
 * @param navigationIconContentColor the content color used for the navigation icon
 * @param titleContentColor the content color used for the title
 * @param actionIconContentColor the content color used for actions
 * @return the resulting [TopAppBarColors] used for the top app bar
 */
@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.mediumTopAppBarAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surface,
    scrolledContainerColor: Color = AchromaticTheme.colorScheme.surfaceContainer,
    navigationIconContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    titleContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    actionIconContentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
): TopAppBarColors = TopAppBarColors(
    containerColor = containerColor,
    scrolledContainerColor = scrolledContainerColor,
    navigationIconContentColor = navigationIconContentColor,
    titleContentColor = titleContentColor,
    actionIconContentColor = actionIconContentColor,
)

/**Achromatic Material large top app bar*/
@ExperimentalMaterial3Api
@Composable
fun AchromaticLargeTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = { },
    actions: @Composable RowScope.() -> Unit = { },
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.largeTopAppBarAchromaticColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    LargeTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior,
    )
}

/**
 * Creates a [TopAppBarColors] for [AchromaticLargeTopAppBar]s. The default implementation
 * interpolates between the provided colors as the top app bar scrolls according to the
 * Material Design specification.
 *
 * @param containerColor the container color
 * @param scrolledContainerColor the container color when content is scrolled behind it
 * @param navigationIconContentColor the content color used for the navigation icon
 * @param titleContentColor the content color used for the title
 * @param actionIconContentColor the content color used for actions
 * @return the resulting [TopAppBarColors] used for the top app bar
 */
@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.largeTopAppBarAchromaticColors(
    containerColor: Color = AchromaticTheme.colorScheme.surface,
    scrolledContainerColor: Color = AchromaticTheme.colorScheme.surfaceContainer,
    navigationIconContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    titleContentColor: Color = AchromaticTheme.colorScheme.onSurface,
    actionIconContentColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
): TopAppBarColors = TopAppBarColors(
    containerColor = containerColor,
    scrolledContainerColor = scrolledContainerColor,
    navigationIconContentColor = navigationIconContentColor,
    titleContentColor = titleContentColor,
    actionIconContentColor = actionIconContentColor,
)
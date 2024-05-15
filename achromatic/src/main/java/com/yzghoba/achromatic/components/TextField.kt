package com.yzghoba.achromatic.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import com.yzghoba.achromatic.AchromaticTheme

/**Achromatic Material filled text field*/
@Composable
fun AchromaticTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = TextFieldDefaults.shape,
    colors: TextFieldColors = TextFieldDefaults.achromaticColors(),
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors,
    )
}

/**Achromatic Material filled text field*/
@ExperimentalFoundationApi
@Composable
fun AchromaticTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = TextFieldDefaults.shape,
    colors: TextFieldColors = TextFieldDefaults.colors()
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors,
    )
}

/**
 * Creates a [TextFieldColors] that represents the default input text, container, and content
 * colors (including label, placeholder, icons, etc.) used in a [AchromaticTextField].
 *
 * @param focusedTextColor the color used for the input text of this text field when focused
 * @param unfocusedTextColor the color used for the input text of this text field when not focused
 * @param disabledTextColor the color used for the input text of this text field when disabled
 * @param errorTextColor the color used for the input text of this text field when in error state
 * @param focusedContainerColor the container color for this text field when focused
 * @param unfocusedContainerColor the container color for this text field when not focused
 * @param disabledContainerColor the container color for this text field when disabled
 * @param errorContainerColor the container color for this text field when in error state
 * @param cursorColor the cursor color for this text field
 * @param errorCursorColor the cursor color for this text field when in error state
 * @param selectionColors the colors used when the input text of this text field is selected
 * @param focusedIndicatorColor the indicator color for this text field when focused
 * @param unfocusedIndicatorColor the indicator color for this text field when not focused
 * @param disabledIndicatorColor the indicator color for this text field when disabled
 * @param errorIndicatorColor the indicator color for this text field when in error state
 * @param focusedLeadingIconColor the leading icon color for this text field when focused
 * @param unfocusedLeadingIconColor the leading icon color for this text field when not focused
 * @param disabledLeadingIconColor the leading icon color for this text field when disabled
 * @param errorLeadingIconColor the leading icon color for this text field when in error state
 * @param focusedTrailingIconColor the trailing icon color for this text field when focused
 * @param unfocusedTrailingIconColor the trailing icon color for this text field when not focused
 * @param disabledTrailingIconColor the trailing icon color for this text field when disabled
 * @param errorTrailingIconColor the trailing icon color for this text field when in error state
 * @param focusedLabelColor the label color for this text field when focused
 * @param unfocusedLabelColor the label color for this text field when not focused
 * @param disabledLabelColor the label color for this text field when disabled
 * @param errorLabelColor the label color for this text field when in error state
 * @param focusedPlaceholderColor the placeholder color for this text field when focused
 * @param unfocusedPlaceholderColor the placeholder color for this text field when not focused
 * @param disabledPlaceholderColor the placeholder color for this text field when disabled
 * @param errorPlaceholderColor the placeholder color for this text field when in error state
 * @param focusedSupportingTextColor the supporting text color for this text field when focused
 * @param unfocusedSupportingTextColor the supporting text color for this text field when not focused
 * @param disabledSupportingTextColor the supporting text color for this text field when disabled
 * @param errorSupportingTextColor the supporting text color for this text field when in error state
 * @param focusedPrefixColor the prefix color for this text field when focused
 * @param unfocusedPrefixColor the prefix color for this text field when not focused
 * @param disabledPrefixColor the prefix color for this text field when disabled
 * @param errorPrefixColor the prefix color for this text field when in error state
 * @param focusedSuffixColor the suffix color for this text field when focused
 * @param unfocusedSuffixColor the suffix color for this text field when not focused
 * @param disabledSuffixColor the suffix color for this text field when disabled
 * @param errorSuffixColor the suffix color for this text field when in error state
 */
@Composable
fun TextFieldDefaults.achromaticColors(
    focusedTextColor: Color = AchromaticTheme.colorScheme.onSurface,
    unfocusedTextColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledTextColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(colors().disabledTextColor.alpha),
    errorTextColor: Color = AchromaticTheme.colorScheme.onSurface,
    focusedContainerColor: Color = AchromaticTheme.colorScheme.surfaceVariant,
    unfocusedContainerColor: Color = AchromaticTheme.colorScheme.surfaceVariant,
    disabledContainerColor: Color = AchromaticTheme.colorScheme.surfaceVariant,
    errorContainerColor: Color = AchromaticTheme.colorScheme.surfaceVariant,
    cursorColor: Color = AchromaticTheme.colorScheme.achromatic,
    errorCursorColor: Color = AchromaticTheme.colorScheme.error,
    // TODO: By default it's blue color from the Compose logo
    //  Consider possibility replace it by achromatic alternative
    selectionColors: TextSelectionColors = LocalTextSelectionColors.current,
    focusedIndicatorColor: Color = AchromaticTheme.colorScheme.achromatic,
    unfocusedIndicatorColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledIndicatorColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledIndicatorColor.alpha),
    errorIndicatorColor: Color = AchromaticTheme.colorScheme.error,
    focusedLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = colors().disabledLeadingIconColor.alpha),
    errorLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    focusedTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledTrailingIconColor.alpha),
    errorTrailingIconColor: Color = AchromaticTheme.colorScheme.error,
    focusedLabelColor: Color = AchromaticTheme.colorScheme.achromatic,
    unfocusedLabelColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledLabelColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledLabelColor.alpha),
    errorLabelColor: Color = AchromaticTheme.colorScheme.error,
    focusedPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledPlaceholderColor.alpha),
    errorPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    focusedSupportingTextColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedSupportingTextColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledSupportingTextColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledSupportingTextColor.alpha),
    errorSupportingTextColor: Color = AchromaticTheme.colorScheme.error,
    focusedPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = colors().disabledPrefixColor.alpha),
    errorPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    focusedSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = colors().disabledSuffixColor.alpha),
    errorSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
): TextFieldColors = TextFieldColors(
    focusedTextColor = focusedTextColor,
    unfocusedTextColor = unfocusedTextColor,
    disabledTextColor = disabledTextColor,
    errorTextColor = errorTextColor,
    focusedContainerColor = focusedContainerColor,
    unfocusedContainerColor = unfocusedContainerColor,
    disabledContainerColor = disabledContainerColor,
    errorContainerColor = errorContainerColor,
    cursorColor = cursorColor,
    errorCursorColor = errorCursorColor,
    textSelectionColors = selectionColors,
    focusedIndicatorColor = focusedIndicatorColor,
    unfocusedIndicatorColor = unfocusedIndicatorColor,
    disabledIndicatorColor = disabledIndicatorColor,
    errorIndicatorColor = errorIndicatorColor,
    focusedLeadingIconColor = focusedLeadingIconColor,
    unfocusedLeadingIconColor = unfocusedLeadingIconColor,
    disabledLeadingIconColor = disabledLeadingIconColor,
    errorLeadingIconColor = errorLeadingIconColor,
    focusedTrailingIconColor = focusedTrailingIconColor,
    unfocusedTrailingIconColor = unfocusedTrailingIconColor,
    disabledTrailingIconColor = disabledTrailingIconColor,
    errorTrailingIconColor = errorTrailingIconColor,
    focusedLabelColor = focusedLabelColor,
    unfocusedLabelColor = unfocusedLabelColor,
    disabledLabelColor = disabledLabelColor,
    errorLabelColor = errorLabelColor,
    focusedPlaceholderColor = focusedPlaceholderColor,
    unfocusedPlaceholderColor = unfocusedPlaceholderColor,
    disabledPlaceholderColor = disabledPlaceholderColor,
    errorPlaceholderColor = errorPlaceholderColor,
    focusedSupportingTextColor = focusedSupportingTextColor,
    unfocusedSupportingTextColor = unfocusedSupportingTextColor,
    disabledSupportingTextColor = disabledSupportingTextColor,
    errorSupportingTextColor = errorSupportingTextColor,
    focusedPrefixColor = focusedPrefixColor,
    unfocusedPrefixColor = unfocusedPrefixColor,
    disabledPrefixColor = disabledPrefixColor,
    errorPrefixColor = errorPrefixColor,
    focusedSuffixColor = focusedSuffixColor,
    unfocusedSuffixColor = unfocusedSuffixColor,
    disabledSuffixColor = disabledSuffixColor,
    errorSuffixColor = errorSuffixColor,
)

/**Achromatic Material outlined text field*/
@Composable
fun AchromaticOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = OutlinedTextFieldDefaults.shape,
    colors: TextFieldColors = OutlinedTextFieldDefaults.achromaticColors()
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors,
    )
}

/**Achromatic Material outlined text field*/
@Composable
fun AchromaticOutlinedTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = OutlinedTextFieldDefaults.shape,
    colors: TextFieldColors = OutlinedTextFieldDefaults.achromaticColors()
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors,
    )
}

/**
 * Creates a [TextFieldColors] that represents the default input text, container, and content
 * colors (including label, placeholder, icons, etc.) used in an [AchromaticOutlinedTextField].
 *
 * @param focusedTextColor the color used for the input text of this text field when focused
 * @param unfocusedTextColor the color used for the input text of this text field when not focused
 * @param disabledTextColor the color used for the input text of this text field when disabled
 * @param errorTextColor the color used for the input text of this text field when in error state
 * @param focusedContainerColor the container color for this text field when focused
 * @param unfocusedContainerColor the container color for this text field when not focused
 * @param disabledContainerColor the container color for this text field when disabled
 * @param errorContainerColor the container color for this text field when in error state
 * @param cursorColor the cursor color for this text field
 * @param errorCursorColor the cursor color for this text field when in error state
 * @param selectionColors the colors used when the input text of this text field is selected
 * @param focusedBorderColor the border color for this text field when focused
 * @param unfocusedBorderColor the border color for this text field when not focused
 * @param disabledBorderColor the border color for this text field when disabled
 * @param errorBorderColor the border color for this text field when in error state
 * @param focusedLeadingIconColor the leading icon color for this text field when focused
 * @param unfocusedLeadingIconColor the leading icon color for this text field when not focused
 * @param disabledLeadingIconColor the leading icon color for this text field when disabled
 * @param errorLeadingIconColor the leading icon color for this text field when in error state
 * @param focusedTrailingIconColor the trailing icon color for this text field when focused
 * @param unfocusedTrailingIconColor the trailing icon color for this text field when not focused
 * @param disabledTrailingIconColor the trailing icon color for this text field when disabled
 * @param errorTrailingIconColor the trailing icon color for this text field when in error state
 * @param focusedLabelColor the label color for this text field when focused
 * @param unfocusedLabelColor the label color for this text field when not focused
 * @param disabledLabelColor the label color for this text field when disabled
 * @param errorLabelColor the label color for this text field when in error state
 * @param focusedPlaceholderColor the placeholder color for this text field when focused
 * @param unfocusedPlaceholderColor the placeholder color for this text field when not focused
 * @param disabledPlaceholderColor the placeholder color for this text field when disabled
 * @param errorPlaceholderColor the placeholder color for this text field when in error state
 * @param focusedSupportingTextColor the supporting text color for this text field when focused
 * @param unfocusedSupportingTextColor the supporting text color for this text field when not focused
 * @param disabledSupportingTextColor the supporting text color for this text field when disabled
 * @param errorSupportingTextColor the supporting text color for this text field when in error state
 * @param focusedPrefixColor the prefix color for this text field when focused
 * @param unfocusedPrefixColor the prefix color for this text field when not focused
 * @param disabledPrefixColor the prefix color for this text field when disabled
 * @param errorPrefixColor the prefix color for this text field when in error state
 * @param focusedSuffixColor the suffix color for this text field when focused
 * @param unfocusedSuffixColor the suffix color for this text field when not focused
 * @param disabledSuffixColor the suffix color for this text field when disabled
 * @param errorSuffixColor the suffix color for this text field when in error state
 */
@Composable
fun OutlinedTextFieldDefaults.achromaticColors(
    focusedTextColor: Color = AchromaticTheme.colorScheme.onSurface,
    unfocusedTextColor: Color = AchromaticTheme.colorScheme.onSurface,
    disabledTextColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledTextColor.alpha),
    errorTextColor: Color = AchromaticTheme.colorScheme.onSurface,
    focusedContainerColor: Color = Color.Transparent,
    unfocusedContainerColor: Color = Color.Transparent,
    disabledContainerColor: Color = Color.Transparent,
    errorContainerColor: Color = Color.Transparent,
    cursorColor: Color = AchromaticTheme.colorScheme.achromatic,
    errorCursorColor: Color = AchromaticTheme.colorScheme.error,
    // TODO: By default it's blue color from the Compose logo
    //  Consider possibility replace it by achromatic alternative
    selectionColors: TextSelectionColors = LocalTextSelectionColors.current,
    focusedBorderColor: Color = AchromaticTheme.colorScheme.achromatic,
    unfocusedBorderColor: Color = AchromaticTheme.colorScheme.outline,
    disabledBorderColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledIndicatorColor.alpha),
    errorBorderColor: Color = AchromaticTheme.colorScheme.error,
    focusedLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledLeadingIconColor.alpha),
    errorLeadingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    focusedTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledTrailingIconColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledTrailingIconColor.alpha),
    errorTrailingIconColor: Color = AchromaticTheme.colorScheme.error,
    focusedLabelColor: Color = AchromaticTheme.colorScheme.achromatic,
    unfocusedLabelColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledLabelColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledLabelColor.alpha),
    errorLabelColor: Color = AchromaticTheme.colorScheme.error,
    focusedPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledPlaceholderColor.alpha),
    errorPlaceholderColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    focusedSupportingTextColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedSupportingTextColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledSupportingTextColor: Color = AchromaticTheme.colorScheme.onSurface
        .copy(alpha = colors().disabledSupportingTextColor.alpha),
    errorSupportingTextColor: Color = AchromaticTheme.colorScheme.error,
    focusedPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = colors().disabledPrefixColor.alpha),
    errorPrefixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    focusedSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    unfocusedSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
    disabledSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant
        .copy(alpha = colors().disabledSuffixColor.alpha),
    errorSuffixColor: Color = AchromaticTheme.colorScheme.onSurfaceVariant,
): TextFieldColors = TextFieldColors(
    focusedTextColor = focusedTextColor,
    unfocusedTextColor = unfocusedTextColor,
    disabledTextColor = disabledTextColor,
    errorTextColor = errorTextColor,
    focusedContainerColor = focusedContainerColor,
    unfocusedContainerColor = unfocusedContainerColor,
    disabledContainerColor = disabledContainerColor,
    errorContainerColor = errorContainerColor,
    cursorColor = cursorColor,
    errorCursorColor = errorCursorColor,
    textSelectionColors = selectionColors,
    focusedIndicatorColor = focusedBorderColor,
    unfocusedIndicatorColor = unfocusedBorderColor,
    disabledIndicatorColor = disabledBorderColor,
    errorIndicatorColor = errorBorderColor,
    focusedLeadingIconColor = focusedLeadingIconColor,
    unfocusedLeadingIconColor = unfocusedLeadingIconColor,
    disabledLeadingIconColor = disabledLeadingIconColor,
    errorLeadingIconColor = errorLeadingIconColor,
    focusedTrailingIconColor = focusedTrailingIconColor,
    unfocusedTrailingIconColor = unfocusedTrailingIconColor,
    disabledTrailingIconColor = disabledTrailingIconColor,
    errorTrailingIconColor = errorTrailingIconColor,
    focusedLabelColor = focusedLabelColor,
    unfocusedLabelColor = unfocusedLabelColor,
    disabledLabelColor = disabledLabelColor,
    errorLabelColor = errorLabelColor,
    focusedPlaceholderColor = focusedPlaceholderColor,
    unfocusedPlaceholderColor = unfocusedPlaceholderColor,
    disabledPlaceholderColor = disabledPlaceholderColor,
    errorPlaceholderColor = errorPlaceholderColor,
    focusedSupportingTextColor = focusedSupportingTextColor,
    unfocusedSupportingTextColor = unfocusedSupportingTextColor,
    disabledSupportingTextColor = disabledSupportingTextColor,
    errorSupportingTextColor = errorSupportingTextColor,
    focusedPrefixColor = focusedPrefixColor,
    unfocusedPrefixColor = unfocusedPrefixColor,
    disabledPrefixColor = disabledPrefixColor,
    errorPrefixColor = errorPrefixColor,
    focusedSuffixColor = focusedSuffixColor,
    unfocusedSuffixColor = unfocusedSuffixColor,
    disabledSuffixColor = disabledSuffixColor,
    errorSuffixColor = errorSuffixColor,
)

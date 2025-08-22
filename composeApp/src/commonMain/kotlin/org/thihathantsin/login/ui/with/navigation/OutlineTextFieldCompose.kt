package org.thihathantsin.login.ui.with.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp


@Composable
fun OutlineTextFieldCompose(
    onFocusChange: () -> Unit,
    value: String,
    onValueChange: (String) -> Unit,
    prefix: @Composable () -> Unit,
    placeholder: @Composable () -> Unit,
    suffix: (@Composable () -> Unit)? = null,
    isPasswordField: Boolean=false,
    keyboardType: KeyboardType = KeyboardType.Text,
) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth().onFocusChanged { onChange ->
            onFocusChange()
        },
        value = value,
        onValueChange = { text ->
            onValueChange(text)
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color(140, 170, 214),
        ),
        shape = RoundedCornerShape(30.dp),
        prefix = prefix,
        placeholder = placeholder,
        suffix = suffix,
        visualTransformation = if (isPasswordField)PasswordVisualTransformation() else  VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
    )
}
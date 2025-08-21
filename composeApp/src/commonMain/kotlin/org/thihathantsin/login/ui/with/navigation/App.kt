package org.thihathantsin.login.ui.with.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val focusManager = LocalFocusManager.current;
    MaterialTheme {
        Box(modifier = Modifier.clickable {
            focusManager.clearFocus()
        }) {
            LoginScreen()
        }
    }
}
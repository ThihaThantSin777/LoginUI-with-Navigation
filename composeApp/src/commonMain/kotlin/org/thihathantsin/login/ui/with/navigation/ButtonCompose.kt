package org.thihathantsin.login.ui.with.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonCompose(
    onClick: () -> Unit,
    buttonText: String,
    buttonColor: Color? = null,
    buttonFontSize: TextUnit? = null,
    buttonIcon: (@Composable () -> Unit)? = null,
    modifier: Modifier,

    ) {
    Button(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        onClick = {
            onClick()
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor ?: Color(29, 70, 155),
        ),
    ) {
        buttonIcon?.invoke()
        Text(buttonText, fontSize = buttonFontSize ?: 14.sp)
    }
}
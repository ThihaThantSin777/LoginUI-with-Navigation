package org.thihathantsin.login.ui.with.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val focusManager = LocalFocusManager.current
    val navController= rememberNavController()

    MaterialTheme {
        Box(modifier = Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
        ) {
            focusManager.clearFocus()
        }) {
            NavHost(
                navController=navController,
                startDestination = "/login",
            ){
                composable("/login") {
                    LoginScreen(
                        onNavigateToSignUp = {
                            navController.navigate("/signup")
                        }
                    )
                }

                composable("/signup") {
                    SignUpScreen(
                        onNavigateToLogin = {
                            navController.popBackStack()
                        },
                        onBackPressed = {
                            navController.popBackStack()
                        }
                    )
                }
            }
        }
    }
}
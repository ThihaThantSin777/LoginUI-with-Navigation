package org.thihathantsin.login.ui.with.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import loginuiwithnavigation.composeapp.generated.resources.Res
import loginuiwithnavigation.composeapp.generated.resources.facebook_icon
import loginuiwithnavigation.composeapp.generated.resources.google_icon
import loginuiwithnavigation.composeapp.generated.resources.lock_icon
import loginuiwithnavigation.composeapp.generated.resources.lock_outlined_icon
import loginuiwithnavigation.composeapp.generated.resources.login_image
import loginuiwithnavigation.composeapp.generated.resources.person_icon
import loginuiwithnavigation.composeapp.generated.resources.person_outlined_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_off_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_off_outlined_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_outlined_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun LoginScreen(
    onNavigateToSignUp: () -> Unit,
) {
    var email by remember {
        mutableStateOf("")
    }

    var isEmailFocused by remember { mutableStateOf(false) }

    var password by remember {
        mutableStateOf("")
    }

    var isPasswordFocused by remember { mutableStateOf(false) }


    var isPasswordField by remember {
        mutableStateOf(true)
    }



    Scaffold(containerColor = Color.White) {
        Box(
            modifier = Modifier.fillMaxSize().padding(horizontal = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(53.dp))
                Image(
                    painterResource(Res.drawable.login_image),
                    contentDescription = "Login Image",
                )
                Text("Welcome Back!", fontWeight = FontWeight.Bold, fontSize = 32.sp)
                Text("Log in to your existent account", color = Color.Black.copy(alpha = 0.4f))
                Spacer(modifier = Modifier.height(42.dp))
                OutlineTextFieldCompose(
                    onFocusChange = {
                        isEmailFocused = !isEmailFocused
                    },
                    onValueChange = { text ->
                        email = text
                    },
                    prefix = {
                        Image(
                            painterResource(if (isEmailFocused) Res.drawable.person_icon else Res.drawable.person_outlined_icon),
                            contentDescription = "Person Icon",
                            modifier = Modifier.size(30.dp, 30.dp)
                        )
                    },
                    placeholder = {
                        Text(
                            "User name or Email",
                            color = Color.Black.copy(alpha = 0.4f),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    },
                    value = email,
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlineTextFieldCompose(
                    onFocusChange = {
                        isPasswordFocused = !isPasswordFocused
                    },
                    onValueChange = { text ->
                        password = text
                    },
                    prefix = {
                        Image(
                            painterResource(if (isPasswordFocused) Res.drawable.lock_icon else Res.drawable.lock_outlined_icon),
                            contentDescription = "Person Icon",
                            modifier = Modifier.size(30.dp, 30.dp)
                        )
                    },
                    placeholder = {
                        Text(
                            "Password",
                            color = Color.Black.copy(alpha = 0.4f),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    },
                    suffix = {
                        Box(modifier = Modifier.clickable {
                            isPasswordField = !isPasswordField
                        }) {
                            if (isPasswordFocused)
                                Image(
                                    painterResource(if (isPasswordField) Res.drawable.visibility_off_icon else Res.drawable.visibility_icon),
                                    contentDescription = "Visibility Icon",
                                    modifier = Modifier.size(30.dp, 30.dp)
                                )
                            else
                                Image(
                                    painterResource(if (isPasswordField) Res.drawable.visibility_off_outlined_icon else Res.drawable.visibility_outlined_icon),
                                    contentDescription = "Visibility Icon",
                                    modifier = Modifier.size(30.dp, 30.dp)
                                )

                        }
                    },
                    value = password,
                    isPasswordField = isPasswordField,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.fillMaxWidth()) {
                    Text("Forget Password?", fontWeight = FontWeight.Bold)
                }

                Spacer(modifier = Modifier.height(32.dp))

                ButtonCompose(
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    onClick = {

                    },
                    buttonText = "LOGIN"
                )
                Spacer(modifier = Modifier.height(32.dp))
                Text("Or connect using", color = Color.Black.copy(alpha = 0.4f))
                Spacer(modifier = Modifier.height(32.dp))

                Row {
                    ButtonCompose(
                        modifier = Modifier.weight(1f).height(50.dp),
                        buttonColor = Color.Blue,
                        onClick = {

                        },
                        buttonText = "Facebook",
                        buttonFontSize = 14.sp,
                        buttonIcon = {
                            Image(
                                painterResource(Res.drawable.facebook_icon),
                                contentDescription = "Facebook Icon",
                            )
                            Spacer(modifier = Modifier.width(5.dp))
                        }
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    ButtonCompose(
                        modifier = Modifier.weight(1f).height(50.dp),
                        buttonColor = Color.Red,
                        onClick = {

                        },
                        buttonText = "Google",
                        buttonFontSize = 14.sp,
                        buttonIcon = {
                            Image(
                                painterResource(Res.drawable.google_icon),
                                contentDescription = "Google Icon",
                                modifier = Modifier.size(23.dp, 23.dp)
                            )
                            Spacer(modifier = Modifier.width(5.dp))
                        }
                    )

                }
                Spacer(modifier = Modifier.height(37.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Already have an account? ")

                    Text(
                        text = "Login here",
                        color = Color(29, 70, 155),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable {
                            onNavigateToSignUp()
                        }
                    )
                }

            }
        }
    }
}
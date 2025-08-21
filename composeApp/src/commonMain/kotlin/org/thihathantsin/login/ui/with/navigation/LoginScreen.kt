package org.thihathantsin.login.ui.with.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import loginuiwithnavigation.composeapp.generated.resources.Res
import loginuiwithnavigation.composeapp.generated.resources.facebook_icon
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
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }

    var isEmailFocused by remember { mutableStateOf(false) }

    var password by remember {
        mutableStateOf("")
    }

    var isPasswordFocused by remember { mutableStateOf(false) }


    var isShowPassword by remember {
        mutableStateOf(false)
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
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth().onFocusChanged { onChange ->
                        isEmailFocused = !isEmailFocused
                    },
                    value = email,
                    onValueChange = { text ->
                        email = text
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(140, 170, 214),
                    ),
                    shape = RoundedCornerShape(30.dp),
                    prefix = {
                        Image(
                            painterResource(if (isEmailFocused) Res.drawable.person_outlined_icon else Res.drawable.person_icon),
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

                    )
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth().onFocusChanged { onChange ->
                        isPasswordFocused = !isPasswordFocused
                    },
                    value = password,
                    onValueChange = { text ->
                        password = text
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(140, 170, 214),
                    ),
                    visualTransformation = if (isShowPassword) VisualTransformation.None else PasswordVisualTransformation(),
                    shape = RoundedCornerShape(30.dp),
                    prefix = {
                        Image(
                            painterResource(if (isPasswordFocused) Res.drawable.lock_outlined_icon else Res.drawable.lock_icon),
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
                        if (isPasswordFocused)
                            Box(
                                modifier = Modifier.clickable {
                                    isShowPassword = !isShowPassword
                                }
                            ) {
                                if (isShowPassword)
                                    Image(
                                        painterResource(if (isPasswordFocused) Res.drawable.visibility_outlined_icon else Res.drawable.visibility_icon),
                                        contentDescription = "Password Icon",
                                        modifier = Modifier.size(30.dp, 30.dp)
                                    )
                                else
                                    Image(
                                        painterResource(if (isPasswordFocused) Res.drawable.visibility_off_outlined_icon else Res.drawable.visibility_off_icon),
                                        contentDescription = "Person Icon",
                                        modifier = Modifier.size(30.dp, 30.dp)
                                    )
                            }

                    }
                )
                Spacer(modifier = Modifier.height(8.dp))
                Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.fillMaxWidth()) {
                    Text("Forget Password?", fontWeight = FontWeight.Bold)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(29, 70, 155)
                    ),
                ) {
                    Text("Login")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text("Or connect using", color = Color.Black.copy(alpha = 0.4f))
                Spacer(modifier = Modifier.height(16.dp))


                Spacer(modifier = Modifier.weight(1f))
                Text("Don't have an account? Sign In")
                Spacer(modifier = Modifier.height(53.dp))
            }
        }
    }
}
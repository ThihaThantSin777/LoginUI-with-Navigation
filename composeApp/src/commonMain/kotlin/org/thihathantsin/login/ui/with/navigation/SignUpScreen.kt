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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import loginuiwithnavigation.composeapp.generated.resources.Res
import loginuiwithnavigation.composeapp.generated.resources.arrow_back_icon
import loginuiwithnavigation.composeapp.generated.resources.lock_icon
import loginuiwithnavigation.composeapp.generated.resources.lock_outlined_icon
import loginuiwithnavigation.composeapp.generated.resources.mail_icon
import loginuiwithnavigation.composeapp.generated.resources.mail_outline_icon
import loginuiwithnavigation.composeapp.generated.resources.person_icon
import loginuiwithnavigation.composeapp.generated.resources.person_outlined_icon
import loginuiwithnavigation.composeapp.generated.resources.phone
import loginuiwithnavigation.composeapp.generated.resources.phone_outlined_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_off_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_off_outlined_icon
import loginuiwithnavigation.composeapp.generated.resources.visibility_outlined_icon
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    onNavigateToLogin: () -> Unit,
    onBackPressed: () -> Unit,
) {
    var userName by remember {
        mutableStateOf("")
    }

    var isUserNameFocused by remember { mutableStateOf(false) }


    var email by remember {
        mutableStateOf("")
    }

    var isEmailFocused by remember { mutableStateOf(false) }

    var phone by remember {
        mutableStateOf("")
    }

    var isPhoneFocused by remember { mutableStateOf(false) }

    var password by remember {
        mutableStateOf("")
    }

    var isPasswordFocused by remember { mutableStateOf(false) }


    var isPasswordField by remember {
        mutableStateOf(true)
    }

    var confirmPassword by remember {
        mutableStateOf("")
    }

    var isConfirmPasswordFocused by remember { mutableStateOf(false) }


    var isConfirmPasswordField by remember {
        mutableStateOf(true)
    }



    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                },
                navigationIcon = {
                    Image(
                        painterResource(Res.drawable.arrow_back_icon),
                        contentDescription = "Arrow Back Icon",
                        modifier = Modifier.size(30.dp, 30.dp).clickable {
                            onBackPressed()
                        },
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White
                ),
            )
        },
        containerColor = Color.White
    ) {
        Box(
            modifier = Modifier.fillMaxSize().padding(horizontal = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(contentAlignment = Alignment.TopStart, modifier = Modifier.fillMaxWidth()) {

                }
                Text("Let's Get Started", fontWeight = FontWeight.Bold, fontSize = 32.sp)
                Text(
                    "Create an account to get all features",
                    color = Color.Black.copy(alpha = 0.4f)
                )
                Spacer(modifier = Modifier.height(42.dp))
                OutlineTextFieldCompose(
                    onFocusChange = {
                        isUserNameFocused = !isUserNameFocused
                    },
                    onValueChange = { text ->
                        userName = text
                    },
                    prefix = {
                        Image(
                            painterResource(if (isUserNameFocused) Res.drawable.person_icon else Res.drawable.person_outlined_icon),
                            contentDescription = "Person Icon",
                            modifier = Modifier.size(30.dp, 30.dp)
                        )
                    },
                    placeholder = {
                        Text(
                            "User name",
                            color = Color.Black.copy(alpha = 0.4f),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    },
                    value = userName,
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlineTextFieldCompose(
                    onFocusChange = {
                        isEmailFocused = !isEmailFocused
                    },
                    onValueChange = { text ->
                        email = text
                    },
                    prefix = {
                        Image(
                            painterResource(if (isEmailFocused) Res.drawable.mail_icon else Res.drawable.mail_outline_icon),
                            contentDescription = "Email Icon",
                            modifier = Modifier.size(30.dp, 30.dp)
                        )
                    },
                    placeholder = {
                        Text(
                            "Email",
                            color = Color.Black.copy(alpha = 0.4f),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    },
                    value = email,
                    keyboardType = KeyboardType.Email
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlineTextFieldCompose(
                    onFocusChange = {
                        isPhoneFocused = !isPhoneFocused
                    },
                    onValueChange = { text ->
                        phone = text
                    },
                    prefix = {
                        Image(
                            painterResource(if (isPhoneFocused) Res.drawable.phone else Res.drawable.phone_outlined_icon),
                            contentDescription = "Phone Icon",
                            modifier = Modifier.size(30.dp, 30.dp)
                        )
                    },
                    placeholder = {
                        Text(
                            "Phone",
                            color = Color.Black.copy(alpha = 0.4f),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    },
                    value = phone,
                    keyboardType = KeyboardType.Phone
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
                            contentDescription = "Password Icon",
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
                Spacer(modifier = Modifier.height(12.dp))
                OutlineTextFieldCompose(
                    onFocusChange = {
                        isConfirmPasswordFocused = !isConfirmPasswordFocused
                    },
                    onValueChange = { text ->
                        confirmPassword = text
                    },
                    prefix = {
                        Image(
                            painterResource(if (isConfirmPasswordFocused) Res.drawable.lock_icon else Res.drawable.lock_outlined_icon),
                            contentDescription = "Password Icon",
                            modifier = Modifier.size(30.dp, 30.dp)
                        )
                    },
                    placeholder = {
                        Text(
                            "Confirm Password",
                            color = Color.Black.copy(alpha = 0.4f),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    },
                    suffix = {
                        Box(modifier = Modifier.clickable {
                            isConfirmPasswordField = !isConfirmPasswordField
                        }) {
                            if (isConfirmPasswordFocused)
                                Image(
                                    painterResource(if (isConfirmPasswordField) Res.drawable.visibility_off_icon else Res.drawable.visibility_icon),
                                    contentDescription = "Visibility Icon",
                                    modifier = Modifier.size(30.dp, 30.dp)
                                )
                            else
                                Image(
                                    painterResource(if (isConfirmPasswordField) Res.drawable.visibility_off_outlined_icon else Res.drawable.visibility_outlined_icon),
                                    contentDescription = "Visibility Icon",
                                    modifier = Modifier.size(30.dp, 30.dp)
                                )

                        }
                    },
                    value = confirmPassword,
                    isPasswordField = isConfirmPasswordField,
                )

                Spacer(modifier = Modifier.height(32.dp))

                ButtonCompose(
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    onClick = {

                    },
                    buttonText = "CREATE"
                )
                Spacer(modifier = Modifier.height(37.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Don't have an account? ")

                    Text(
                        text = "Sign Up",
                        color = Color(29, 70, 155),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable {
                            onNavigateToLogin()
                        }
                    )
                }

            }
        }
    }

}
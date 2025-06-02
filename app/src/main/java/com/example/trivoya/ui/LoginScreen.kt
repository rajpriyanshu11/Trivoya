package com.example.trivoya.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.trivoya.R
import com.example.trivoya.ui.components.TrivoyaElevatedBtn
import com.example.trivoya.ui.components.TrivoyaFilledTonalBtn
import com.example.trivoya.ui.components.TrivoyaTextField

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    MaterialTheme {
        LoginScreen()
    }
}


@Composable
fun LoginScreen () {
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    val uriHandler = LocalUriHandler.current

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp, end = 24.dp, top = 250.dp, bottom = 50.dp)

            ) {
                Column {
                    Text(
                        text = "Welcome Back",
                        style = MaterialTheme.typography.displayLarge,
                        color = Color.Black,
                        fontSize = 40.sp,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )

                    Text(
                        text = "Please sign in to continue",
                        color = Color.Black,
                        style = MaterialTheme.typography.displayLarge,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(bottom = 40.dp)
                    )
                    TrivoyaTextField(
                        value = email,
                        onValueChange = { email = it },
                        modifier = Modifier
                            .shadow(8.dp)
                            .fillMaxWidth(),
                        placeholder = ("Email/Username"),
                        leadingIcon = {
                            Icon(
                                Icons.Default.Email,
                                contentDescription = "Email/Username"
                            )
                        }
                    )

                    Spacer(modifier = Modifier.height(26.dp))

                    TrivoyaTextField(
                        value = password,
                        onValueChange = { password = it },
                        modifier = Modifier
                            .shadow(8.dp)
                            .fillMaxWidth(),
                        placeholder = ("Password"),
                        leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password") },
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(26.dp))

                    TrivoyaElevatedBtn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .height(50.dp),
                        text = " LOGIN",
                        onClick = { "" },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF3CA4AC),
                            contentColor = Color.White
                        ),
                        elevation = ButtonDefaults.elevatedButtonElevation(4.dp)
                    )

                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = "or continue with",
                        color = Color.Black,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )

                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 40.dp)
                    ){
                        Image(painter = painterResource(R.drawable.google_logo),
                            contentDescription = "google",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable(enabled = true, onClick = { "" })
                        )
                    }

                    HorizontalDivider(
                        color = Color.Black,
                        thickness = 1.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    )

                    ClickableText(
                        text = AnnotatedString(
                            "Create Account",
                            spanStyle = SpanStyle(
                                color = Color.Black,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Light
                            )
                        ),
                        onClick = { uriHandler.openUri("https://google.com") },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
}


@Composable
fun SubmitBtn() {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End) ,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF3CA4AC),
                contentColor = Color.White
            )

        ){
            Text(text = "LOGIN")
        }
}



package com.example.trivoya.ui.WelcomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trivoya.R
import com.example.trivoya.ui.components.TrivoyaElevatedBtn
import com.example.trivoya.ui.components.TrivoyaOutlinedBtn
import com.example.trivoya.ui.components.TrivoyaTextField
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.example.trivoya.ui.components.TrivoyaSecureTextField


@Preview(showBackground = true)
@Composable
fun PreviewSignUpScreen() {
    MaterialTheme {
        SignupScreen()
    }
}

@Composable
fun SignupScreen () {
    var email by remember { mutableStateOf("") }
    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    var name by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val screenHeight = maxHeight
            val screenWidth = maxWidth
            val topPadding = screenHeight * 0.2f

            val calculatedFontSize = when {
                screenWidth < 360.dp -> 26.sp
                screenWidth < 400.dp -> 30.sp
                else -> 35.sp
            }

            Column(
                modifier = Modifier
                   .fillMaxSize()
                  .padding(start = 24.dp, end = 24.dp, top = topPadding, bottom = 24.dp)
            ) {
            Column {
                Text(
                    text = "Become a Trivoya",
                    style = MaterialTheme.typography.displayLarge,
                    color = Color.Black,
                    fontSize = calculatedFontSize,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "member",
                    style = MaterialTheme.typography.displayLarge,
                    color = Color.Black,
                    fontSize = calculatedFontSize,
                    modifier = Modifier.padding(bottom = 35.dp)
                )

                TrivoyaTextField(
                    value = name,
                    onValueChange = { name = it },
                    modifier = Modifier
                        .shadow(8.dp)
                        .fillMaxWidth(),
                    placeholder = ("Name"),
                    leadingIcon = {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Name"
                        )
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
                )

                Spacer(modifier = Modifier.height(25.dp))

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
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
                )

                Spacer(modifier = Modifier.height(25.dp))

                TrivoyaSecureTextField(
                    state = rememberTextFieldState(),
                    label = { Text("Enter password") },
                    textObfuscationMode =
                    if (passwordHidden) TextObfuscationMode.RevealLastTyped
                    else TextObfuscationMode.Visible,
                    leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password") },
                    trailingIcon = {
                        IconButton(onClick = { passwordHidden = !passwordHidden }) {
                            val visibilityIcon =
                                if (passwordHidden) Icons.Filled.VisibilityOff else Icons.Filled.Visibility

                            val description = if (passwordHidden) "Show password" else "Hide password"
                            Icon(imageVector = visibilityIcon, contentDescription = description)
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(dimensionResource(R.dimen.elevation_high)),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color(0xFFFFFFFF),
                        unfocusedContainerColor = Color(0xFFFFFFFF),
                        disabledContainerColor = Color.LightGray,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),

                    )

                Spacer(modifier = Modifier.height(50.dp))

                TrivoyaElevatedBtn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(R.dimen.button_height_medium)),
                    text = stringResource(R.string.sign_up),
                    onClick = { "" },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3CA4AC),
                        contentColor = Color.White
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(dimensionResource(R.dimen.elevation_low))
                )

                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacer_medium)))

                TrivoyaOutlinedBtn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(R.dimen.button_height_medium)),
                    text = stringResource(R.string.sign_in),
                    onClick = { "" },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3CA4AC),
                        contentColor = Color.White
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(dimensionResource(R.dimen.elevation_low))
                )

            }
        }
      }
    }
}
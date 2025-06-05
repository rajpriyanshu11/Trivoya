package com.example.trivoya.ui.WelcomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trivoya.R
import com.example.trivoya.ui.theme.RemachineScript
import com.example.trivoya.ui.theme.TrivoyaLogoStyle

@Preview(showBackground = true)
@Composable
fun WelcomeScreen () {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                colors = listOf(
                    Color(0xFF2C7A82),
                    Color(0xFF3CA4AC)
                )
                )
            )
    ) {
        Column (
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = stringResource(R.string.app_name),
                style= TrivoyaLogoStyle ,
                color = Color.White,
            )
            Text(
                text = "PLAN.  PACK.  GO.",
                color = Color.White,
                fontSize = 15.sp,
                letterSpacing = 8.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
        Text(
            text = "Made in \uD83C\uDDEE\uD83C\uDDF3",
            color = Color.White,
            fontSize= 20.sp,
            letterSpacing = 2.sp,
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(dimensionResource(R.dimen.padding_small))
        )
    }
}

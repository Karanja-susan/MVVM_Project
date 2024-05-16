package com.susankaranja.mvvm_project.ui.Screen.About

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.susankaranja.mvvm_project.Navigation.ROUTE_ABOUT
import com.susankaranja.mvvm_project.Navigation.ROUTE_HOME


@Composable
fun AbtScreen(navController: NavHostController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ){
        Text(text = "This is About us Screen",
            fontSize = 28.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )
        Button(onClick = {
            navController.navigate(ROUTE_HOME)
        },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Home",
                fontFamily = FontFamily.Cursive,
                fontSize = 20.sp)
        }
    }
}

@Preview
@Composable
private fun AboutScreenPrev() {
    AbtScreen(navController = rememberNavController())
}
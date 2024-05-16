package com.susankaranja.mvvm_project.ui.Screen.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.susankaranja.mvvm_project.Navigation.ROUTE_ABOUT
import com.susankaranja.mvvm_project.Navigation.ROUTE_LOGIN
import com.susankaranja.mvvm_project.Navigation.ROUTE_REGISTRATION

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxSize()
            ) {
//        Text(text = "This is the HomePage",
//            fontSize = 30.sp,
//            fontFamily = FontFamily.Cursive,
//            color = Color.Cyan
//        )
        Text(text = "WELCOME TO " ,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White
        )
        Text(text = "OUR APP",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White
        )
        Spacer(modifier = Modifier
            .height(40.dp))
        Text(text = "Fresh food for everyone",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White
        )
        Spacer(modifier = Modifier
            .height(20.dp))
        Text(text = "lorem")
        Spacer(modifier = Modifier
            .height(50.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign In",
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    )
            Spacer(modifier = Modifier
                .height(25.dp))
        }

        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "Create an account")
        }
        Spacer(modifier = Modifier
            .height(10.dp))
        
        Button(onClick = {
            navController.navigate(ROUTE_ABOUT)
        },
            modifier = Modifier
                .fillMaxWidth()
         ) {
          Text(text = "About",
              fontFamily = FontFamily.Cursive,
              fontSize = 20.sp)
        }
//
        Spacer(modifier = Modifier
            .height(5.dp))
        Button(onClick = {
            navController.navigate(ROUTE_REGISTRATION)
        },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Registration",
                fontFamily = FontFamily.Cursive,
                fontSize = 20.sp)
        }
        Spacer(modifier = Modifier
            .height(5.dp))
        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Login",
                fontFamily = FontFamily.Cursive,
                fontSize = 20.sp)
        }
    }

}

@Preview
@Composable
private fun HomeScreenPrev() {
    HomeScreen(navController = rememberNavController())
    
}
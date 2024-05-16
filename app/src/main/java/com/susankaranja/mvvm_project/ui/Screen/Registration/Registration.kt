package com.susankaranja.mvvm_project.ui.Screen.Registration

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.susankaranja.mvvm_project.Navigation.ROUTE_ABOUT
import com.susankaranja.mvvm_project.Navigation.ROUTE_LOGIN
import com.susankaranja.mvvm_project.Navigation.ROUTE_REGISTRATION
import kotlinx.coroutines.channels.TickerMode

@Composable
fun RegScreen(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxSize()
    ){
        Text(text = "REGISTRATION",
        color = Color.White,
        fontFamily= FontFamily.Monospace,
        fontSize = 20.sp)
        Spacer(modifier = Modifier
            .height(15.dp))

    Text(text = "Create your new Account",
        color = Color.White,
        fontSize = 15.sp,
        fontFamily = FontFamily.Default
    )
        Spacer(modifier = Modifier
        .height(15.dp))
    OutlinedTextField(
        value = name, onValueChange = { name = it },
        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
        label = {
            Text(
                text = "Enter username",
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )
        },
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(vertical = 10.dp),

        )
        Spacer(modifier = Modifier
            .height(15.dp))
        OutlinedTextField(
            value = email, onValueChange = { email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") },
            label = {
                Text(
                    text = "Enter Email",
                    color = Color.Black,
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp
                )
            },
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(vertical = 10.dp),

            )
        Spacer(modifier = Modifier
            .height(15.dp))
    OutlinedTextField(
        value = password, onValueChange = { password = it },
        leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Pass") },
        label = {
            Text(
                text = "Enter password",
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )
        },
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(vertical = 10.dp),
    )
        Spacer(modifier = Modifier
            .height(15.dp))
        Text(text = "                         " +
                "forgot password ?",
            modifier = Modifier
                .clickable { "          forgot password ?" }
                )

        Spacer(modifier = Modifier
            .height(15.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login",
                color = Color.White,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier
            .height(15.dp))
        Text(text = "Dont have an account ?                      " +
                "sign up",
            modifier = Modifier
            .clickable { navController.navigate(ROUTE_REGISTRATION) })
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
private fun RegScreenPrev() {
    RegScreen(navController = rememberNavController())
}

package com.susankaranja.mvvm_project.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.susankaranja.mvvm_project.ui.Screen.About.AbtScreen
import com.susankaranja.mvvm_project.ui.Screen.Home.HomeScreen
import com.susankaranja.mvvm_project.ui.Screen.Login.LoginScreen
import com.susankaranja.mvvm_project.ui.Screen.Registration.RegScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME) {
    NavHost(navController = navController, modifier = Modifier, startDestination =startDestination ) {
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){ AbtScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTRATION){
            RegScreen(navController)
        }
    }

}
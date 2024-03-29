package ua.edu.lntu.ipz_32_cw_4.ui

import androidx.compose.runtime.Composable
import ua.edu.lntu.ipz_32_cw_4.Screen


import androidx.compose.ui.Modifier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.ipz_32_cw_4.ui.theme.IPZ_32_cw_4Theme
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
@Composable
 fun SecondScreen(modifier: Modifier = Modifier, navController: NavController)
 {
     Column(modifier = modifier.padding(70.dp)) {
         Text(
             text = "Sign In success.",
             fontSize = 20.sp,
         )
     }
     Button(onClick = {navController.navigate(Screen.StartScreen.route)}) {
         Text(text = "Sing Out")
     }
 }


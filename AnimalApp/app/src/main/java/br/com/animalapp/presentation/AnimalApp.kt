package br.com.animalapp.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.animalapp.presentation.screens.AnimalScreen
import br.com.animalapp.presentation.screens.HomeScreen

@ExperimentalMaterial3Api
@Composable
fun AnimalApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {

        composable("home") {
            HomeScreen(onAnimalSelected = { animal ->
                navController.navigate("animal/$animal")
            })
        }

        composable (
            "animal/{animal}",
            arguments = listOf(
                navArgument (
                    "animal"
                ) {
                    type = NavType.StringType
                })
        ) { backStackEntry ->
            val animal = backStackEntry.arguments?.getString("animal") ?: "Dog"
            AnimalScreen(animal, navController = navController)
        }
    }
}

package br.com.zooapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.zooapp.ui.screens.AnimalScreen
import br.com.zooapp.ui.screens.HomeScreen
import br.com.zooapp.models.animalList

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onAnimalSelected = { animal ->
                navController.navigate("animal/${animal.name}")
            })
        }
        composable("animal/{animal}") { backStackEntry ->
            val animalName = backStackEntry.arguments?.getString("animal")
            val selectedAnimal = animalList.first { it.name == animalName }
            AnimalScreen(
                animal = selectedAnimal,
                onBack = { navController.popBackStack() }
            )
        }
    }
}



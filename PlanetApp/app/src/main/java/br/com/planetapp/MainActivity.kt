package br.com.planetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.planetapp.navigation.NavGraph
import br.com.planetapp.ui.theme.PlanetAppTheme
import br.com.zooapp.ui.components.DialogContent
import br.com.zooapp.ui.components.DialogHost

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val dialogState = remember { mutableStateOf<DialogContent?>(null) }
            PlanetAppTheme {
                NavGraph(
                    onSettingsClick = {
                        dialogState.value = DialogContent(
                            title = "Configurações",
                            message = "Aqui você pode acessar as configurações do aplicativo."
                        )
                    },
                    onHelpClick = {
                        dialogState.value = DialogContent(
                            title = "Ajuda",
                            message = "Precisa de ajuda? Entre em contato com o suporte ou consulte nosso guia."
                        )
                    }
                )

                DialogHost(dialogState)
            }
        }
    }
}
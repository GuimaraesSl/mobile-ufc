package br.com.alsamir.lifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.lifecycleScope
import br.com.alsamir.lifecycledemo.ui.theme.LifecycleDemoTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifecycleDemoTheme {
                val snackbarHostState = remember { SnackbarHostState() }

                Scaffold(
                    snackbarHost = {
                        SnackbarHost(hostState = snackbarHostState) { data ->
                            Snackbar(
                                containerColor = Color.Green,
                                contentColor = Color.Black,
                                content = { Text(data.visuals.message) }
                            )
                        }
                    },
                    content = { innerPadding ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding)
                        ) {
                            LifecycleAwareSnackbarDemo(snackbarHostState)
                            Greeting(
                                name = "Android",
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun LifecycleAwareSnackbarDemo(snackbarHostState: SnackbarHostState) {
    val context = LocalContext.current

    // Observa o ciclo de vida da atividade
    DisposableEffect(context) {
        val lifecycle = (context as ComponentActivity).lifecycle
        val observer = LifecycleEventObserver { _, event ->
            val message = when (event) {
                Lifecycle.Event.ON_CREATE -> "onCreate chamado"
                Lifecycle.Event.ON_START -> "onStart chamado"
                Lifecycle.Event.ON_RESUME -> "onResume chamado"
                Lifecycle.Event.ON_PAUSE -> "onPause chamado"
                Lifecycle.Event.ON_STOP -> "onStop chamado"
                Lifecycle.Event.ON_DESTROY -> "onDestroy chamado"
                else -> ""
            }

            if (message.isNotEmpty()) {
                Log.d("LifecycleDemo", message)

                // Use uma coroutine para mostrar a snackbar
                (context as ComponentActivity).lifecycleScope.launch {
                    snackbarHostState.showSnackbar(
                        message = message,
                        duration = SnackbarDuration.Short
                    )
                }
            }
        }

        lifecycle.addObserver(observer)

        onDispose {
            lifecycle.removeObserver(observer)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifecycleDemoTheme {
        Greeting("Android")
    }
}

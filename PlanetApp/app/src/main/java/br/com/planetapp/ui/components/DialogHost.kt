package br.com.zooapp.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

data class DialogContent(val title: String, val message: String)

@Composable
fun DialogHost(dialogState: MutableState<DialogContent?>) {
    dialogState.value?.let { dialogContent ->
        AlertDialog(
            onDismissRequest = { dialogState.value = null },
            title = { Text(text = dialogContent.title) },
            text = { Text(dialogContent.message) },
            confirmButton = {
                TextButton(onClick = { dialogState.value = null }) {
                    Text("Fechar")
                }
            }
        )
    }
}

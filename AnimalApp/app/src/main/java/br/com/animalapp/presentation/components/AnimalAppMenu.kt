package br.com.animalapp.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun AnimalAppMenu (
    onOptionSelected: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    IconButton(
        onClick = {expanded = true}
    ) {
        Icon(Icons.Default.MoreVert, contentDescription = "Menu")
    }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {expanded = false}
    ) {
        DropdownMenuItem(
            text = { Text("Dog") },
            onClick = {
                expanded = false
                onOptionSelected("Dog")
            }
        )

        DropdownMenuItem(
            text = { Text("Eagle") },
            onClick = {
                expanded = false
                onOptionSelected("Eagle")
            }
        )

        DropdownMenuItem(
            text = { Text("Chicken") },
            onClick = {
                expanded = false
                onOptionSelected("Chicken")
            }
        )

        DropdownMenuItem(
            text = { Text("Frog") },
            onClick = {
                expanded = false
                onOptionSelected("Frog")
            }
        )

        DropdownMenuItem(
            text = { Text("Bear") },
            onClick = {
                expanded = false
                onOptionSelected("Bear")
            }
        )
    }
}
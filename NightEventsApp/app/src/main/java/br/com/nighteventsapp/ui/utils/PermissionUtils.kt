package br.com.nighteventsapp.ui.utils

import android.Manifest
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import com.google.accompanist.permissions.*

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun RequestPermission(
    permission: String,
    onPermissionGranted: () -> Unit,
    onPermissionDenied: () -> Unit = {}
) {
    val permissionState = rememberPermissionState(permission)

    // Rastreia se a permissão já foi solicitada
    var permissionRequested by rememberSaveable { mutableStateOf(false) }

    // Verifica o estado da permissão
    when {
        permissionState.status.isGranted -> {
            onPermissionGranted()
        }
        permissionState.status.shouldShowRationale || permissionRequested -> {
            onPermissionDenied()
        }
        else -> {
            // Solicita a permissão uma vez
            LaunchedEffect(permissionState) {
                permissionRequested = true
                permissionState.launchPermissionRequest()
            }
        }
    }
}

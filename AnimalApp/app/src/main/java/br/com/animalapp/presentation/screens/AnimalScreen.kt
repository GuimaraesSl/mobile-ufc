package br.com.animalapp.presentation.screens

import android.content.Intent
import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.animalapp.R
import br.com.animalapp.VideoPlayerActivity

@Composable
fun AnimalScreen (
    animal: String,
    navController: NavController
) {
    val context = LocalContext.current
    val imageRes = when (animal.lowercase()) {
        "dog" -> R.drawable.doguinho
        "eagle" -> R.drawable.carcara
        "chicken" -> R.drawable.galinha
        "frog" -> R.drawable.crazy_frog
        "bear" -> R.drawable.gummybear
        else -> R.drawable.doguinho
    }
    val soundRes = when (animal.lowercase()) {
        "dog" -> R.raw.wolf
        "eagle" -> R.raw.eagle
        "chicken" -> R.raw.galinha_pintadinha
        "frog" -> R.raw.crazy_frog
        "bear" -> R.raw.gummy_bear
        else -> R.raw.wolf
    }
    val videoRes = when (animal.lowercase()) {
        "dog" -> R.raw.dog_v
        "eagle" -> R.raw.carcara_v
        "chicken" -> R.raw.galinha_pintadinha_v
        "frog" -> R.raw.crazy_frog_v
        "bear" -> R.raw.gummy_bear_v
        else -> R.raw.dog_v
    }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding()
    ) {
        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopStart)
        ) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Voltar")
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "$animal Image",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                try {
                    val mediaPlayer = MediaPlayer.create(context, soundRes)
                    mediaPlayer?.start()
                    mediaPlayer?.setOnCompletionListener {
                        mediaPlayer.release()
                    }
                } catch (e: Exception) {
                    println("Erro ao inicializar MediaPlayer: ${e.message}")
                }
            }) {
                Text("Reproduzir Som")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                val intent = Intent(context, VideoPlayerActivity::class.java)
                intent.putExtra("videoRes", videoRes)
                context.startActivity(intent)
            }) {
                Text("Reproduzir Vídeo")
            }
        }
    }
}


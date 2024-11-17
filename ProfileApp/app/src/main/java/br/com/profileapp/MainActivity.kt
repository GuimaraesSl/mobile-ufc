package br.com.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val profileImage = findViewById<ImageView>(R.id.profileImage);
        val nameText = findViewById<TextView>(R.id.nameText);
        val descriptionText = findViewById<TextView>(R.id.descriptionText);
        val currentJobText = findViewById<TextView>(R.id.currentJobText);
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout);

        nameText.text = getString(R.string.user_name);
        descriptionText.text = getString(R.string.user_description);
        currentJobText.text = getString(R.string.user_job);

        val experiencias = listOf(
            "Estagiário Desenvolvedor Fullstack\nVetta · Estágio\nfev de 2023 - o momento · 1 ano 10 meses\nBelo Horizonte, MG · Remoto",
            "Monitor Bolsista Grupo de Estudos para a Maratona de Programação (GEMP)\nUniversidade Federal do Ceará\nmar de 2022 - dez de 2022 · 10 meses\nQuixadá, CE · Presencial",
            "Gerente e Desenvolvedor\nTheBug Enterprise\njul de 2019 - nov de 2022 · 3 anos 5 meses\nRemoto",
            "Técnico em Redes de Computadores\nDataNet Informática e Telecom - Provedor de Internet\njul de 2019 - ago de 2019 · 2 meses\nTocantinópolis, TO"
        )

        for (experiencia in experiencias) {
            val textView = TextView(this);
            textView.text = experiencia;
            textView.textSize = 16f;
            textView.setPadding(0, 0, 0, 50);
            experienceLayout.addView(textView);
        }

        profileImage.setOnClickListener {
            Toast.makeText(this, "Foto de perfil de Gabriel Al-Samir Guimarães Sales", Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
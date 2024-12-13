package br.com.nighteventsapp.models

import androidx.compose.runtime.mutableStateOf
import br.com.nighteventsapp.R

val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 2,
        title = "Festival de Música Indie",
        description = "Uma noite com os melhores artistas indie.",
        date = "2024-12-20",
        location = "Arena da Música",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    Event(
        id = 3,
        title = "Workshop de Fotografia",
        description = "Aprenda técnicas de fotografia com profissionais.",
        date = "2024-12-18",
        location = "Centro de Convenções",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    Event(
        id = 4,
        title = "Feira de Inovação",
        description = "Exposição de startups e novas tecnologias.",
        date = "2024-12-10",
        location = "Centro Empresarial",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),
    Event(
        id = 5,
        title = "Encontro de Profissionais de Marketing",
        description = "Networking e palestras sobre marketing digital.",
        date = "2024-12-05",
        location = "Hotel Bella Vista",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),
    Event(
        id = 6,
        title = "Festival de Cinema Internacional",
        description = "Exibição de filmes premiados ao redor do mundo.",
        date = "2024-12-12",
        location = "CineTeatro Municipal",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),
    Event(
        id = 7,
        title = "Hackathon 24h",
        description = "Competição de programação em tempo real.",
        date = "2024-12-01",
        location = "Tech Hub",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img7
    ),
    Event(
        id = 8,
        title = "Exposição de Arte Contemporânea",
        description = "Mostra de arte com artistas locais e internacionais.",
        date = "2024-12-08",
        location = "Museu de Arte Moderna",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    Event(
        id = 9,
        title = "Corrida de Rua 5K",
        description = "Participe de uma corrida divertida e saudável.",
        date = "2024-12-22",
        location = "Praia Central",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img9
    ),
    Event(
        id = 10,
        title = "Conferência de Sustentabilidade",
        description = "Discussões sobre práticas sustentáveis no dia a dia.",
        date = "2024-12-25",
        location = "Auditório GreenTech",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img10
    )
)


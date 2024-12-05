package br.com.planetapp.models

import br.com.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val planetList = listOf(
    Planet(
        id = 1,
        name = "Mercury",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "57.91 million km",
        diameter = "4,879 km",
        characteristics = "Smallest planet in the Solar System, no atmosphere.",
        imageRes = R.drawable.mercurio
    ),
    Planet(
        id = 2,
        name = "Venus",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "108.2 million km",
        diameter = "12,104 km",
        characteristics = "Hottest planet due to its thick atmosphere.",
        imageRes = R.drawable.venus
    ),
    Planet(
        id = 3,
        name = "Earth",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "149.6 million km",
        diameter = "12,742 km",
        characteristics = "Supports life, has water and atmosphere.",
        imageRes = R.drawable.terra
    ),
    Planet(
        id = 4,
        name = "Mars",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "227.9 million km",
        diameter = "6,779 km",
        characteristics = "Known as the Red Planet, has the tallest volcano in the Solar System.",
        imageRes = R.drawable.marte
    ),
    Planet(
        id = 5,
        name = "Jupiter",
        type = "Gas Giant",
        galaxy = "Milky Way",
        distanceFromSun = "778.5 million km",
        diameter = "139,820 km",
        characteristics = "Largest planet in the Solar System, famous for its Great Red Spot.",
        imageRes = R.drawable.jupiter
    ),
    Planet(
        id = 6,
        name = "Saturn",
        type = "Gas Giant",
        galaxy = "Milky Way",
        distanceFromSun = "1.434 billion km",
        diameter = "116,460 km",
        characteristics = "Known for its prominent ring system.",
        imageRes = R.drawable.saturno
    ),
    Planet(
        id = 7,
        name = "Uranus",
        type = "Ice Giant",
        galaxy = "Milky Way",
        distanceFromSun = "2.871 billion km",
        diameter = "50,724 km",
        characteristics = "Rotates on its side and has a pale blue color.",
        imageRes = R.drawable.urano
    ),
    Planet(
        id = 8,
        name = "Neptune",
        type = "Ice Giant",
        galaxy = "Milky Way",
        distanceFromSun = "4.495 billion km",
        diameter = "49,244 km",
        characteristics = "Deep blue color, fastest winds in the Solar System.",
        imageRes = R.drawable.netuno
    ),
    Planet(
        id = 9,
        name = "Pluto",
        type = "Dwarf Planet",
        galaxy = "Milky Way",
        distanceFromSun = "5.906 billion km",
        diameter = "2,377 km",
        characteristics = "Once considered the ninth planet, has a heart-shaped glacier.",
        imageRes = R.drawable.plutao
    )
)

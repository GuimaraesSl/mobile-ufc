package br.com.zooapp.models

import br.com.zooapp.R

data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Cachorro",
        species = "Canis lupus familiaris",
        imageRes = R.drawable.dog,
        description = "O cão é um dos animais mais antigos domesticados pelo homem.",
        curiosities = "Os cães têm um olfato cerca de 40 vezes mais potente que o dos humanos."
    ),
    Animal(
        id = 2,
        name = "Gato",
        species = "Felis catus",
        imageRes = R.drawable.cat,
        description = "O gato doméstico é conhecido por sua agilidade e independência.",
        curiosities = "Gatos passam cerca de 70% do dia dormindo."
    ),
    Animal(
        id = 3,
        name = "Elefante",
        species = "Loxodonta africana",
        imageRes = R.drawable.elephant,
        description = "O elefante é o maior mamífero terrestre do mundo.",
        curiosities = "Elefantes têm memória excepcional e podem reconhecer rostos humanos."
    ),
    Animal(
        id = 4,
        name = "Girafa",
        species = "Giraffa camelopardalis",
        imageRes = R.drawable.giraffe,
        description = "A girafa é o animal terrestre mais alto do planeta.",
        curiosities = "Cada girafa tem um padrão único de manchas, como uma impressão digital."
    ),
    Animal(
        id = 5,
        name = "Pinguim",
        species = "Aptenodytes forsteri",
        imageRes = R.drawable.penguin,
        description = "Os pinguins são aves que não voam e vivem predominantemente no hemisfério sul.",
        curiosities = "O pinguim-imperador pode mergulhar até 500 metros de profundidade."
    ),
    Animal(
        id = 6,
        name = "Tigre",
        species = "Panthera tigris",
        imageRes = R.drawable.tiger,
        description = "O tigre é um grande felino conhecido por suas listras únicas.",
        curiosities = "As listras de cada tigre são exclusivas, como impressões digitais."
    ),
    Animal(
        id = 7,
        name = "Canguru",
        species = "Macropus giganteus",
        imageRes = R.drawable.kangaroo,
        description = "Os cangurus são marsupiais nativos da Austrália.",
        curiosities = "Cangurus podem saltar até 3 vezes sua altura."
    ),
    Animal(
        id = 8,
        name = "Flamingo",
        species = "Phoenicopterus roseus",
        imageRes = R.drawable.flamingo,
        description = "Os flamingos são conhecidos por sua plumagem rosa vibrante.",
        curiosities = "A cor dos flamingos vem da alimentação rica em carotenoides."
    )
)

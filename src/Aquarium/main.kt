package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 85
    println("Height is ${myAquarium.height} cm and its volume is ${myAquarium.volume} cm^3")

    val smallAquarium = Aquarium(length=10, width = 5, height = 20)
    smallAquarium.height = 1
    smallAquarium.width = 2
    println("Dimensions of small aquarium are ${smallAquarium.height} x ${smallAquarium.length} x ${smallAquarium.width}")
}

package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 85
    println("Height is ${myAquarium.height} cm and its volume is ${myAquarium.volume} cm^3")
}

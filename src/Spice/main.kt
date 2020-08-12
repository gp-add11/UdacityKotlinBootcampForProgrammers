package Spice

fun main (args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    val listOfSpices = listOf<Spice>(
        Spice("curry", "hot"),
        Spice("pepper", "very hot"),
        Spice("ginger", "little hot"),
        Spice("Green curry", "mild")
    )
    val hotSpices = listOfSpices.filter { it.heat >5 }

    val spice = Spice("cayenne", "spicy")
    makeSalt()
}

fun makeSalt() = Spice("salt")

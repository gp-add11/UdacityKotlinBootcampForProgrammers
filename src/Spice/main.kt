package Spice

fun main (args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    val curry: Spice = Spice("curry", "hot")
    val pepper: Spice = Spice("pepper", "very hot")
    val ginger: Spice = Spice("ginger", "little hot")
    val greenCurry: Spice = Spice("Green curry", "mild")
    val listOfSpices = listOf<Spice>(curry,pepper,ginger,greenCurry)

    val hotSpices = listOfSpices.filter { it.heat >5 }
    //println(hotSpices.forEach { it.name }) --- this is not working
    //val spice = Spice("cayenne", "spicy")

    makeSalt()
}

fun makeSalt() = Spice("salt")

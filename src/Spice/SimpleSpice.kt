package Spice

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"

    val heat: Int
        get() {return 5}
}

fun main (args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
}
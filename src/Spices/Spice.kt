package Spices

sealed class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor) {

    val heat: Int
        get() { return when(spiciness){
            "very hot" -> 10
            "hot" -> 8
            "little hot" -> 6
            "mild" -> 4
            else -> 0
        }
        }
    init {
        println("The spiciness of ${name} is ${heat}")
    }
    abstract fun prepareSpice ()
}


class Curry (name: String, spiciness: String, color: SpiceColor = YellowSpiceColor):
    Spice(name, spiciness, color)
    , Grinder
    , SpiceColor by color
{
    override fun grind() {
        TODO("Not yet implemented")
    }

    override fun prepareSpice() {
        grind()
    }
}

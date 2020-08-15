package Spice


class Spice (val name: String, val spiciness: String = "mild") {
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

}
//("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

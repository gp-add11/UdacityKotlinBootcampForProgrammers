package Spices

fun main(args: Array<String>){
    delegate()

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "hot")),
        SpiceContainer(Curry("Green Curry", "sweet")))
    for(element in spiceCabinet) println(element.label)
}

fun delegate() {
    val curry = Curry(name = "curry", spiciness = "hot")
    println("Curry has has color ${curry.color}")

}

data class SpiceContainer (var spice: Spice){
    val label = spice.name
}
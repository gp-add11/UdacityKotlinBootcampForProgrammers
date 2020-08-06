import java.util.*

fun main(args: Array<String>) {
    println("Hello World from IntelliJ!")
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Fish will eat ${food} on ${day}")
    if (shouldChangeWater(day)) println("Change the water today")

    // Testing fitMoreFish function using given examples:
    print(canAddFish(10.0, listOf(3,3,3))) //f
    print(canAddFish(8.0, listOf(2,2,2), hasDecorations = false)) //t
    print(canAddFish(9.0, listOf(1,1,3), 3)) //f
    print(canAddFish(10.0, listOf(), 7, true))//t
}

fun randomDay() : String{
    val week = listOf("Sunday", "Monday", "Tues", "Wednes", "Thurs", "Fri", "Satur")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    return when(day) {
        "Sunday" -> "fast"
        "Monday" -> "Pellets"
        "Tues" -> "Smaller Fishes"
        "Wednes" -> "Bigger Fishes"
        "Thurs" -> "Vegan"
        "Fri" -> "Plankton"
        "Satur" -> "Random"
        else -> "fast"
    }
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return true
}

fun canAddFish (tankSize: Double // in gallons
                , currentFish: List<Int>  // lengths of all fishes in tank
                , fishSize: Int = 2 //Length of new fish to be added
                , hasDecorations: Boolean = true // whether the tank has decorations
                ) : Boolean {

    val decorationsFactor: Double = if (hasDecorations) 0.8 else 1.0
    return (  (tankSize.times(decorationsFactor)) >= (currentFish.sum()+fishSize) )

}
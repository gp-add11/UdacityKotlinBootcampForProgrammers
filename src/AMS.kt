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
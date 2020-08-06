import java.util.*

fun main(args: Array<String>) {
    println("Hello World from IntelliJ!")
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Fish will eat ${food} on ${day}")
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
import java.util.*

fun main(args: Array<String>) {
    println("Hello World from IntelliJ!")
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Fish will eat ${food} on ${day}")
}

fun randomDay() : String{
    val week = listOf("Sunday", "Monday", "Tues", "Wednes", "Thurs", "Fri", "Satur")
    return week[Random().nextInt(7)]
}
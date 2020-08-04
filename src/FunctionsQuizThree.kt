import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")
    println("3.Quiz: Practice Time")
    dayOfWeek()
}

fun dayOfWeek(){
    println("\"What day is it today?\"")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    //println("It is ${day}th day of the week")

    val dayTest:Int = Calendar.DAY_OF_MONTH //this is static final set to 5
    println("Day of month is ${dayTest}")

    val dayString: String = when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tues"
        4 -> "Wednes"
        5 -> "Thurs"
        6 -> "Fri"
        7 -> "Satur"
        else -> "not a valid day"
    }
    println("It is ${day}th day of the week which is ${dayString}")

    println("===========Printing below as getting random values from this part")
    println(Calendar.DAY_OF_WEEK.toString() + "--- Calendar.DAY_OF_WEEK appears to be a static final variable set to 7")
}
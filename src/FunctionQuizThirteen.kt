fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "stay indoors"
    }
}

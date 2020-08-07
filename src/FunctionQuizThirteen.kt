fun main(args: Array<String>) {
    print("How is your mood today (sad/happy/any other): ")
    val mood : String = readLine()!!
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
/*      ==== Commented as we will be using functions for Quiz Fifteen ====
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "stay indoors"
 */
        isTooHot(temperature) -> "go swimming"
        isHappySunny(mood,weather) -> "go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        else -> "stay indoors"
    }
}

fun isTooHot (temperature: Int ) = temperature > 35
fun isHappySunny (mood: String, weather: String) = (mood == "happy" && weather == "sunny")
fun isSadRainyCold (mood: String, weather: String, temperature: Int) = (mood == "sad" && weather == "rainy" && temperature == 0)

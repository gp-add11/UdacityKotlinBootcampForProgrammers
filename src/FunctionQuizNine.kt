fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun getFortune(birthday : Int) : String {
    val fortunesQuizNine = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    return when(birthday) {
        28 -> "Good day"
        31 -> "Good evening"
        in 1..7 -> "First week is good week"
        else -> fortunesQuizNine[birthday.rem(fortunesQuizNine.size)]
    }
}
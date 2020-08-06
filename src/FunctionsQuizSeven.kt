/**** Commenting this code as Quiz Nine is also based on similar components */
fun main(args: Array<String>) {
    print("Your fortune is: ${getFortuneCookie()}")

    //Extra practice part
    var fortune:String
    for (i in 1..10){
        fortune = getFortuneCookie()
        println("Your fortune is ${fortune}")
        //if(fortune.contains("Take it easy")) break
        if (fortune.toLowerCase().contains("take it easy")) break
    }
}

fun getFortuneCookie() :String {
    val fortunes = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday: ")
    val birthday: Int = readLine()?.toIntOrNull() ?: 0
    val remainderIndex = (birthday)%(fortunes.count())
    return fortunes[remainderIndex]
}


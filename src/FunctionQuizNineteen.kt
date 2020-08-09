import java.util.*

// Lambdas
fun main(args: Array<String>) {
    val rollDice2 = {Random().nextInt(12) +1}
    //val rollDice: (Int) -> Int = {sides: Int -> Random().nextInt(sides) +1}
    val rollDice: (Int) -> Int = {sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides)+1}
    print("Roll is ${rollDice(10)} and ${rollDice2()}")
}
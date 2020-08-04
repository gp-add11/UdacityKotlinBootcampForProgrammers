/*This file for Greetings quiz
Run -> Edit configs -> Prog parameters is set to "01" string, which will be the arg passed into main function

 */

fun main(args: Array<String>){
    println("Test")
    println(" Checking the print of prog argument: ${args[0]}")
    println("Good ${if (args[0].toInt() < 12) "morning" else "night"}, Kotlin")
}
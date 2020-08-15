package Spices

fun main(args: Array<String>){
    delegate()
}

fun delegate() {
    val curry = Curry(name = "curry", spiciness = "hot")
    println("Curry has has color ${curry.color}")

}
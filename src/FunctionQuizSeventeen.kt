//Functions on lists- filter, map etc

fun main(args: Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val sortedSpicesByLength = spices.sortedBy { it.length }
    println(sortedSpicesByLength)

    val filterSpicesCxxE = spices.filter { it[0]=='c' && it[it.lastIndex] == 'e'   }
    println(filterSpicesCxxE)
    val filterSpicesCxxE2 = spices.filter {it[0] == 'c' && it[it.length - 1] == 'e'}
    println(filterSpicesCxxE2)

    val firstThreeSpicesWithC = spices.subList(0,3).filter { it[0] == 'c' }
    println(firstThreeSpicesWithC)

}
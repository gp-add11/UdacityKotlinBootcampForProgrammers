package LessonFiveEssentials

fun main (args: Array<String>) {
    val book1: Book = Book("Kotlin book", "Kotlin author", 2020)
    val titleAuthor = returnTitleAuthorPair(book1)
    val titleAuthorYear = returnTitleAuthorYearTriple(book1)
    println("Here is your ${titleAuthor.first} written by ${titleAuthor.second}")
    println("Here is your ${titleAuthorYear.first} written by ${titleAuthorYear.second} in ${titleAuthorYear.third}")

    println("---------------------")
    val allBooks = setOf("Hamlet", "Romeo Juliet", "Caesar", "Shakespeare's Autobiography", "Midsummer")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") }) // returns boolean

}

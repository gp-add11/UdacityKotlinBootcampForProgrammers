package LessonFiveEssentials

class Book (val title: String, val author: String, val year: Int) {
}

fun main (args: Array<String>) {
    val book1: Book = Book("Kotlin book", "Kotlin author", 2020)
    val titleAuthor = returnTitleAuthorPair(book1)
    val titleAuthorYear = returnTitleAuthorYearTriple(book1)
    println("Here is your ${titleAuthor.first} written by ${titleAuthor.second}")
    println("Here is your ${titleAuthorYear.first} written by ${titleAuthorYear.second} in ${titleAuthorYear.third}")
}

fun returnTitleAuthorPair (book: Book): Pair<String, String> {
    return (book.title to book.author)
}

fun returnTitleAuthorYearTriple (book: Book): Triple<String, String, Int> {
    return (Triple(book.title, book.author, book.year))
}
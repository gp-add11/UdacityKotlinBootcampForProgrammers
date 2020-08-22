package LessonFiveEssentials

class Book (val title: String, val author: String, val year: Int) {
}

fun returnTitleAuthorPair (book: Book): Pair<String, String> {
    return (book.title to book.author)
}

fun returnTitleAuthorYearTriple (book: Book): Triple<String, String, Int> {
    return (Triple(book.title, book.author, book.year))
}
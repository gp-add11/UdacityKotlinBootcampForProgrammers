package Book

open class Book (val title: String, val author: String) {
    private var currentPage: Int = 1
    open fun readPage() {
        currentPage ++
    }
}

class Ebook(title: String, author: String, varformat: String = "text") : Book(title, author) {
    private var wordsRead: Int = 1
    override fun readPage() {
        wordsRead += 250
    }
}
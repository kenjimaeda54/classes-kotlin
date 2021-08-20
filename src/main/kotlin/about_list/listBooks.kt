package about_list

import repository.Books
import java.awt.print.Book

fun main() {
    val book1 = Books(
        author = "Joao",
        name = "Terra Seca",
        year = 1889,
    )
    val book2 = Books(
        author = "Fernando",
        name = "Terra Molhada",
        year = 2014,
        company = "Editora Veja"
    )
    val book3 = Books(
        author = "Pedro",
        name = "Seca",
        year = 1560,
        company = "Samarino"
    )
    val listBook = mutableListOf<Books>(book1, book2, book3)
    println(listBook)
    listBook.add(
        Books(
            author = "JOaozinho",
            name = "Pedrinho",
            year = 1304,
        )
    )
    println(listBook)

    listBook.remove(book1)
    println(listBook)
}
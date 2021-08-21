package about_list

import repository.Books


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
        company = "Samaritano"
    )
    val listBook = mutableListOf<Books>(book1, book2, book3)
    println(listBook)
    listBook.add(
        Books(
            author = "JSozinho",
            name = "Pederast's",
            year = 1304,
        )
    )
    //recorda que estou em uma funcao para chamar preciso estar com funcao fora
    listBook.printList()

    listBook.remove(book1)
    listBook.printList()


}

fun MutableList<Books>.printList() {
    //separador e o que vai acontecer a cada interacao na lista
    val formattedList = this.joinToString(separator = "\n") {
        "-- Autor: ${it.author},-- Nome do livro: ${it.name}"
    }
    println("#### Lista de livros ###\n $formattedList")


}
package about_list

import listBooks.listBook
import printList.printList
import repository.Books

//list em kotlin sao imutaveis e nao podem ser alterados
//porem consigo ler eles

fun main() {
    listBook.add(
        Books(
            author = "JSozinho",
            name = "Pederast's",
            year = 1304,
        )
    )
    //recorda que estou em uma funcao para chamar preciso estar com funcao fora
    listBook.printList()

    listBook.removeAt(1)
    listBook.printList()

    //ordenando por ano de publicação
    //dentro dos criteriosos estabilizados pelo printList, vai imprimir pel ano de publicação
    val sortedList =  listBook.sortedBy { it.year }
    sortedList.printList()

    //vamos filtrar a lista pela primeira letra inicial, ordenar e retornar so os nomes do livro
    //Recorda que o filtro precisa de um parametro para verificar e filtrar algo, o nosso caso que comecem com a
    //letra j
    val name = listBook.filter {   it.author.startsWith("J") }.sortedBy { it.year}.map { it.name }

}


package about_list_null

import listBooks.listBook
import listBooks.listBooksWithNull
import printList.printList

fun main() {
    listBooksWithNull.printList()
    println()
    //Dentro da nossa lista sem nullos temos atributos de cada livro possivelmente nullos, precisamos tratar isso, quando desejamos imprimir por editora
    //retorno do groupBy e conhecido no kotlin como Map,em algumas linguagens como objetos. O valor da chave desse map
    //e o valor que colocamos como verificação, na fucnao grupoBy. Observa que ele retorna nullo em alguns casos, porque nossa
    //editoras tem a possibilidade de ser campo nullo
    //{null = [Books(...) Books(...)  ], Editora =[Books(.....)]   }
   val oi =  listBook
        //se eu imprimir sem tratar vai aparecer editoras nullas na saida,usando operador elvis consigo tratar isso
        //quando for nullo ele traz o valor que colcamos no casso Editora desconhecida
        .groupBy { it.company ?: "Editora desconhecida" }
        //groupBy retorna Map,esse Map possui metodo forEach, consigo pegar as chaves e também a lista completa,
        //no caso desejo apenas os nomes dessa lista
        .forEach { (company, books) ->
            println("$company:  ${books.joinToString(separator = ",") { it.name }} ")
        }

}
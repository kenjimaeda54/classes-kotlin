package printList

import repository.Books

//essa funcao vai lidar com listas nullas,para isto precisa tratar
fun List<Books?>.printList() {
    val formattedList = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            //em koltin existe o safe null, no caso seria it? ,
            //quando ele encontrar algo nulo nesse caso vai imprimir null.
            //Quando desejamos evitar esse comportamento podemos usar o filterNotNull()
            //assim nao preciso usar o safe null,porque sera imprimido so os valores nao nulos
            "Author: ${it.author} -- Nome do Livro: ${it.name}"
        }

    return println("#### Listas de livros ### \n $formattedList")
}

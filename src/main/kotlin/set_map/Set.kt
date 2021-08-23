package set_map

fun main() {
    val watchMovieWithAura = setOf<String>("Carlos", "Pereira", "Marcelo", "JOao")
    val watchWithoutWithAura = setOf<String>("Erika", "Pereira", "Ricardo", "JOao")
    //Ao utilizar o operador plus(+), faco uma concatenação das listas.
    //Utilizando o plus com duas listas sendo setOf, garanto que os valores repetidos sao excluidos .
    //Set nao existe posição, ou seja, para ele nao importa a ordem.
    val newListMovie = watchMovieWithAura + watchWithoutWithAura
    val newListMovie2=  watchMovieWithAura union watchWithoutWithAura
    val newListMovie3 = watchMovieWithAura - watchWithoutWithAura
    val newListMovie4 = watchMovieWithAura subtract  watchWithoutWithAura
    val newListMovie5 = watchMovieWithAura intersect  watchWithoutWithAura
    //com instersect eu represente apenas o s valores que estao nos dois
    println(newListMovie5)
    //usei o operador plus, retorno sera uma nova lisa sem os valores repetidos, ou seja, ao inves de retornar
    //lista com 8 posicoes, sera retornado 6,porque apenas erika e ricardo sao diferentes entre as listas
    //operacoes matematicas como soma e substracao estao presentes no set
    //algo interesante para fazer com o set

    val copyListMovie =  watchMovieWithAura.toMutableList()
    copyListMovie.add("Carlos")
    //ao printar o copyListMovie o resultado sera o carlos duas vezes,para filtrar e retirar os repetidos,pode retornar ao set
    println(copyListMovie)
    val returnSetCopy =  copyListMovie.toSet()
    println(returnSetCopy)
    //carlos sera retirado

}
package array

fun main() {
    //----------------------------------------------------------------------------->
    //fca um programar que retorno, o maior e menor valor de array
    //recorda que metodo forEach e so chamado em uma funcao, porque e do paradigma funcional
    val listArray: IntArray = intArrayOf(1, 56, 4, 94, 67)
    var lowYear = Int.MAX_VALUE //garanto  o mario numero inteiro
    listArray.forEach { year ->
        if (lowYear > year) {
            lowYear = year
        }

    }
    var highYear = Int.MIN_VALUE
    listArray.forEach { year ->
        if (highYear < year) {
            highYear = year
        }
    }
    println("Eu sou o maior numero $highYear")
    println("Eu sou o menor numero $lowYear")

    //-------------------------------------------------------------------------------------------->
    //faca um programa que leia aumente em 110 por cento o valor dos salários de array
    val listSalary = doubleArrayOf(120.30, 530.54, 120.34)
    val increase = 1.1
    //Todos os methods presentes no funcional possuem aqui, filter, map,reducer. Quando precisa usar index, usa prefixo Indexed,mesmo principio do for
    //aqui precisaria do indicie, para isto existe o forEachIndexed, assim consigo pegar o indicie mais o interavel
    listSalary.forEachIndexed { index, value ->
        listSalary[index] = increase * value

    }
    //metodo contentToString() percorre o array e traz os valores de cada ‘item’ em forma de “string”
    println(listSalary.contentToString())

}
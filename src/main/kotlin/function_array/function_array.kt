package function_array

fun main() {
    val listNumber = intArrayOf(12, 35, 65, 8, 34)

    val higherNumber = listNumber.maxOrNull()
    println("$higherNumber e o maior numero")

    val smallerNumber = listNumber.minOrNull()
    println("$smallerNumber e o menor numero")

    val filterNumber = listNumber.filter { it >= 34 }
    print("Estes numeros sao maiores que 34-->")
    filterNumber.map { print(" $it ") }
    println()

    //se encontrar um valor que correspondente a nossa condicao retorna true
    val findNUmber = listNumber.any { it < 10 }
    //vai retornar true porque tem um valor menor que 10 no array
    println(findNUmber)

    //se todas condicoes forem verdadeiras retorna true
    val haveNumber = listNumber.all { it >= 10 }
    //vai retornar false porque temos numero menor que 10.
    println(haveNumber)

    //funcao para calcular media do array
    val averageNumber = listNumber.average()
    println(averageNumber)

}
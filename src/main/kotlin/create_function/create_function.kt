package create_function

import java.math.BigDecimal
import java.math.RoundingMode


fun main() {
    //passo 1
    //cliente deseja aumentar os salários 110 por cento ,mas garantindo
    //que no minima para cada funcionário seja 500 reais
    //vamos usar bigDecimal, porque doubleArray nao e ideal para uso de casas decimais.
    //doubleArray nao possui recursos como intArrayOf, doubleArrayOf. Então vamos criar nossa funcao

    //passo 2
    //somar todos os valores do array

    //passo 3
    //pegar o gasto inicial,e com este valor saber  os próximos 6 meses

    //passo4
    //fazer media dos 3 primeiros salarios mais altos e os 3 primeiros mais baixo
    val bigDecimalNumbers = bigDecimalArrayOf("2300.20", "5000.20", "7030.10", "8300.20", "1800.30")

    val increaseSalary = 1.1

    val newSalary = bigDecimalNumbers.map {
        bigDecimal(it, increaseSalary)
    }.toTypedArray()
    println(newSalary.contentToString())
    val totalSalary = newSalary.reduceCustom()
    println("Valor total dos salarios e $totalSalary")

    //faldo e ideal quando desejamos possuímos valor inicial para cálculo, parecido com reduce, porem tem a possibilidade
    //de agregar valor inicial
    val month = "6".toBigDecimal()
    val salarySpending = newSalary.fold(totalSalary) { acc, value ->
        acc + (value * month).setScale(2, RoundingMode.UP)
    }
    println("$salarySpending e  valor total para os próximos 6 meses")

    //Primeiro vamos ordenar, depois usar a funcao take. Funcao take permiti pegar quantidade de elementos
    //que desejamos, exemplo se passarmos 4,vai pegar os 4, primeiros
    //takeLeast pega os últimos
    val averageHighSalary = newSalary.sorted().takeLast(3).toTypedArray().averageCustom()
    val averageLowSalary = newSalary.sorted().take(3).toTypedArray().averageCustom()
    println("A media dos salários mais altos sao: $averageHighSalary")
    println("A media :  $averageLowSalary")
}

private fun bigDecimal(it: BigDecimal, increaseSalary: Double) = if (it < "5000.00".toBigDecimal()) {
    (it + "500".toBigDecimal()).setScale(2, RoundingMode.UP)
} else {
    (it * increaseSalary.toBigDecimal()).setScale(2, RoundingMode.UP)
}

//varag e um tipo especial, e usado quando desejo passar varios valor
// Exemplo vamos passar um array de ‘string’ do tipo bigDecimal
fun bigDecimalArrayOf(vararg value: String): Array<BigDecimal> {
    //it e um indicie interavel,proprio  kotlin fornece este recurso
    return Array(value.size) {
        value[it].toBigDecimal()
    }

}

//koltin fornece recurso que chama extensions functions, Array<bigDecimal> nao e primitivo,entao  sera
//criado nossa propria funcao reduce. Caso fosse um array primitivo era possivel usar o sum()
//Para acessar o contexto da funcao precisa do this
fun Array<BigDecimal>.reduceCustom(): BigDecimal {
    return this.reduce { accumulator, bigDecimal ->
        accumulator + bigDecimal
    }
}

//mesmo principio nao existe uma funcao average para um array nao primitivo
fun Array<BigDecimal>.averageCustom(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        val valueTotal = this.reduce { acc, bigDecimal -> acc + bigDecimal }
        valueTotal / this.size.toBigDecimal()
    }
}
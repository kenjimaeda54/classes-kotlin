package create_function

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    //cliente deseja aumentar os salários 110 por cento ,mas garantindo
    //que no minima para cada funcionário seja 500 reais
    //vamos usar bigDecimal, porque doubleArray nao e ideal para uso de casas decimais.
    //doubleArray nao possui recursos como intArrayOf, doubleArrayOf. Então vamos criar nossa funcao
    val arrayBigDecimal = bigDecimalArrayOf("2000.20", "5000.30", "1500.20", "8300.20")
    val increaseSalary = 1.1
    //por fim transformo em um array
    val newSalary = arrayBigDecimal.map {
        if (it <= "5000.0".toBigDecimal()) {
            (it + "500.00".toBigDecimal()).setScale(2,RoundingMode.UP)
        } else {
            (it * increaseSalary.toBigDecimal()).setScale(2, RoundingMode.UP)
        }

    }.toTypedArray()
    println(newSalary.contentToString())
}

//varag e um tipo especial, e usado quando desejo passar varios valores
// Exemplo vamos passar um array de string do tipo bigDecimal
fun bigDecimalArrayOf(vararg value: String): Array<BigDecimal> {
    //it e um indicie interavel,proprio  kotlin fornece este recurso
    return Array(value.size) {
        value[it].toBigDecimal()
    }
}
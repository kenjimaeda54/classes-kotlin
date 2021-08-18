fun main() {

    val rangeNumber = 1.rangeTo(10)
    //no map para o kotlin it ja e o interavel, então redundante nao preciso inserir
    rangeNumber.map { println(it) }

    //---------------------------------------------  forma curta do rangeTo,recorda que ele pega ate o ultimo valor
    // entao vai imprimir do 1 ate 20 >
    println()
    val shortRangeNumber = 1..20
    //aqui decidi chamar de value, então compilador nao acusa erro de redundante
    shortRangeNumber.map { value -> println(value) }

    //---------------------------------------------  forma curta do rangeTo, imprimindo a cada 2>
    println()
    val shortRangePara = 2..20 step 2
    shortRangePara.map { println(it) }

    //---------------------------------------------   until, imprimi e nao inclui o último nesse caso
    //  10, também aceita todos metodos que os antecessores>
    println()
    val untilNumber = 1.until(10)
    untilNumber.forEach { println(it) }

    //---------------------------------------------   downTo, imprimi inverso, ou seja, nosso caso do 5
    //  ate 0 >
    println()
    val dowNumber = 5 downTo 1
    dowNumber.forEach { println(it) }

    //---------------------------------------------  conferindo se um valor esta em um range
    println()
    val salaryEmployee = 2200.2..5200.14
    val salary = 3200.2
    if (salary in salaryEmployee) {
        print("Esta dentro do valor")
    } else {
        print("Nao esta dentro")
    }

    //---------------------------------------------  conferindo se valor esta em range ‘string’
    println()
    val alphabet = "a".."z"
    val letter = "c"
    val letter2 = "C"
    //retorna true se existe ou false se nao existe, no range de string
    print(letter in alphabet)// retorna true
    println()
    print(letter2 in alphabet)//retorna false
}
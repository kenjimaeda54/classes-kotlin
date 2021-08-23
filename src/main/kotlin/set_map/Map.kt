package set_map

fun main() {
    //metodo 3 to 20 e o mesmo que Pair porem mesmo performatico
    val mapRequests = mutableMapOf(Pair(1, 32), Pair(5, 23), 3 to 20, 4 to 30, 5 to 100, 6 to null)
    val mapNumbers = mutableMapOf(Pair(1, 32), Pair(5, 23), 3 to 20, 4 to 30, 2 to 100, 6 to 100, 5 to 100, 11 to 89,23 to 100)


    //Para trabalhar com valores nulos além do elvis e possível usar let. Vantagem do comportamento do let que ele e um escopo de funcao
    val mapKey = mapRequests[0].let { it ->
        "Endereço  $it"
    }
    //vai retornar nada porque nao existe indicie no map
    println(mapKey)
    val mapKeyOK = mapRequests[1].let {
        "key $it"
    }
    //vai retornar 32 porque a key 1 seu valor e literalmente 32
    println(mapKeyOK)

    mapRequests.map {
        println(
            "Identificador do pedido ${it.key}\nValores do pedido ${it.value}"

        )

    }
    //Para adicionar valores no map possuímos metodos como put,putAll o comum e utilizar a expressao abaixo.
    //porem e so permitido adicionar com mutableMapOF.
    mapRequests[5] = 300
    //estou a adicionar a chave 5 com valor 300 se a chave existir sobrescreve o valor
    println("1 -- $mapRequests")
    mapRequests[5] = 200
    // vai ocorrer uma atualização na chave 5 com valor de 200, ou seja, o metodo de adicionar e atualizar sao os mesmos
    println("2 --- $mapRequests")
    //Quando estiver adicionado, para garantir que nao ocorra de forma inesperada atualização  em chaves que nao deseja pode usar procedimento abaixo
    mapRequests.putIfAbsent(1, 1000)
    println("3 -- $mapRequests")
    //nao vai mudar o map, porque possui a chave "1", se nao possui ele adiciona,
    mapRequests.putIfAbsent(9, 1000)
    println("4 --- $mapRequests")

    //para remover e possível  com chave ou sobrecarga
    //no caso de sobrecarga precisa possuir a chave e o valor exato
    mapRequests.remove(1)
    //remove o 1 porque uso apenas a key
    println("5--- $mapRequests")
    mapRequests.remove(3, 20)
    //vai remover porque a key 3 o valor e 20
    println("6--- $mapRequests")

    // se nao existir retorna o valor que colocamos

    val isHaveKey = mapRequests.getOrElse(6) {

        "Nao existe o valor"
    }
    println("Resultado do getElse $isHaveKey")
    val defaultKey = mapRequests.getOrDefault(15, 3)
    //interessante do  getOrDefault , se a chave for nula ele retorna o null. E nao existir a chave retorna valor padrao que colocamos
    println("Resultado do getDefault $defaultKey")

    try {
        val isHave2 = mapRequests.getValue(10)
        println("Resultado do getValue  $isHave2")
    } catch (e: Exception) {
        println("Nao existe essa chave")
        //vai printar nao existe essa chave, porque try e catch pegou uma exception, se for retirada o try e catch vai quebrar o programa
    }

    val alley = mapRequests.keys
    println("Todas key $alley")

    val allValue = mapRequests.values
    println("Todas values $allValue")



    val mapFiltered = mapNumbers.filter { (key, value) ->
        key > 3 && value % 2 == 0
    }
    println("Chaves maior que 3 e valores pares \n $mapFiltered")

    val mapKeyFiltered = mapNumbers.filterKeys {
        it > 3
    }
    println("Keys maior que 3  \n $mapKeyFiltered")

    val mapValueFiltered = mapNumbers.filterValues {
        it > 30
    }
    println("Valores maior que 30 \n $mapValueFiltered")

    //para adicionar map existe opcoes  convencidas   e += , para retirar -= efeito e aplicado apenas nas chaves
    mapNumbers += listOf(Pair(15, 50))
    println("Adicionei um novo Pair $mapNumbers")
    mapNumbers -= 5
    println("Removi a chave o pair com a chave 5 $mapNumbers")
    mapNumbers.keys.remove(3)
    println("Removi a chave do elemento 3 $mapNumbers")
    //no caso do values ele remove o primeiro valor que encontrar
    mapNumbers.values.remove(100)
    println("Removi o primeiro elemnto com valor 100 $mapNumbers")


}

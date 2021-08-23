package behavior

fun main() {
    val demands = listOf<Demand>(
        Demand(3, 50),
        Demand(9, 100),
        Demand(25, 20),
        Demand(45, 12),
        Demand(1, 31)

    )

    //{3=Demand(id=3, value=50), 9=Demand(id=9, value=100), 25=Demand(id=25, value=20), 45=Demand(id=45, value=12), 1=Demand(id=1, value=31)}
    //observacao caso coloque para associar por it.value em frente ao ines de aparecer o id vai aparecer o valor
    val behaviorMap = demands.associateBy {
        it.id
    }

    //agora consigo deletar uma chave facilmente com o id ja que  ele e um map.

    val newBehavior = behaviorMap - 3
    //vai retornar mesmo map acima mesmo a chave 3
    //{9=Demand(id=9, value=100), 25=Demand(id=25, value=20), 45=Demand(id=45, value=12), 1=Demand(id=1, value=31)}
    println(newBehavior)

    val behaviorMapWith = demands.associateWith {
        it.value > 5
    }
    println(behaviorMapWith)
    //repare que o comportamento do associateWith e diferente do by, um imprimi na frente outro atras
    //{Demand(id=3, value=50)=true, Demand(id=9, value=100)=true, Demand(id=25, value=20)=true, Demand(id=45, value=12)=true, Demand(id=1, value=31)=true}
    //Recorda que map so pode ter chave unica, ou seja, se tentar associar o  exemplo de associateWith  para associateBy vou receber
    //um map com apenas false ou true e restante sera excluído. Para solucionar este problema temos o groupBY

    val freeShipping = demands.groupBy {
        it.value > 30
    }
    println(freeShipping)

    //{true=[Demand(id=3, value=50), Demand(id=9, value=100), Demand(id=1, value=31)], false=[Demand(id=25, value=20), Demand(id=45, value=12)]}
    //nessa estrutura e facil eu encontrar os valores verdadeiros apenas fazendo o procedimento abaixo
    val value = freeShipping[true]
    println("valores verdadeiros $value")

    val names = listOf<String>("ANa","Ana Carla","Armando","Carla","Fernando","Joao","Beatriz")
    val diary = names.groupBy {
        it.first()
    }
    //Lembrando que e um char entao ''
    val nameA = diary['A']
    println("Pessoas que comecem copm a $nameA")

}

data class Demand(val id: Int, val value: Int)
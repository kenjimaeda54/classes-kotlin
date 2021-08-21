# Kotlin primeiro passo

Classes e construtores em Kotlin

### Heranca em Kotlin

Para utilizar conceito de herança em Kottlin precisa colocar a palavra reservada open na frente da classe que desejo
abstrair Herança e ideal quando desejo herdarem tudo que tem em uma classe para estender em outra

### Overlaod e Override

OverRide e quando desejo editar uma função que estou herdando, para isto função que esta sendo abstraida precisa estar
com a palavra reservado open. Overload e conceito quando utilizo mesmo nome de função, parâmetros parecidos, mas agrego
ou altero os parametros.

```Kotlin

open class Machines(private val brand: String) {
    open fun showBrand() {
        println("Marca -> $brand")
    }
}


//aqui e um overload
fun overload(id: Int) = println("Que id maneiro ")
fun overload(id: Int, name: String) = println("Que id maneiro ")
fun overload(id: Int, old: Int) = println("Que id maneiro ")
```

## Constante e Variveis Estaticas

Para declarar uma variável ou constante estática utilizo companion object ou object Diferença notável entre companion
object e object. Object preciso necessariamente de um nome para descrever o membro estático isto já não ocorre em
companion object Membros e constates estáticas não precisam ser instanciadas, para serem usados ou seja nesse casso
especifico Posso colcoar Apertmente.Room.value. Colando a palavra reservada private constructor,garanto que não será
possível instanciar essa classe, gerando assim mesma possibilidade de erro.

```kotlin
class Apartment private constructor() {
    companion object {
        const val room = 3
        fun color() {
            //color e um membro estatico
            println("Que cor linda")
        }
    }

    object ROOM {
        const val value = 10

        object COLORS {
            const val blue = "blue"
        }
    }
}

```

## Classes abstratas e interfaces

Classes abstratas eu herdo, interfaces eu implemento CLasses abstratas e interfaces eu preciso implementar os membros da
classe abstraída. Não existe no java e Kotlin multi herança, mas com interface posso realizar varias chamada interfaces
Para chamar o valor de uma variável na classe abstrata preciso usar o init, ele e chamado independente do construtor
Interfaces podem ter corpos e para referenciar qual função estou referindo pode usar super<interface>.método

```kotlin

abstract class Mammal(var idiom: String) {
    var weigth = 0f
    abstract fun speak();
}


class Dog(idiom: String, myWeight: Double) : Mammal(idiom) {
    //quando quero pegar a variavel de uma classe abstrata uso o init
    //init vai ser inicializada indepentedente do construtor
    init {
        this.weigth = myWeight.toFloat();
    }

    override fun speak() {
        println("Eu falo $idiom")
    }
}


interface Machines1 {
    fun power()
}

interface Machines2 {
    fun power() {
        println("Eu sou uma maquina")
    }
}


class Mymachines : Machines1, Machines2 {
    override fun power() {
        super<Machines2>.power()
    }

    //Machines2 tem um corpo entao e possivel usar super<Machines2>.power()
    //Essa anotacao e interassante quando possuo duas interfaces com mesmo corpo.
}





```

## Polimorfismo

Polimorfismo e a capacidade de entidade assumir vários formas, exemplo e a “interface” Employe vantagem e que caso uma
nova classe aparecer e implementar a ‘interface’, não precisara fazer novamente a implementação, porque esta pronta

```kotlin
interface Employee {
    fun bonus();
}


fun main() {
    val employOne: Employee = Manager();
    val employTwo: Employee = Techinican();
    results(employOne);
    results(employTwo);
}

fun results(calculate: Employee) {
    calculate.bonus()
}





```

### Array em Kotlin

- Kotlin da suporte aos metodos conhecidos do paradigma funcional Map,reduce,filter,forEach.
- As particularidades estão no momento de usar o indices. No kotlin para utilizar o indicie usamos a palavra reservada
  Indexed na frente da funcao. Exemplo: mapIndexed,forEachIndexed...
- Em kotlin os arrays precisam saber previamente o seu tamanho, ou seja, preciso especificar o tamanho do array é apos
  especificado esse tamanho nao posso muda. Para lidar com cenarios aonde nao sabemos o tamanho do array ideal e usarmos
  arrayOf, dai usamos a palavra reservada para determinar o seu tipo, exemplo: intArrayOf caso seja inteiro,
  doubleArrayOf se forem pontos flutuantes
- Para saber o maior valor de um atributo do array posso usar o Max_Value e no caso do menor o Min_Value
- Quando desejo imprimir os valores do array aqui preciso usar o metodo contentToString
- Kotlin possui alguns recursos interessantes no array como any, ele vai buscar no seu array valor que voce especificou,
  se achar um valor retorna true, se nao achar nenhum retorna false. Outro metodo interessante e o all, caso todoas as
  condicoes precisam ser verdadeiras para retornar true se nao retorna false
- Para media existe o average().
- Para trabalhar com decimais, ideal e usar BigDecimal. BigDecimal nao e array primitivo para usar os recursos do
  array,utilizei feature interessante do Kotlin que e extensions function, seria mesmo principio quando utiliza
  Array.map,porem sera uma extensao costumizada

```kotlin

fun main() {
    //----------------------------------------------------------------------------->
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

    val listNumber = intArrayOf(12, 35, 65, 8, 34)

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


```

### Listas

- Utilizei recurso interessante conhecido como dataClass. Parecido com o princípio de ‘interface’ do typescript, voce
  determina um modelo da sua lista. Depois implementa a sua lista, seguindo esse modelo.
- Nessa caso foi implementado duas listas uma com possíveis valores nulos e outra sem essa possibilidade.
- Para trabalhar com listas nulos foi usado operador elvis ?: que determina um valor padrão, caso a nossa constante seja
  nulo retorna outro valor, exemplo de uso esta funcao groupBy ao lado do it.company.
- GroupBy retorna um Map, seria conhecido em algumas linguagens como objeto, possui uma chave e uma lista dentro. Esta
  chave e determinado pelo, um inteirado, que no caso colocamos editora, repara que alguns casos retornos null, porque
  na lsitas o campo editora com o operador self null (?) = null, possibilitamos caso nao houver editora seria retornado
  null. { null = [Books(...) Books(...) ], Editora = [Bookks()]  }, ou seja, possui uma chave e uma lista dentro.
- Recurso interessante que usei em conjunto com groupBy e o joinToString,ele formata a listas conforme voce deseja
- Para imprimir de forma personalizada criamos a nossa propria funcao extende, nesse caso para evitar retonro null,
  usamos a funcao filterNotNull()
- So e possível retornar nullo se usamos o operador self null (?),caso a contrario geraria um expection null

```kotlin
data class Books(
    var author: String,
    var year: Long,
    var company: String? = null,
    var name: String,
)


//-------------------------------//

val listBook = mutableListOf(

    Books(
        author = "Joao",
        name = "Terra Seca",
        year = 1889,
    ),
    Books(
        author = "Fernando",
        name = "Terra Molhada",
        year = 2014,
        company = "Editora Veja"
    ),
    Books(
        author = "Pedro",
        name = "Seca",
        year = 1560,
        company = "Sam franciso"
    ),
    Books(
        author = "Erika",
        name = "Seca MOlahda",
        year = 1860,
        company = "Samaritano"
    ),
    Books(
        author = "Fernandinho",
        name = "MOlhado",
        year = 1360,
    ),
    Books(
        author = "Sabaita",
        name = "Indio",
        year = 1560,
        company = "Samaritano"
    ),


    )

val listBooksWithNull = mutableListOf(
    Books(
        author = "Joao",
        name = "Terra Seca",
        year = 1889,
    ),
    null,
    Books(
        author = "Fernando",
        name = "Terra Molhada",
        year = 2014,
        company = "Editora Veja"
    ),
    Books(
        author = "Pedro",
        name = "Seca",
        year = 1560,
        company = "Sam franciso"
    ),
    null,
    Books(
        author = "Erika",
        name = "Seca MOlahda",
        year = 1860,
        company = "Samaritano"
    ),
    Books(
        author = "Fernandinho",
        name = "MOlhado",
        year = 1360,
    ),
    Books(
        author = "Sabaita",
        name = "Indio",
        year = 1560,
        company = "Samaritano"
    ),
)
val oi = listBook
    //se eu imprimir sem tratar vai aparecer editoras nullas na saida,usando operador elvis consigo tratar isso
    //quando for nullo ele traz o valor que colcamos no casso Editora desconhecida
    .groupBy { it.company ?: "Editora desconhecida" }
    //groupBy retorna Map,esse Map possui metodo forEach, consigo pegar as chaves e também a lista completa,
    //no caso desejo apenas os nomes dessa lista
    .forEach { (company, books) ->
        println("$company:  ${books.joinToString(separator = ",") { it.name }} ")
    }

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

```
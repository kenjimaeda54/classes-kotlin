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
- Kotlin possui alguns recursos interessantes no array como any, ele vai buscar no seu array  valor que voce especificou, se achar um valor retorna true,
se nao achar nenhum retorna false. Outro metodo interessante e o all, caso todoas as condicoes precisam ser verdadeiras para retornar true se nao retorna false
- Para media existe o average().

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

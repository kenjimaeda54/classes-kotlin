# Kotlin primeiro passo
Classes e construtores em Kotlin

### Heranca em Kotlin

Para utilizar conceito de heranca em kotlin precisa colocar a palavra reservada open na frente da class que desejo abstrair
Heranca e ideial quando desejo herdar tudo que tem em um classe para extender em outra

### Overlaod e Override
OverRide e quando desejo editar uma funcao que estou herdando,para isto funcao que esta sendo
abstraida precisa estar com a palavra reservado open

overload e conceito quando utilizo mesmo nome de funcao,parametros parecidos,mas agrego ou altero os pametros

```Kotlin

open class Machines(private val brand: String) {
   open fun showBrand() {
        println("Marca -> $brand")
    }
}



//aqui e um overload
fun overload(id: Int) = println("Que id maneiro ")
fun overload(id: Int,name: String) = println("Que id maneiro ")
fun overload(id: Int,old: Int) = println("Que id maneiro ")
```

## Constatne e Variveis Estaticas

Para declarar uma variavel ou constante estatica utilizo companion object ou object
Diferenca  notavel entre companion object e object. 
Object preciso necessariamente de um nome  para decrever o membro estatico isto ja nao ocorre em companion object
Membros e constates estaticas nao precisam ser instanciadas, para serem usados ou seja nesse casso especifico 
posso colcoar Apertmente.Room.value
Colando a palavra reservada private constructor,garanto que nao sera possivel instanciar essa classe,gerando assim mesna possibilidade de erro.

```kotlin
class Apartment private constructor(){
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
Classes abstratas eu herdo,interfaces eu implemento 
CLasses abastratas e interfaces eu preciso implementar os membros da classe abstraida.
Nao existe no java e Kotlin multi heranca,mas com interface posso realizar varias chamadas de interface
Para chamar o valor de uma variavel na classe abstrata preciso usar o init,ele e chamado independente do construtor
Interfaces podem ter corpos e para referenciar qual funcao estou referindo pode usar super<interface>.metodo


```kotlin

abstract  class Mammal(var idiom: String  ) {
    var weigth = 0f
    abstract  fun speak();
}


class Dog(idiom: String, myWeight: Double): Mammal(idiom) {
    //quando quero pegar a variavel de uma classe abstrata uso o init
    //init vai ser inicializada indepentedente do construtor
    init {
        this.weigth = myWeight.toFloat();
    }

    override fun speak() {
        println("Eu falo $idiom")
    }
}


interface Machines1{
    fun power()
}

interface  Machines2{
    fun power(){
        println("Eu sou uma maquina")
    }
}


class Mymachines: Machines1,Machines2{
    override fun power() {
        super<Machines2>.power()
    }

    //Machines2 tem um corpo entao e possivel usar super<Machines2>.power()
    //Essa anotacao e interassante quando possuo duas interfaces com mesmo corpo.
}





```

## Polimorfismo
Polimorfismo e a capacidade de intidade assumir varios formas, exemplo e a interface Employe
vantagem e que caso uma nova classe aparecer e implementar a interface ,nao precisara fazer
novamente a implementacao,porque esta pronto


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

## Listas em Kotlin
Kotlin nao possui listas especificas,sao todas do java.
Abaixo algumas listas interesantes 


```kotlin
    val s1 =  listOf("Madrid","Franca","Espanha")
    //listOf  sao listas imutaveis,mesmo conceito que array em outras linguagues porem imutavel
    val s2 = mutableListOf("Madrid","Franca","Espanha")
    //mutableListof sao listas mutaveis, ou seja consido adicionar,remover...
    val s3 = arrayListOf("Madrid","Franca","Espanha")
    //sao arrai de implementacao do java ou seja possui add,remove...
    val s4 =  setOf("Madrid","Franca","Espanha")
    //setof seria exemplo de listOf porem nao aceita valores repetidos, se eu repetir franca,espanha.. ele ignora
    val s5 = mutableSetOf("Madrid","Franca","Espanha")
    //mutableSetOf mesmo conceito de setOf porem imutavel
    val s6 = hashMapOf(Pair("Franca","Paris"), Pair("Pais","Brasil"))
    //hasMapOf e o conceito de array de objeetos pressente em java script, atravas das chaves consigo
    //pegar os valores exemplo s6["Franca"] vou receber Paris,
    val s7 = mapOf(Pair("Franca","Paris"), Pair("Pais","Brasil"))
    //mapOf mesmo conceito de hasMapOf porem imutavel
    val s8 = mutableMapOf(Pair("Franca","Paris"), Pair("Pais","Brasil"))
    //mesmo principio que mapOf porem mutavel


```
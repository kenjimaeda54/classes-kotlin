abstract  class Mammal(var idiom: String  ) {
    var weigth = 0f
    abstract  fun speak();
}

//tdoa classe abastrata que for usada pela outra classe,precisa usar os membros
//dog precisa usar speak()
//classes abastratas nao podem ser instanciadas diretamente
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

class Cat(idiom: String): Mammal(idiom) {
    override fun speak() {
        println("Eu falo miau")
    }
}

fun main() {

   val dog = Dog("auau", myWeight = 20.00);
   println(dog.weigth)

}
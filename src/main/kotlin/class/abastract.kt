abstract  class Mammal(var idiom: String  ) {
    var weigth = 0f
    abstract  fun speak();
}


class Dog(idiom: String, myWeight: Double): Mammal(idiom) {
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

class People(var name:String){
    fun greeting(){
        println("Ola $name ")
    }
}

class Car(var brand:String){
    //para chamar mais que uma classe preciso de um construtor
    private var year: Int? = null
    constructor(brand:String,year:Int): this(brand){
        this.year = year
    }
    fun detailsCar(){
        println("Meu carro e da marca $brand e o ano e $year")
    }
}


fun main() {
    //em Kotlin as classes precisam possuir mesma quantidade de parametros,minha classe People tem dois
    //parametros aqui preciso de dois tambem
    val peopleGreeting: People = People(name="Rafel");
      peopleGreeting.greeting();
    //em kotlin para instanciar uma classe com mais parametros precisa ser construido um construtor
    val brandCar: Car = Car(brand = "Ford")
    val car: Car = Car(brand="Porshe", year = 2020)
    brandCar.detailsCar();
    car.detailsCar();
}

class People(var name: String){
    fun greeting () {
        println("Ola me chamo $name");
    }
}

class Car(var brand: String){
    //para chamar mais que uma classe preciso de um construtor
    var year: Int? = null;
    constructor(brand:String,year:Int): this(brand){
        this.year = year
    };

    fun car() {
        println("Meu carro e da marca $brand e o ano de fabricacao e $year");
    }
}


fun main(){
    //em Kotlin as classes precisam possuir mesma quantidade de parametros,minha classe People tem dois
    //parametros aqui preciso de dois tambem
    val greetingPeople: People =  People(name =  "Ricardo");
    //em kotlin para instanciar uma classe com mais parametros precisa ser construido um construtor
    val brandCar: Car = Car(brand = "Ford")
    val carCompet: Car = Car(brand="Ferrari", year = 2020)
    brandCar.car()
    carCompet.car()
    greetingPeople.greeting()

}
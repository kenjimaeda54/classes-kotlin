open class Machine(private val brand: String) {
    fun showBrand() {
        println("Marca -> $brand")
    }
}

//heranca em kotlin precisa colocar a palavra reservada open na frente da class que desejo abstrair
//heranca e ideial quando deseja herdar tudo que tem em um classe para extendner em outra

class Computer(brand: String, private val value: Int) : Machine(brand) {
    fun price() {
        println("Este computador custa  $value")
    }
}

fun main() {
    val machines = Computer(brand = "HP", value = 1250);
    with(machines) {
        machines.price()
        machines.showBrand()
    }

}
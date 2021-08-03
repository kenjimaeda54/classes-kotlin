open class Machine(private val brand: String) {
    fun showBrand() {
        println("Marca -> $brand")
    }
}


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
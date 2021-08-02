open class Machines(private val brand: String) {
   open fun showBrand() {
        println("Marca -> $brand")
    }
}

//overRide e quando desejo editar uma funcao que estou herdando,para isto funcao que esta sendo
//abstraida precisa estar open
//overload e conceito quando utilizo mesmo nome de funcao,parametros parecidos,mas agrego ou altero os pametros

class Computers(brand: String, private val value: Int) : Machines(brand) {
    override fun showBrand() {
         "Agora estou fazendo uma override"
    }

    fun price() {
        println("Este computador custa  $value")
    }

    //aqui e um overload
    fun overload(id: Int) = println("Que id maneiro ")
    fun overload(id: Int,name: String) = println("Que id maneiro ")
    fun overload(id: Int,old: Int) = println("Que id maneiro ")


}

fun main() {
    val machines = Computers(brand = "HP", value = 1250);
    with(machines) {
        machines.price()
        machines.showBrand()
    }

}
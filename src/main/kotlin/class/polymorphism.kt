interface Employee {
    fun bonus();
}

class Manager : Employee {
    override fun bonus() {
        println("Bonus do gerente e 500")
    }

}

class Techinican : Employee {
    override fun bonus() {
        println("Bonus do tecnico e 200")
    }

}

//polimorfismo e a capacidade de algo assumir varios formas, exemplo e a interface Employe
//vantagem e que caso uma nova classe aparecer e implementar a interface ,nao precisara fazer
//novamente a implementacao,porque esta pronto
fun main() {
    val employOne: Employee = Manager();
    val employTwo: Employee = Techinican();
    results(employOne);
    results(employTwo);
}

fun results(calculate: Employee) {
    calculate.bonus()
}
interface Machines1 {
    fun  power(){
        println("Eu so ligo")
    }
}

interface  Machienes2 {
    fun power()
}


class StateMachine: Machines1,Machienes2 {

    override fun power() {
       super<Machines1>.power()
    }
    //Machines1 tem um corpo entao e possivel usar super<Machines1>.Power()
    //Essa anotacao e interassante quando possuo duas interfaces com mesmo corpo.

}

fun main() {
    StateMachine()
}
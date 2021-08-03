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


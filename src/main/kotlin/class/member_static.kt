class Apartment private constructor(){
    companion object {
        const val room = 3
        fun color() {
            //color e um membro estatico
            println("Que cor linda")
        }
    }

    object ROOM {
        const val value = 10

        object COLORS {
            const val blue = "blue"
        }
    }
}


fun main() {
    println(Apartment.room);
    println(Apartment.color());
    println(Apartment.ROOM.value)
    println(Apartment.ROOM.COLORS.blue)
}
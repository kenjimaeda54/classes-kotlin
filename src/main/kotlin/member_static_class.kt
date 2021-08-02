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
//diferenca mais notavel entre companion object e object.Object preciso necessariamente de um nome algo
//que nao ocorre em companion object
//membros e constates estaticas nao precisam ser instanciadas
//colando a palavra reservada priavte constructor,garanto que nao sera possivel instanciar essa classe
//toda escrita esta refaturado com convecao do Kotlin ou seja object e em maisculo
//e as constantes estaticas vem ao lado o nome de constante

fun main() {
    println(Apartment.room);
    println(Apartment.color());
    println(Apartment.ROOM.value)
    println(Apartment.ROOM.COLORS.blue)
}
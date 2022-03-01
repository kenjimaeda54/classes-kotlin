package about_list


//listOf e da familia de list  em kotlin,
// os list sao imutaveis e nao podem ser alterados
//porem consigo ler eles
fun main(args: Array<String>) {
    val colors = listOf("blue", "green", "yellow")
    println("colors: $colors")

    //lsit podem ter valores repetidos
    //porem seu tipo geneerico devem ser iguais
    val numbers = listOf(1, 2, 3, 4, 2, 3, 5)
    println("numbers repeated: $numbers")


    //lista vazia precisa declar seu tipo
    val emptyList: List<Int> = listOf()
    println("emptyList: $emptyList")


    //lista de listas
    val listOfLists = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    println("listOfLists: $listOfLists")


    //list de null
    val nullList: List<Int?> = listOf(1, null, 3)
    println("nullList: $nullList")


}
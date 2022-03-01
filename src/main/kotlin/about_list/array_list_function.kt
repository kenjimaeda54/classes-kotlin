package about_list

fun main(args: Array<String>) {
    //tem funcoes que sao especificas dos mutableList
    val list = arrayListOf("a", "b", "c")
    //vou adicionar na posicao 0 o "d
    list.set(0, "d")
    list[1] = "e"
    println("Add d e   $list")

    //vou adicionar uma sublist a partir da list principal
    //nao inclui o indice 2
    val subList = list.subList(0, 2)
    println(subList)
}
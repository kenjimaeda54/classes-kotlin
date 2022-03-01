package about_list

fun main(args: Array<String>) {
    val list = listOf("blue", "white", "pink", "black", "blue")
    //verifcar se contem o valor
    println(list.contains("blue"))
    println(list.contains("red"))
    //verfica se contem a coleção
    println(list.containsAll(list))

    //pegar o index, precisa ser o valor
    println(list.indexOf("blue"))
    //pegar o ultimo index
    println(list.lastIndexOf("blue"))

    //verificar se é vazio
    println(list.isEmpty())
    println(list.isNotEmpty())

}
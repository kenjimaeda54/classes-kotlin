package about_list

//arrayList e da familia do mutableList
//etnao pode adicionar,remover elementos
fun main(args: Array<String>) {
    val colors = mutableListOf("red", "green", "blue")
    println(colors)
    colors.add("yellow")
    println("Add yellow: $colors")
    val colors2 = arrayListOf<String>("pink", "orange", "gray")
    colors2.add("black")
    println("Add black: $colors2")

    //posso adicionar uma collection
    val colors3 = arrayListOf<String>("brown", "purple", "white")
    colors.addAll(colors3)

    //revmover uma colecao
    colors.removeAll(colors3)
    println("Add collection: $colors")

    //remover pelo valor
    colors.remove("brown")
    println("Remove brown: $colors3")

    //remover pelo indice
    colors.removeAt(1)
    println("Remove  index 1: $colors3")

    //remover todos os elementos
    colors.clear()
    println("Clear: $colors")
    val colors4 = arrayListOf<String>("blue", "green", "blue")

    //vai remover o primeiro elemento que encontrar
    colors4.remove("blue")
    println(colors4)
    println("Quantity element ${colors3.size}")
}
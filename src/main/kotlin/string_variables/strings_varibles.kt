package string_variables

//eu consigo com \ colocar caracter especial
//nesse caso coloquei "yes"
fun main(args: Array<String>) {
    println("My answer is \"yes\" your question")
    println("I put one \\ in my string")
    var text = "Crocodile"
    println("$text has ${text.length} characters")
    println("Replace transform is  lowerCase or upperCase ${text.replaceFirstChar { it.lowercase() }}")
    text = "crocodile"
    println("Replace transform is  lowerCase or upperCase ${text.replaceFirstChar { it.uppercase() }}")
//    vai pegar a terceira letra,comeca do 0
    println("$text   ${text.get(3)}  go print letter c  ")
    // vai pegar a terceira letra e imprir ate a 5
    println("$text   ${text.substring(3, 6)}  go print letter cod")
}
package list

fun main() {
    val s1 =  listOf("Madrid","Franca","Espanha")
    //listOf  sao listas imutaveis,mesmo conceito que array em outras linguagues porem imutavel
    val s2 = mutableListOf("Madrid","Franca","Espanha")
    //mutableListof sao listas mutaveis, ou seja consido adicionar,remover...
    val s3 = arrayListOf("Madrid","Franca","Espanha")
    //sao arrai de implementacao do java ou seja possui add,remove...
    val s4 =  setOf("Madrid","Franca","Espanha")
    //setof seria exemplo de listOf porem nao aceita valores repetidos, se eu repetir franca,espanha.. ele ignora
    val s5 = mutableSetOf("Madrid","Franca","Espanha")
    //mutableSetOf mesmo conceito de setOf porem imutavel
    val s6 = hashMapOf(Pair("Franca","Paris"), Pair("Pais","Brasil"))
    //hasMapOf e o conceito de array de objeetos pressente em java script, atravas das chaves consigo
    //pegar os valores exemplo s6["Franca"] vou receber Paris,
    val s7 = mapOf(Pair("Franca","Paris"), Pair("Pais","Brasil"))
    //mapOf mesmo conceito de hasMapOf porem imutavel
    val s8 = mutableMapOf(Pair("Franca","Paris"), Pair("Pais","Brasil"))
    //mesmo principio que mapOf porem mutavel
}
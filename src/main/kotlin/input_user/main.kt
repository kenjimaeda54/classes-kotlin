package input_user

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello what your name?")
    val  name = readLine()
    println("Hello, $name!")
    println("Your age?")
    val value = readLine()?.toInt()
    if (value != null) {
        println("Double is age is ${value * 2}")
    }
    println(Random.nextInt())
    //vai printar ate 10
    println(Random.nextInt(10))
    //vai do 10  ate o 20,porem nao vai incluir 20.
    println(Random.nextInt(10, 20))
    println(Random.nextDouble())
}
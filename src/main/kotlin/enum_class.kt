enum class Temperature {
    Low,Height,Average
}

enum class NewTemperature(var temperature: Int) {
    Low(temperature = 25)
    {
//      toString e uma palavra resevada para converter em string
      override fun toString(): String {
          return "Agora nao sou mais o baixo mas sim o extra braixo"
      }
    },

    Height(temperature = 35),Average(temperature = 5)
}

//vai copilar minha enum como se fosse uma string
fun main() {
    println(Temperature.Height);
//    .values() vai pegar todo os valores dentro do enum NewTemperature
    for (p in NewTemperature.values()){
        println("Eu sou o enum $p -> minha temperatura e ${p.temperature} -> minha posicao e ${p.ordinal}  ")
    }
   println(NewTemperature.Low);
}


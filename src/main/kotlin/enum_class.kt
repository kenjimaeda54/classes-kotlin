enum class Temperartue  {
        Low,Height,Average
}

enum class NewTemperature(var temperate: Int){
    Low(temperate = 15) {
        override fun toString():String{
            return "Eu agora sou super baixa"
        }
    },

    Height(temperate = 20),Average(temperate = 35);
}




//vai copilar minha enum como se fosse uma string
fun main() {
    val valueTemperature = Temperartue.Height;
    for(p in NewTemperature.values()){
        println("Eu sou o enum $p --> Minha temperatura e  ${p.temperate} --> minha posicao e ${p.ordinal}  ")
    }
    println(NewTemperature.Low)
}


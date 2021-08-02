class Area(var value:Float){

}

data class SuperArea(var value: Float)

//data class seu principio e para auxiliar na passagem de dados,identico a interfaces em type script
//exemplo tenho uma funcao com 10 parametros,ao inves de passar todos eu crio um data classe e intancio.
//fun(value: Params)
//data class(var Quadrado: Int,var Trinangulo: Int ...)
fun main() {
    val valueOne   = Area(value = 10f);
    val valueTwo = Area(value = 10f);
    val valueThere = SuperArea(value = 10f);
    val valueFour = SuperArea(value= 10f);
    println(valueOne == valueTwo);//aqui vai dar falso porque a verificacao e na memoria
    println(valueThere == valueFour)//com data class eu verifico direto o valor e nao espaco alocado na memoria
    println(valueOne.hashCode())//os valores do hasCode do value One e value Two serao diferentes,memsmo principio
    println(valueTwo.hashCode())//anterior
    println(valueFour.hashCode())//aqui serao iguais por ser do data class
    println(valueThere.hashCode())
    val valueFive = valueThere.copy(); //aqui crio uma copia dos valores do valueThre recurso disponivel apenas
    println(valueFive);                //com data class
}
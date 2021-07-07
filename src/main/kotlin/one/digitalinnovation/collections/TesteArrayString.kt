package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""} // or val nomes = arrayOf("Maria", "João", "Gustavo")
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Gustavo"

    for(valor in nomes){
        println(valor)
    }
    println("------------------------------------")
    for(index in nomes.indices){
        println(nomes[index])
    }
    println("------------------------------------")
    nomes.forEach {
        println(it)
    }
    println("------------------------------------")
    nomes.forEach { valor ->
        println(valor)
    }
    println("------------------------------------")
    nomes.sort()
    nomes.forEach { valor ->
        println(valor)
    }


}
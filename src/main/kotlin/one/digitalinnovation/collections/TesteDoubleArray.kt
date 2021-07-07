package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3) // or val salarios = doubleArrayOf(5000.0, 1000.0, 500.0)

    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 1.0

    for(valor in salarios){
        println(valor)
    }
    println("------------------------------------")
    for(index in salarios.indices){
        println(salarios[index])
    }
    println("------------------------------------")
    salarios.forEach {
        println(it)
    }
    println("------------------------------------")
    salarios.forEach { valor ->
        println(valor)
    }

    println("------------------------------------")
    salarios.sort()
    salarios.forEach { valor ->
        println(valor)
    }

    println("------------------------------------")
    salarios.sort()
    salarios.forEachIndexed() { index, valor ->
        salarios[index] = valor * 1.1
        println(salarios[index])
    }
}
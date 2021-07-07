package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(2, 5, 7, 4, 9, 12)

    for(valor in values){
        println(valor)
    }
    println("------------------------------------")
    for(index in values.indices){
        println(values[index])
    }
    println("------------------------------------")
    values.forEach {
        println(it)
    }
    println("------------------------------------")
    values.forEach { valor ->
        println(valor)
    }
    println("------------------------------------")
    values.sort()
    values.forEach { valor ->
        println(valor)
    }
}

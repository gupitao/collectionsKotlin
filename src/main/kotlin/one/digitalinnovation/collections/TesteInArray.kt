package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 5
    values[2] = 2
    values[3] = 6
    values[4] = 1

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
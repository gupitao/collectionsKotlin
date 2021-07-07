package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 5000.0, 500.0)

    for (salario in salarios){
        println(salario)
    }

    println("------------------------------------")
    println("Mario Salario: ${salarios.maxOrNull()}")
    println("Mario Salario: ${salarios.minOrNull()}")
    println("Mario Salario: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    println("------------------------------------")
    salariosMaiorQue2500.forEach{println(it)}

    println("------------------------------------")
    println(salarios.count{it in 2000.0 .. 5000.0})

    println("------------------------------------")
    println(salarios.find{it == 5000.0})

    println("------------------------------------")
    println(salarios.any(){it == 5000.0})
    println(salarios.any(){it == 1500.0})

}
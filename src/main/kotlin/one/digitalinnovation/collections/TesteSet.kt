package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0)
    val maria = Funcionario("Maria", 5000.0, "PJ")
    val gustavo = Funcionario("Gustavo", 2000.0)

    val funcionarios1 = setOf(joao, gustavo)
    val funcionarios2 = setOf(maria)

    val union = funcionarios1.union(funcionarios2)

    union.forEach{println(it.toString())}
    println("-------------------------------")

    val funcionarios3 = setOf(joao, maria, gustavo)
    val subtract = funcionarios3.subtract(funcionarios2)

    subtract.forEach{ println(it.toString())}

    println("-------------------------------")
    val intersect = funcionarios3.intersect(funcionarios2)
    intersect.forEach { println(it.toString()) }
}
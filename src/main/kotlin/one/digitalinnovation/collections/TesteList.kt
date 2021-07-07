package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0)
    val maria = Funcionario("Maria", 5000.0, "PJ")
    val gustavo = Funcionario("Gustavo", 2000.0)

    var funcionarios = listOf(joao, maria, gustavo)

    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it.toString())}
    println("-------------------------------")
    funcionarios
        .groupBy{ it.tipo }
        .forEach{ println(it.toString())}
    println("-------------------------------")
}

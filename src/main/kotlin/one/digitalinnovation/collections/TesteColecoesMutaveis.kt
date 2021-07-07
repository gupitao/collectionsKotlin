package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0)
    val maria = Funcionario("Maria", 5000.0, "PJ")
    val gustavo = Funcionario("Gustavo", 2000.0)

    val funcionarios = mutableListOf(joao, maria)

    funcionarios.forEach{ println(it.toString())}
    println("-------------------------------")

    funcionarios.add(gustavo)
    funcionarios.forEach{ println(it.toString())}
    println("-------------------------------")

    funcionarios.remove(maria)
    funcionarios.forEach{ println(it.toString())}

    println("-------------SET----------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{ println(it.toString())}
    println("-------------------------------")

    funcionariosSet.add(maria)
    funcionariosSet.add(gustavo)
    funcionariosSet.forEach{ println(it.toString())}
    println("-------------------------------")

    funcionariosSet.remove(joao)
    funcionariosSet
        .sortedBy { it.salario }
        .forEach{ println(it.toString())}
}
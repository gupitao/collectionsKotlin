package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0)
    val maria = Funcionario("Maria", 5000.0, "PJ")
    val gustavo = Funcionario("Gustavo", 2000.0)

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(gustavo.nome, gustavo)

    println(repositorio.findById(joao.nome))
    println("-------------------------------")

    repositorio.findAll().forEach{ println(it)}
    println("-------------------------------")

    repositorio.remove(maria.nome)
    println(repositorio.findAll())
    repositorio.findAll().forEach{ println(it)}
}
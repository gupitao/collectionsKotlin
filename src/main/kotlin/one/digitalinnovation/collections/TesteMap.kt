package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 =  mapOf(pair)

    map1.forEach{ (t, u) -> println("Chave: $t - Valor: $u") }
    println("-------------------------------")

    val map2 = mapOf("Gustavo" to 2500.0, "João" to 3000.0)

    map2.forEach{ (t, u) -> println("Chave: $t - Valor: $u") }
}
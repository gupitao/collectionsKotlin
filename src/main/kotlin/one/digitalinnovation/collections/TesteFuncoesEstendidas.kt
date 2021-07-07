package one.digitalinnovation.collections

import java.math.BigDecimal

fun main() {
    val salarios:Array<BigDecimal> = arrayOf(
        500.0.toBigDecimal(),
        1000.0.toBigDecimal(),
        2000.0.toBigDecimal())

    println(salarios.somatoria())
    println("------------------------------------")

    println(salarios.media())
    println("------------------------------------")



}
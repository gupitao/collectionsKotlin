package one.digitalinnovation.collections

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipo:String = "PF"
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
            
        """.trimIndent()

}

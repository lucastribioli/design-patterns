package criacionais

fun main() {
    val pessoa = Pessoa
        .Builder()
        .email("teste@gmail.com")
        .nome("Teste")
        .build()
    println(pessoa.email)
}
class Pessoa private constructor(
    val nome: String,
    val idade: Int,
    val endereco: String,
    val telefone: String,
    val email: String,
) {
    data class Builder(
        var nome: String = "",
        var idade: Int = 0,
        var endereco: String = "",
        var telefone: String = "",
        var email: String = "",
    ) {
        fun nome(nome: String) = apply { this.nome = nome }
        fun idade(idade: Int) = apply { this.idade = idade }
        fun endereco(endereco: String) = apply { this.endereco = endereco }
        fun telefone(telefone: String) = apply { this.telefone = telefone }
        fun email(email: String) = apply { this.email = email }


        fun build(): Pessoa {
            return Pessoa(nome, idade, endereco, telefone, email)
        }
    }
}
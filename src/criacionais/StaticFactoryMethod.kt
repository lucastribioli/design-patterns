package criacionais

fun main() {
    Aluno.of(
        "Lucas",
        22,
        "rua tal",
        "123",
        "t@t.com"
    )
}

class Aluno(
    val nome: String,
    val idade: Int,
    val endereco: String,
    val telefone: String,
    val email: String,
    val escola:String
) {
    companion object {
        fun of(nome: String, idade: Int, endereco: String, telefone: String, email: String): Aluno {
            return Aluno(nome, idade, endereco, telefone, email, "escola tal")
        }
    }
}
package criacionais

fun main() {
    val original = Cartao("João", "1234-5678", "12/25")
    val clone = original.clone()
    println("Original: ${original.name} objeto: ${original}")
    println("Clone: ${clone.name} objeto: ${clone}")
}

// Os Data Class já tem esse desing pattern implementado com o método copy
class Cartao(
    val name: String,
    val numero: String,
    val validade: String,
) {
    fun clone(): Cartao {
        return Cartao(name, numero, validade)
    }
}
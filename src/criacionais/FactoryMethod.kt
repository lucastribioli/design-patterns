package criacionais


fun main() {
    val factory = TransporteFactory()
    val navio = factory.criarTransporte("navio")
    val carro = factory.criarTransporte("carro")

    navio.carregar()
    navio.entregar()

    carro.carregar()
    carro.entregar()
}

interface Transporte{

    fun entregar()
    fun carregar()
}

class Navio : Transporte {
    override fun entregar() {
        println("Entregando por navio")
    }

    override fun carregar() {
        println("Carregando no navio")
    }
}

class Carro : Transporte {
    override fun entregar() {
        println("Entregando por carro")
    }

    override fun carregar() {
        println("Carregando no carro")
    }
}

class TransporteFactory {
    fun criarTransporte(tipo: String): Transporte {
        return when (tipo) {
            "navio" -> Navio()
            "carro" -> Carro()
            else -> throw IllegalArgumentException("Tipo de transporte desconhecido")
        }
    }
}
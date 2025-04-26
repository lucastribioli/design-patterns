package criacionais


fun main() {
    val pedidoSimples = PedidoSimples()
    val bebidaSimples = pedidoSimples.criarBebida()
    val comidaSimples = pedidoSimples.criarComida()

    bebidaSimples.beber()
    comidaSimples.comer()

    val pedidoChique = PedidoChique()
    val bebidaChique = pedidoChique.criarBebida()
    val comidaChique = pedidoChique.criarComida()

    bebidaChique.beber()
    comidaChique.comer()

}

interface Bebida {
    fun beber()
}

class Cafe : Bebida {
    override fun beber() {
        println("Bebendo café")
    }
}

class Cha : Bebida {
    override fun beber() {
        println("Bebendo chá")
    }
}

interface Comida {
    fun comer()
}

class Pao : Comida {
    override fun comer() {
        println("Comendo pão")
    }
}

class Bolo : Comida {
    override fun comer() {
        println("Comendo bolo")
    }
}

interface FabricaPedido {
    fun criarBebida(): Bebida
    fun criarComida(): Comida
}
class PedidoSimples: FabricaPedido {
    override fun criarBebida(): Bebida {
        return Cafe()
    }

    override fun criarComida(): Comida {
        return Pao()
    }
}
class PedidoChique: FabricaPedido {
    override fun criarBebida(): Bebida {
        return Cha()
    }

    override fun criarComida(): Comida {
        return Bolo()
    }
}
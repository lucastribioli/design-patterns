package comportamentais

fun main() {
    val chain = FirstHandler()
        .setNext(SecondHandler())
        .setNext(ThirdHandler())

    println(chain.process("Request 1"))
    println(chain.process("Request 2"))
}
interface Chain{
    fun setNext(chain: Chain): Chain
    fun process(request: String): String}

class FirstHandler: Chain {
    private var nextChain: Chain? = null

    override fun setNext(chain: Chain): Chain {
        this.nextChain = chain
        return chain
    }

    override fun process(request: String): String {
        return if (request == "Request 1") {
            "FirstHandler processed $request"
        } else {
            nextChain?.process(request) ?: "No handler found for $request"
        }
    }
}
class SecondHandler: Chain {
    private var nextChain: Chain? = null

    override fun setNext(chain: Chain): Chain {
        this.nextChain = chain
        return chain
    }

    override fun process(request: String): String {
        return if (request == "Request 1") {
            "FirstHandler processed $request"
        } else {
            nextChain?.process(request) ?: "No handler found for $request"
        }
    }
}

class ThirdHandler: Chain {
    private var nextChain: Chain? = null

    override fun setNext(chain: Chain): Chain {
        this.nextChain = chain
        return chain
    }

    override fun process(request: String): String {
        return if (request == "Request 2") {
            "ThirdHandler processed $request"
        } else {
            nextChain?.process(request) ?: "No handler found for $request"
        }
    }
}
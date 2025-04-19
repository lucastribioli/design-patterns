package criacionais

fun main() {
    val singleton1 = Singleton.getInstance()
    val singleton2 = Singleton.getInstance()

    println(singleton1 == singleton2) // true
}
object Singleton {
    private var instance: Singleton? = null

    fun getInstance(): Singleton {
        if (instance == null) {
            instance = Singleton
        }
        return instance!!
    }
}
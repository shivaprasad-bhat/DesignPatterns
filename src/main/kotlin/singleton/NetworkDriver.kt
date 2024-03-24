package singleton

object NetworkDriver {

    init {
        println("Initializing $this")
    }

    public fun log(): NetworkDriver = apply { println("NetworkDriver : $this") }
}

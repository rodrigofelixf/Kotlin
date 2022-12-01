interface Savage {
    fun attack()
}

abstract class Mammal(val name: String) {


    fun wakeUP() {
        println("Wake up...")
    }

    fun sleep() {
        println("Sleeping...")
    }

    abstract fun talk()

}

class Dog(name: String) : Mammal(name), Savage{
    override fun talk() {
        println("Au, AU!")
    }

    override fun attack() {}


}

fun main() {


}


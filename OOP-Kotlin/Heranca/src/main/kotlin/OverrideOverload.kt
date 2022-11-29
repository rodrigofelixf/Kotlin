open class Tech(var model: String) {


    // Methods
    private fun electricity(on: Boolean) {}

    fun turnON() {
        this.electricity(true)
    }

    open fun turnOFF() {
        this.electricity(false)
    }
}

class Computer(model: String) : Tech(model) {
    fun save() {}
    override fun turnOFF() {
        save()
        super.turnOFF()
    }
}

fun main() {
    val com: Computer = Computer("Apple")

    com.turnON()
    com.turnOFF()
}

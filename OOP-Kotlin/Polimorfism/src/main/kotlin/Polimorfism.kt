interface Event {
    fun onSucess()
}

class Program {

    fun save(e: Event) {
        print("Carregando ")
        e.onSucess()
    }
}

fun main() {
    val e = Program()
    e.save(object : Event {
        override fun onSucess() {
            print("Sucess!")
        }
    })
}
open class Electronic(var model: String) {
    fun turnON() {}
    fun turnOFF() {}
}


class Computer1(model: String) : Electronic(model) {

}

fun main() {

    var c: Computer = Computer("Apple")



}
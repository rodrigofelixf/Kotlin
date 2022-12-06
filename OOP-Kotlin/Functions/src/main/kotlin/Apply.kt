data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val rodrigo = Person()
    val stringDescription = rodrigo.apply {
        name = "Rodrigo"
        age = 28
        about = "Android Developer"
    }.toString()

    println(stringDescription)
}
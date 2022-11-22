fun main() {
    try {
        val str: String? = null
        println(str!!.length)
    } catch (e: NullPointerException) {
        println("Null Variable")
    }
    println("End!")
}

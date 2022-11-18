fun main() {
    val name: String = "Rodrigo"

    println("String Size: ${name.length}")
    println("Start with Rod?: ${name.startsWith("Rod", true)}")
    println("Ends With ABC?: ${name.endsWith("ABC", true)}")
    println(name.substring(2, 4))
    println(name.replace("Rodrigo", "Felix"))
    println(name.lowercase())
    println(name.uppercase())
    println("      Rodrigo Felix        ".trim())

    printAll("Rodrigo", "Felix")

}
    // create an array in a function parameter

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

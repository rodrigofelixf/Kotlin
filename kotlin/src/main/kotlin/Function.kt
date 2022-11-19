// Function in a small part of program that can be reused
fun main() {
    countChar("Rodrigo")
    println(cube(3))
    println(milesConverter(2f))
    changeA("Amanda")
    countChar("Rodrigo")
    morning(true)

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun helloWorld(): String {
    return "Hello, World"
}

// Function Unit has no return
fun test(morning: Any?) {
    println("Hello, Rodrigo")
}

fun yearsConvertor(years: Int): Unit  {
    println("$years years equals")
    println("${years * 12} months")
    println("${years * 365} days")
    println("${years * 365 * 24} hours")
    println("${years * 365 * 24 * 60} minutes")
    println("${years * 365 * 24 * 60 * 60} seconds")
}

fun countChar(String: String): Unit = println("$String tem ${String.length} Characters")


fun cube(num: Int): Int = num * num * num

fun milesConverter(m: Float): Float = (m * 1.6f)

fun changeA(str: String) {
    println(str.replace("a", "x", true).lowercase())
}

fun morning(dia: Boolean):  String {
    return if (dia) {
        "Good morning"
    } else {
        "Good evening"
    }
}







// Function in a small part of program that can be reused
fun main() {
    println(sum(5, 5))
    println(helloWorld())
    test()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun helloWorld(): String {
    return "Hello, World"
}

// Function Unit has no return
fun test() {
    println("Hello, Rodrigo")
}



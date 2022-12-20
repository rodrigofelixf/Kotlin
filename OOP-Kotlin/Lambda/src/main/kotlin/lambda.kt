fun main() {
    val a = {
        println("Hello World!")
        val b = 6 + 4
    }

    val c = {x: Int, y: Int -> x * y}


    receive(c)

}

fun receive(lambda: (n1: Int, n2: Int) -> Int) {}
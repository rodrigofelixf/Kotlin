fun main() {

    doSquare()
   // triangle(3,3,3)
   // ticketShow(15,"kkk", "oo")
}


fun doSquare() {
    println("Input side 1: ")
    val n1 = readLine()

    println("Input side 2: ")
    val n2 = readLine()

    if ((n1 != null && n2 != "") && (n2 != null && n2 != " ")) {
        n1.toInt()
        n2.toInt()

        if (n1 == n2) {
            println("Make a square")
        } else {
            println("Don't make a square")
        }
    }
}

fun triangle(n1: Int, n2: Int, n3: Int) {
    if (n1 == n2 && n3 == n2) println("Equilateral triangle")
}

fun ticketShow(age: Int, ticket: String, cod: String) {
    return if (age >= 18) {
        if (ticket == "comum" || ticket == "premium" || ticket == "luxo") {
            if (cod == "XL" || cod == "XT") {
                println("Welcome!")
            } else {
                println("Invalid Ticket")
            }
        } else {
            println("Error: Invalid Ticket")
        }
    } else {
        println("You're not adult!")
    }
}


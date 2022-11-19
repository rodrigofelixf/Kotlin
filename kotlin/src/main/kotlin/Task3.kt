fun main() {

    println(doSquare(2,2))
    triangle(3,3,3)
    ticketShow(15,"kkk", "oo")
}


fun doSquare(n1: Int, n2: Int): String {
    return if (n1 == n2) {
        "Make a square"
    } else {
        "Don't make a square"
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


import javax.print.DocFlavor.STRING

fun main() {
    //countNext(1, 50)
    //countBack(50, 1)
    //sumNum(1, 10)
    // stair(5)
    // countMulti(1, 50)
    //baloon(2000)

   // while2()

   // inverse("Rodrigo Felix")

    println(stringx("asdasd"))
}

fun countMulti(n1: Int, nfinal: Int) {
    for (i in n1..nfinal) {
        if (i % 5 == 0) {
            continue
        }

        print("$i ")

    }
}

fun countBack(num1: Int, numFinal: Int) {
    for (i in num1 downTo numFinal) {
        print("$i ")
    }
}

fun countNext(n1: Int, nfinal: Int) {
    for (i in n1..nfinal) {
        if (i % 2 == 0) {
            print("$i ")
        }

    }
}

fun sumNum(n1: Int, nfinal: Int) {
    var sum: Int = 0
    for (i in n1..nfinal) {
        sum += i
        println(sum)
    }

}


fun stair(num: Int) {
    var cc: Int = 0
    for (i in 1..num) {
        cc++
    }

}

fun baloon(l: Int): Unit {
    var cc: Int = 7
    while (cc < l) {
        cc += 7
    }
    println(cc / 7)
}

fun while2() {
    var i: Int = 1
    while (i <= 50) {
        i++
        if (i % 5 == 0 && i % 3 == 0){
            println("$i, FizzBuzz ")
        } else if (i % 3 == 0) {
            println("$i, Fizz ")
        } else if (i % 5 == 0) {
            println("Buzz")
        }
    }
}

fun inverse(text: String) {
    var i: Int = text.length -1
    while(i >= 0) {
        print(text[i])
        i--
    }
}

fun stringx(str: String): Boolean {
    var countX: Int = 0
    var countO: Int = 0
    var i: Int = 0
    while (i < str.length) {
        if (str[i] == 'x') {
            countX++
        } else if (str[i] == 'o') {
            countO++
        }
        i++
    }
    return (countX == countO && (countX != 0))
}







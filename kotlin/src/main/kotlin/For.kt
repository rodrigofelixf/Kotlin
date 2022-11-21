fun main() {
    for (i in 1..10) {
        print("$i ")
    }

    for (j in 0..20 step 2) {
        print("$j ")
    }

    for (k in 20 downTo 0 step 2) println(k)
}
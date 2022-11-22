fun main() {
    val str: String = "hsssdjkadkdoui"
    var count: Int = 0

    for (i in str) {
        count++
        if (i == 'a') {
            break
        }

    }

    var j: Int = 0
    while (j < 50) {
        if (j < 10) {
            j++
            continue
        }
        print("$j ")
        j++
    }



}
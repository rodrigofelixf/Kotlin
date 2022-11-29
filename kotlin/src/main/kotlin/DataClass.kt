fun main() {

    var f1: Forma = Forma(10, 2)
    var f2: Forma = Forma(10, 2)

    println(f1 == f2)

    f1.toString()

}

data class Forma(var a: Int, var b: Int)
data class DataForma(val a: Int, val b: Int)

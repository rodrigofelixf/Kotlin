fun main() {

    println(notas(10f, 10f, 9.3f))

}

fun teste(num: Int = 0) {
}

fun notas(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}
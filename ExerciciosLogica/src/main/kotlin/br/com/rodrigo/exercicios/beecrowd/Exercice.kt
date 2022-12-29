package br.com.rodrigo.exercicios.beecrowd

import java.math.BigDecimal

fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    val diferenca: Int = (a * b - c * d)

    println("DIFERENCA = $diferenca")
}




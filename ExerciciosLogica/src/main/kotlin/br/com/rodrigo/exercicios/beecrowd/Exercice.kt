package br.com.rodrigo.exercicios.beecrowd

import java.math.BigDecimal
import kotlin.math.abs

fun main() {
    val (a, b, c) = readLine()!!.split(" ")
    val aInt = a.toInt()
    val bInt = b.toInt()
    val cInt = c.toInt()


    val maiorab = (aInt + bInt + Math.abs(aInt - bInt)) / 2

    var maior = 0
    if (maiorab > cInt) maior = maiorab else maior = cInt


    print("$maior eh o maior")

}




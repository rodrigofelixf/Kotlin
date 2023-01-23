package br.com.rodrigo.exercicios.beecrowd

import java.math.BigDecimal
import kotlin.math.abs

fun main() {
    val nome = "Bruno"
    val altura: Float = 1.75f * 1.75f
    val peso: Int = 150
    val result = peso/altura

    println(nome)
    println(result)

    if(result < 18.5){
        println("magreza")

    }else if(result >= 18.5 && result <= 24.9){
        println("normal")
    }else if(result >= 25 && result <=29.9){
        println("SOBREPESO")
    }else if(result >= 30 && result <=39.9){
        println("obesidade II")
    }else
        println("obesidade grave")


}




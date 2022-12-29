package br.com.rodrigo.exercicios

/* 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666 */

fun main() {

    exercicio07()
}

fun exercicio07() {
    println("Digite um numero: ")
    val num = readLine()!!
    val doubleNum = num.toDouble()
    println("O dobro de $num e ${dobro(doubleNum)}")
    println("A terca parte de $num e ${divisao(doubleNum, 3.0)}")
}


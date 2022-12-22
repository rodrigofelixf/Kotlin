package br.com.rodrigo.exercicios

/* 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13. */

fun main() {

    lerNumeros()


}

fun lerNumeros() {
    println("Digite um valor: ")
    val n1 = readLine()!!
    val int1 = n1.toInt()
    println("Digite outro valor: ")
    val n2 = readLine()!!
    val int2 = n2.toInt()
    println("A soma de $int1 e $int2 e igual ${somar(int1, int2)}")
}

fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}

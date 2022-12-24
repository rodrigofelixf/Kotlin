package br.com.rodrigo.exercicios

/* 6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10 */


fun main() {
    sucessoAntecessor()

}

fun sucessoAntecessor() {
    println("Digite um numero: ")
    val num = readLine()!!
    val numInt = num.toInt()
    println("O sucessor de $num e ${numInt + 1} \nO antecessor de $num e ${numInt - 1}")

}
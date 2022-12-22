package br.com.rodrigo.exercicios

/* 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer! */

fun main() {

    welcome()

}

fun welcome() {
    println("Whats your name? ")
    val name = readLine()
    println("Hello $name, nice to meet you!")
}
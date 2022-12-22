package br.com.rodrigo.exercicios

/* 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho. */

fun main() {

    employeeData()

}

fun employeeData() {
    println("Nome do funcionario: ")
    val employee = readLine()
    println("Salary: ")
    val salary = readLine()
    salary?.toDouble()
    println("O funcionario $employee tem um salario de R$$salary em Junho")

}

package br.com.rodrigo.exercicios

/*) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5 */

fun main() {
    lerNotas()


}

fun lerNotas() {
    println("Nota 1: ")
    val nota1 = readLine()!!
    println("Nota 2: ")
    val nota2 = readLine()!!


    println("A media entre $nota1 e $nota2 e igual a ${media(nota1.toFloat(), nota2.toFloat())}")

}

fun media(n1: Float, n2: Float): Float {
    return ((n1 + n2) / 2)
}
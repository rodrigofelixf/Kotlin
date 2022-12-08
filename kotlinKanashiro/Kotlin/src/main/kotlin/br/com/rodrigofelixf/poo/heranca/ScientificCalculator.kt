package br.com.rodrigofelixf.poo.heranca

class ScientificCalculator : Calculator() {

    fun multi(a: Int, b: Int) {
        resultado = a * b
        showResult()
    }
}
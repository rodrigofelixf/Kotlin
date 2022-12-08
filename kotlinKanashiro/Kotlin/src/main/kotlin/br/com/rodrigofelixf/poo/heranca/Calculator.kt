package br.com.rodrigofelixf.poo.heranca

open class Calculator {

    protected var resultado = 0


    //methods

    fun sum(a: Int, b: Int){
        resultado = a + b
        showResult()
    }

    fun sub(a: Int, b: Int) {
        resultado = a - b
        showResult()
    }


    protected fun showResult() {
        println("is $resultado")
    }
}
package br.com.rodrigofelixf.poo.heranca

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculator = ScientificCalculator()

            calculator.multi(2, 5)
        }
    }


}
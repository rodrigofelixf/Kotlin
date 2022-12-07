package br.com.rodrigofelixf.poo.classes

import java.time.LocalDate

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val rodrigo = Person("0123456789", "Rodrigo", LocalDate.of(1994, 10, 18))


            rodrigo.speak("Hello, World!")

            println(rodrigo.getTest())
        }
    }
}
package br.com.rodrigofelixf.poo.classes

import java.time.LocalDate

class Person(val cpf: String, val name: String, val birth: LocalDate) {
    val age: Int = LocalDate.now().year - birth.year
    private var teste: Int = 0


    // methods

    fun speak(msg: String) {
        println("$name speak: $msg")
    }


    fun getTest(): Int {
        return teste

    }
}
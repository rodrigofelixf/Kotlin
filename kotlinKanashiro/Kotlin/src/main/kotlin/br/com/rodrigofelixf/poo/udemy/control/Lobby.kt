package br.com.rodrigofelixf.poo.udemy.control

import br.com.rodrigofelixf.poo.udemy.businnes.BusinessInvitation
import br.com.rodrigofelixf.poo.udemy.entity.Invitation

class Lobby {

    private val businessInvitation = BusinessInvitation()

    init {
        println(control())
    }

    private fun control(): String {
        val age = Console.readInt("How old are you? ")
        if (age < 18) {
            return "You don't pass"
        }

        val inviteType = Console.readString("Whats invitation type?")
        if (!businessInvitation.typeValidation(inviteType)) {
            println("Invalid invite!")
        }

        val codType = Console.readString("Whats cod type?")
        val invitation = Invitation(inviteType, codType)
        if (!businessInvitation.codValidation(invitation)) {
            println("Invalid cod type!")
        }
        return "Welcome"

    }

}




fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()
    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }
    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()
        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }
        print("Qual o código do convite? ")
        var codigo = readLine()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. Convite inválido")
            }
        }
    }
}
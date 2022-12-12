package br.com.rodrigofelixf.poo.udemy.businnes

import br.com.rodrigofelixf.poo.udemy.entity.Invitation

class BusinessInvitation() {

    fun typeValidation(type: String) = (type == "comum" || type == "luxo" || type == "premium")

    fun codValidation(invitation: Invitation) = when (invitation.type) {
        "comum" -> invitation.cod.startsWith("xt")
        "luxo", "premium" -> invitation.cod.startsWith("xl")
        else -> false
    }





}

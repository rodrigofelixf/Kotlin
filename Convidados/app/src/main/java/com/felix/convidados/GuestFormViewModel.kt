package com.felix.convidados

import androidx.lifecycle.ViewModel
import com.felix.convidados.ui.GuestRepository

class GuestFormViewModel : ViewModel() {

    private val repository = GuestRepository.getInstance()

    fun abc() {
        GuestRepository.getInstance()
        GuestRepository.getInstance()
        GuestRepository.getInstance()

    }
}
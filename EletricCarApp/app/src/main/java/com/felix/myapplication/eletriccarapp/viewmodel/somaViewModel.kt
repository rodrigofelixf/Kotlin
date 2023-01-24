package com.felix.myapplication.eletriccarapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.felix.myapplication.eletriccarapp.model.somaModel

class somaViewModel: ViewModel() {

    var numb1: MutableLiveData<Int> = MutableLiveData()
    var numb2: MutableLiveData<Int> = MutableLiveData()
    var resultado: MutableLiveData<Int> = MutableLiveData()

    fun calcularSoma() {
        val model = somaModel(numb1.value!!, numb2.value!!)
        resultado.value = model.calcularSoma()
    }
}
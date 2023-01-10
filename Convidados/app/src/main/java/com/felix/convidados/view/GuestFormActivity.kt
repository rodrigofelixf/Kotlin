package com.felix.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.lifecycle.ViewModelProvider
import com.felix.convidados.R
import com.felix.convidados.databinding.ActivityGuestFormBinding
import com.felix.convidados.viewmodel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity(), OnClickListener {

    // Inicia as classes e as Activity
    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        var binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Faz conexao com a ViewModel da GuestForm
        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        // inicializa os eventos dos botoes
        binding.buttonSave.setOnClickListener(this)

        // deixa o radioPresent marcado
        binding.radioPresent.isChecked = true

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save) {

        }
    }
}
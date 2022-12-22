package com.felix.appmotivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.felix.appmotivation.infra.MotivationConstants
import com.felix.appmotivation.R
import com.felix.appmotivation.infra.SecurityPreferences
import com.felix.appmotivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Esconder a barra de navegacao
        supportActionBar?.hide()

        handleUserName()

        // Eventos
        binding.buttonNewPhrase.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            binding.textMotivationFrase.text = teste()
        }
    }

    private fun handleUserName() {
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textName.text = ("Olá, $name!")
    }
}

private fun teste(): String {
    return "Mete o fio dental e passa o oleo no Bumbum"
}



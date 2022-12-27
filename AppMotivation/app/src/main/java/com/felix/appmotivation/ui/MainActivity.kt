package com.felix.appmotivation.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.felix.appmotivation.infra.MotivationConstants
import com.felix.appmotivation.R
import com.felix.appmotivation.data.Mock
import com.felix.appmotivation.data.Phrase
import com.felix.appmotivation.infra.SecurityPreferences
import com.felix.appmotivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // Evitando uma Exception
    private lateinit var binding: ActivityMainBinding

    // Categorizando os filtros das frases
    private var categoryID = MotivationConstants.FILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // expandindo o layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Esconde a barra de navegacao
        supportActionBar?.hide()

        // Deixa a aba All selecionada no inicio.
        handleFilter(R.id.image_all)

        // Abre o app com uma frase
        handNextPhrase()

        // Eventos
        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageAll.setOnClickListener(this)
        binding.imageHappy.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)
        binding.textName.setOnClickListener(this)

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        handleUserName()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            handNextPhrase()

        } else if (view.id in listOf(R.id.image_all, R.id.image_happy, R.id.image_sunny)) {
            handleFilter(view.id)
        } else if (view.id == R.id.text_name) {
            startActivity(Intent(this, UserActivity::class.java))
        }
    }

    private fun handleUserName() {
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textName.text = ("Olá, $name!")
    }

    private fun handleFilter(id: Int) {
        binding.imageAll.setColorFilter(ContextCompat.getColor(this,R.color.dark_purple))
        binding.imageHappy.setColorFilter(ContextCompat.getColor(this,R.color.dark_purple))
        binding.imageSunny.setColorFilter(ContextCompat.getColor(this,R.color.dark_purple))

        when(id) {
            R.id.image_all -> {
                binding.imageAll.setColorFilter(ContextCompat.getColor(this,R.color.white))
                categoryID = MotivationConstants.FILTER.ALL
            }
            R.id.image_happy -> {
                binding.imageHappy.setColorFilter(ContextCompat.getColor(this,R.color.white))
                categoryID = MotivationConstants.FILTER.HAPPY
            }
            R.id.image_sunny -> {
                binding.imageSunny.setColorFilter(ContextCompat.getColor(this,R.color.white))
                categoryID = MotivationConstants.FILTER.SUNNY
            }
        }
    }

    private fun handNextPhrase() {
        val phrase = Mock().getPhrase(categoryID)
        binding.textMotivationFrase.text = phrase

    }



}






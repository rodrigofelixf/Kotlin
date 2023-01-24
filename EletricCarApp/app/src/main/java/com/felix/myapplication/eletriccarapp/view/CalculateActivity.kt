package com.felix.myapplication.eletriccarapp.view

import android.os.Bundle
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.databinding.ActivityCalculateBinding
import com.felix.myapplication.eletriccarapp.viewmodel.somaViewModel

class CalculateActivity : AppCompatActivity() {
    private lateinit var viewModel: somaViewModel
    private lateinit var binding: ActivityCalculateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        calculateHandle()
    }

    private fun calculateHandle() {
        viewModel = ViewModelProvider(
            this
        ).get(somaViewModel::class.java)

        binding.buttonCalculate.setOnClickListener {
            viewModel.numb1.value = binding.editPriceKwh.text.toString().toInt()
            viewModel.numb2.value = binding.editKmRun.text.toString().toInt()
            viewModel.calcularSoma()
        }
        viewModel.resultado.observe(this, Observer {
            binding.textCalculo.text = "Soma $it"
        })
    }
}
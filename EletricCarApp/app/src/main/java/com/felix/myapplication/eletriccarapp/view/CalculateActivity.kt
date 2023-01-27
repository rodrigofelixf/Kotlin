package com.felix.myapplication.eletriccarapp.view

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.databinding.ActivityCalculateBinding
import com.felix.myapplication.eletriccarapp.viewmodel.SomaViewModel

class CalculateActivity : AppCompatActivity(), OnClickListener {
    private lateinit var viewModel: SomaViewModel
    private lateinit var binding: ActivityCalculateBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(SomaViewModel::class.java)

        //eventos
        binding.buttonCalculate.setOnClickListener(this)
        binding.imageBack.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate) {
            calculateHandle()
        } else if (view.id == R.id.image_back)
            finish()
    }

    private fun calculateHandle() {
        if (isValid()) {
            viewModel.numb1.value = binding.editPriceKwh.text.toString().toInt()
            viewModel.numb2.value = binding.editKmRun.text.toString().toInt()
            viewModel.calcularSoma()

            viewModel.resultado.observe(this, Observer {
                binding.textCalculo.text = "Soma $it"
            })
        } else
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_SHORT).show()
    }

    private fun isValid(): Boolean {
        return (
                binding.editPriceKwh.text.toString() != "" && binding.editKmRun.text.toString() != "")
    }


}
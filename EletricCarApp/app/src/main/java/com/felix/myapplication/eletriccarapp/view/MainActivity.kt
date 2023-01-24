package com.felix.myapplication.eletriccarapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.viewmodel.somaViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: somaViewModel
    private val numb1 by lazy { findViewById<EditText>(R.id.edit_price_kwh) }
    private val numb2 by lazy { findViewById<EditText>(R.id.edit_km_run) }
    private val btnCalcular by lazy { findViewById<Button>(R.id.button_calculate) }
    private val resultado by lazy { findViewById<TextView>(R.id.text_calculo) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(somaViewModel::class.java)

        btnCalcular.setOnClickListener {
            viewModel.numb1.value = numb1.text.toString().toInt()
            viewModel.numb2.value = numb2.text.toString().toInt()
            viewModel.calcularSoma()
        }
        viewModel.resultado.observe(this, Observer {
            resultado.text = "Soma $it"
        })
    }

}
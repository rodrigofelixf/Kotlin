package com.felix.myapplication.eletriccarapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.adapter.AdapterCar
import com.felix.myapplication.eletriccarapp.databinding.ActivityMainBinding
import com.felix.myapplication.eletriccarapp.model.CarModel

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterCar: AdapterCar
    private val carList: MutableList<CarModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setupList()

        binding.recyclerInfomacoes.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerInfomacoes.setHasFixedSize(true)
        adapterCar = AdapterCar(this, carList)
        binding.recyclerInfomacoes.adapter = adapterCar
        carItems()

        //eventos de click
        binding.buttonCalculateMain.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate_main) {
            startActivity(Intent(this, CalculateActivity::class.java))
        }
    }

    private fun carItems() {
        val car1 = CarModel(
            R.id.image_car_01,
            "R$ 200,000",
            "232 KwH",
            "250 cv",
            "120 min"
        )
        carList.add(car1)

        val car2 = CarModel(
            R.id.image_car_01,
            "R$ 1.000,000",
            "2332 KwH",
            "2503 cv",
            "1202 min"
        )
        carList.add(car2)
    }


}
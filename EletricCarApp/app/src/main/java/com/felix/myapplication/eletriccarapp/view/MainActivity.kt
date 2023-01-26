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
            R.drawable.electric_car,
            "R$ 200,000",
            "232 KwH",
            "250 cv",
            "120 min"
        )
        carList.add(car1)

        val car2 = CarModel(
            R.drawable.image_ferrari,
            "R$ 1.000,000",
            "432 KwH",
            "350 cv",
            "45 min"
        )
        carList.add(car2)

        val car3 = CarModel(
            R.drawable.image_uno,
            "R$ 4.000",
            " ♾ KwH",
            "1000 cv",
            "5 hidrelétricas"
        )
        carList.add(car3)

        val car4 = CarModel(
            R.drawable.image_lamborghini,
            "R$ 450.000",
            " 300 KwH",
            "400 cv",
            "120 min"
        )
        carList.add(car4)

    }


}
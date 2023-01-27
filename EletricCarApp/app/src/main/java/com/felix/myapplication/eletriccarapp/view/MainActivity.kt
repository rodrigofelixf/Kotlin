package com.felix.myapplication.eletriccarapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.adapter.AdapterCar
import com.felix.myapplication.eletriccarapp.adapter.TabAdapter
import com.felix.myapplication.eletriccarapp.data.CarData
import com.felix.myapplication.eletriccarapp.databinding.ActivityMainBinding
import com.felix.myapplication.eletriccarapp.model.CarModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabView
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterCar: AdapterCar


    private val carList: MutableList<CarModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupList()
        setupViews()

        //eventos de click
        binding.buttonCalculateMain.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate_main) {
            startActivity(Intent(this, CalculateActivity::class.java))
        }
    }


    private fun setupList() {
        binding.recyclerInfomacoes.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerInfomacoes.setHasFixedSize(true)

        // Criando um adapter para introduzir no Recyclerview do XML
        adapterCar = AdapterCar(this, carList)
        binding.recyclerInfomacoes.adapter = adapterCar

        val carData = CarData.listDataCar
        carData.forEach {
            carList.add(it)
        }


    }


    private fun setupViews() {
        /*
        o viewPager pega os conteudos dos fragments e em seguida o TabLayoutMediator
        faz as ligacoes e as criacoes do nome.
         */
        val tabLayout = binding.tabLayout
        val viewPager2 = binding.viewPager2
        val adapter = TabAdapter(this)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = getString(adapter.tabs[position])
        }.attach()

    }


}
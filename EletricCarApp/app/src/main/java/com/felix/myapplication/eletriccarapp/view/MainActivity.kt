package com.felix.myapplication.eletriccarapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.adapter.AdapterCar
import com.felix.myapplication.eletriccarapp.adapter.TabAdapter
import com.felix.myapplication.eletriccarapp.data.CarData
import com.felix.myapplication.eletriccarapp.databinding.ActivityMainBinding
import com.felix.myapplication.eletriccarapp.model.CarModel
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

        setupViews()



    }

    override fun onClick(view: View) {
        if (view.id == R.id.floating_buttom_calculate) {
            startActivity(Intent(this, CalculateActivity::class.java))
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
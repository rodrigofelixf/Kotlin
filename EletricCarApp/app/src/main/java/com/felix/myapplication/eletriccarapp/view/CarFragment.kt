package com.felix.myapplication.eletriccarapp.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.adapter.AdapterCar
import com.felix.myapplication.eletriccarapp.data.CarData
import com.felix.myapplication.eletriccarapp.databinding.CarFragmentBinding
import com.felix.myapplication.eletriccarapp.model.CarModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CarFragment : Fragment() {

    lateinit var floatButton: FloatingActionButton
    lateinit var recyclerIniformacoes: RecyclerView

    lateinit var adapterCar: AdapterCar
    private val carList: MutableList<CarModel> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView(view)
        setupList()
        setupListeners()
        //eventos de click

    }

    fun setupView(view: View) {
        floatButton = view.findViewById(R.id.floating_buttom_calculate)
        recyclerIniformacoes = view.findViewById(R.id.recycler_infomacoes)

    }


    private fun setupList() {
        recyclerIniformacoes.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerIniformacoes.setHasFixedSize(true)

        // Criando um adapter para introduzir no Recyclerview do XML
        adapterCar = AdapterCar(requireContext(), carList)
        recyclerIniformacoes.adapter = adapterCar

        val carData = CarData.list
        carData.forEach {
            carList.add(it)
        }
    }

    fun setupListeners() {
        floatButton.setOnClickListener {
            startActivity(Intent(context, CalculateActivity::class.java))
        }
    }


}
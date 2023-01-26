package com.felix.myapplication.eletriccarapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.felix.myapplication.eletriccarapp.databinding.CarItemBinding
import com.felix.myapplication.eletriccarapp.model.CarModel

class AdapterCar(private val context: Context, private val listaCar: MutableList<CarModel>) :
    RecyclerView.Adapter<AdapterCar.CarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val itemLista = CarItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return CarViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.price.text = listaCar[position].price
        holder.batery.text = listaCar[position].battery
        holder.power.text = listaCar[position].power
        holder.recharge.text = listaCar[position].Recharge
    }

    override fun getItemCount() = listaCar.size



    inner class CarViewHolder(binding: CarItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val price = binding.textPriceValue
        val batery = binding.textBateryValue
        val power = binding.textPowerValue
        val recharge = binding.textRechargeValue

    }
}
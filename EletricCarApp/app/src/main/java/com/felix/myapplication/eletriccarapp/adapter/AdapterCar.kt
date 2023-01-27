package com.felix.myapplication.eletriccarapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.felix.myapplication.eletriccarapp.databinding.CarItemBinding
import com.felix.myapplication.eletriccarapp.model.CarModel
import com.felix.myapplication.eletriccarapp.view.CarFragment

class AdapterCar(private val context: Context, private val carModel: MutableList<CarModel>) :
    RecyclerView.Adapter<AdapterCar.CarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val itemList = CarItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return CarViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.price.text = carModel[position].price
        holder.batery.text = carModel[position].battery
        holder.power.text = carModel[position].power
        holder.recharge.text = carModel[position].recharge
    }

    override fun getItemCount() = carModel.size



    inner class CarViewHolder(binding: CarItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val price = binding.textPriceValue
        val batery = binding.textBateryValue
        val power = binding.textPowerValue
        val recharge = binding.textRechargeValue

    }
}
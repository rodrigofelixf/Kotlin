package com.felix.myapplication.eletriccarapp.data

import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.model.CarModel

object CarData {

    val list = listOf(
        CarModel(
            id = 1,
            price = "R$300,000,00",
            battery = "300 kWh",
            power = "200cv",
            recharge = "30 min",
            urlPhoto = "www.google.com.br"
        ),
        CarModel(
            id = 2,
            price = "R$200,000,00",
            battery = "200 kWh",
            power = "150cv",
            recharge = "40 min",
            urlPhoto = "www.google.com.br"
        )
    )



}
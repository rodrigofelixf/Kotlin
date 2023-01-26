package com.felix.myapplication.eletriccarapp.data

import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.model.CarModel

object CarData {

    val car1 = CarModel(
        R.drawable.electric_car,
        "R$ 200,000",
        "232 KwH",
        "250 cv",
        "120 min"
    )

    val car2 = CarModel(
        R.drawable.image_ferrari,
        "R$ 1.000,000",
        "432 KwH",
        "350 cv",
        "45 min"
    )

    val car3 = CarModel(
        R.drawable.image_uno,
        "R$ 4.000",
        " ♾ KwH",
        "1000 cv",
        "5 hidrelétricas"
    )

    val car4 = CarModel(
        R.drawable.image_lamborghini,
        "R$ 450.000",
        " 300 KwH",
        "400 cv",
        "120 min"
    )

    /*
    Essa lista serve para organizar os dados e chama-la na MainActivity na funcao setupList()
     */
    val listDataCar = listOf(car1, car2, car3, car4)


}
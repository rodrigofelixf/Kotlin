package com.felix.myapplication.eletriccarapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.view.CarFragment
import com.felix.myapplication.eletriccarapp.view.FavoriteFragment

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    // crio uma lista com os fragments e tabs/strings que vao ser passadas como parametros
    val tabs = arrayOf(R.string.car_tab, R.string.favorite_tab)
    private val fragments = arrayOf(CarFragment(), FavoriteFragment())

    // aqui cria as tabs com seus fragments
    override fun createFragment(position: Int): Fragment {
        return fragments[position]
        }
    // pega a quantidade de tabs
    override fun getItemCount() = fragments.size



}
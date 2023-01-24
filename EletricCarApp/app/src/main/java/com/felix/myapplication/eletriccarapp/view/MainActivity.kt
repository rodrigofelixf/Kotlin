package com.felix.myapplication.eletriccarapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.felix.myapplication.eletriccarapp.R
import com.felix.myapplication.eletriccarapp.databinding.ActivityMainBinding
import com.felix.myapplication.eletriccarapp.viewmodel.somaViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: somaViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculateMain.setOnClickListener() {
            startActivity(Intent(this,CalculateActivity::class.java))
        }

        binding.imageCar01.setOnClickListener(){

        }
    }




}
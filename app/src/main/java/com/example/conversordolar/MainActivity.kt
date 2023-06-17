package com.example.conversordolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.conversordolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoConversor.setOnClickListener {
          val dolar = binding.valorDolar.text.toString().toDouble()
          val reais = String.format("%.2f", dolar * 4.92)

          binding.valorReal.text = "R$ ${reais}"
        }
    }


}
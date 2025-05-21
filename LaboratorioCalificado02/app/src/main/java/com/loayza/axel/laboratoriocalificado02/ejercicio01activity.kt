package com.loayza.axel.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.loayza.axel.laboratoriocalificado02.databinding.ActivityEjercicio01activityBinding

class ejercicio01activity : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio01activityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityEjercicio01activityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.Mostrar.visibility = View.VISIBLE
        binding.Ocultar.visibility = View.GONE

        binding.Mostrar.setOnClickListener {
            binding.vw3.visibility = View.VISIBLE
        }

        binding.Ocultar.setOnClickListener {
            binding.vw3.visibility = View.GONE
        }
    }
}

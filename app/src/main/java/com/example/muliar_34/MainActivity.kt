package com.example.muliar_34

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.muliar_34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textHello.setOnClickListener {
            binding.textHello.setTextColor(Color.RED)
        }

        binding.textGroup.setOnClickListener {
            binding.textGroup.setTextColor(Color.BLUE)
        }

        binding.textCity.setOnClickListener {
            binding.textCity.setTextColor(Color.GREEN)
        }

        binding.buttonHide.setOnClickListener {
            binding.textHello.visibility = View.GONE
        }

        binding.buttonShow.setOnClickListener {
            binding.textHello.visibility = View.VISIBLE
        }
    }
}

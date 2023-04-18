package com.example.lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(DOG, inf.info)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(CAT, inf1.info1)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(PARROT, inf2.info2)
            startActivity(intent)
        }
    }
    companion object{
        val CAT = "Cat"
        val DOG = "Dog"
        val PARROT = "Parrot"
    }
}
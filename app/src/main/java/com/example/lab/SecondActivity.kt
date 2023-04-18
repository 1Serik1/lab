package com.example.lab

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val qtext = intent.getStringExtra(MainActivity.DOG)
        val q = findViewById<TextView>(R.id.textView5)
        q.text = qtext

        val ctext = intent.getStringExtra(MainActivity.CAT)
        val c = findViewById<TextView>(R.id.textView6)
        c.text = ctext

        val ptext = intent.getStringExtra(MainActivity.PARROT)
        val p = findViewById<TextView>(R.id.textView7)
        p.text = ptext
    }
}
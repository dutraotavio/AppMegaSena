package com.dutradev.appmegasena

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var prefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val editText : EditText = findViewById(R.id.editTextInputNumbers)
        val textViewNumbers : TextView = findViewById(R.id.textViewNumbers)
        val btnSort : Button = findViewById(R.id.btnSortear)

        prefs = getSharedPreferences("db", Context.MODE_PRIVATE)
        val result = prefs.getString("result", null)

        result?.let { textViewNumbers.text = "Última aposta gerada:\n$it" }


        btnSort.setOnClickListener {
            val text = editText.text.toString()
            numberGenerator(text, textViewNumbers)
        }
    }

    private fun numberGenerator(text: String, textViewNumbers: TextView) {
        if (text.isEmpty()) {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            return
        }

        val amount = text.toInt()

        if (amount < 6 || amount > 15) {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            return
        }

        val numbers = mutableSetOf<Int>()
        val random = Random()

        while (true) {
            val number = random.nextInt(60)
            numbers.add(number + 1)

            if (numbers.size == amount) {
                break
            }
        }

        textViewNumbers.text = numbers.joinToString(" - ")

        prefs.edit().apply() {
            putString("result", textViewNumbers.text.toString())
            apply()
        }
    }
}
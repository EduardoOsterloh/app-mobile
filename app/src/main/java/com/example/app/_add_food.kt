package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.widget.Button
import android.widget.EditText

import android.content.Context


class _add_food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)

        val nome_alimento: EditText = findViewById(R.id.nome_alimento)
        val calorias_alimento: EditText = findViewById(R.id.calorias_alimento)
        val adicionar_alimento: Button = findViewById(R.id.adicionar_alimento)

        adicionar_alimento.setOnClickListener {
            val nomeAlimento = nome_alimento.text.toString()
            val caloriaAlimento= calorias_alimento.text.toString()
            val caloriaAlimentoInt = caloriaAlimento.toIntOrNull()


            if (nomeAlimento.isNotEmpty() && caloriaAlimento.isNotEmpty()) {
                val resultIntent = Intent()
                resultIntent.putExtra("nomeAlimento", nomeAlimento)
                resultIntent.putExtra("caloriaAlimento", caloriaAlimentoInt)

                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }


        }
    }
}

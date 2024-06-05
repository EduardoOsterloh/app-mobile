package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.app.databinding.ActivityCadastrarBinding


class Cadastrar: AppCompatActivity() {

    private lateinit var binding:ActivityCadastrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val inputname = findViewById<EditText>(R.id.inputnome)
        val inputemail = findViewById<EditText>(R.id.inputEmail)

        binding.textvoltar.setOnClickListener{
            val voltar = Intent(this,MainActivity::class.java)
            startActivity(voltar)

        }

        binding.btnetapa.setOnClickListener {
            val name = inputname.text.toString()
            DataHolder.conteudoNome = name
            val email = inputemail.text.toString()
            DataHolder.conteudoEmail = email

            val infoGerais = Intent(this, InfoUsuario01::class.java)
            startActivity(infoGerais)
        }


    }
}
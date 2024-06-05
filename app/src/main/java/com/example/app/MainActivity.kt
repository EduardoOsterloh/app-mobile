package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.databinding.ActivityMainBinding
import com.example.app.UsuarioCadastrado

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cadastrar.setOnClickListener{
            val telaCadastro = Intent(this,Cadastrar::class.java)
            startActivity(telaCadastro)
        }

        binding.entrar.setOnClickListener {
            val telausuariosenha = Intent(this,usuario_senha::class.java)
            startActivity(telausuariosenha)
        }


    }
}



package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import DataHolder
import android.view.View
import android.content.Intent
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.app.databinding.ActivityInfoUsuario01Binding
import com.example.app.databinding.ActivityMainBinding
import com.example.app.databinding.ActivityTelaPerfilBinding

class TelaPerfil : AppCompatActivity() {
    private lateinit var binding: ActivityTelaPerfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val txt = findViewById<TextView>(R.id.btnn)
        val inputname = DataHolder.conteudoNome



        txt.text = "Olá $inputname"

        binding.imageViewArrow00.setOnClickListener{
            val telaTMB = Intent(this,tmb::class.java)
            startActivity(telaTMB)
        }
    }}
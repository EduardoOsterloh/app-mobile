package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import DataHolder
import android.view.View
import android.content.Intent
import androidx.fragment.app.Fragment
import com.example.app.databinding.ActivityInfoUsuario01Binding
import com.example.app.databinding.ActivityTelaPerfilBinding


class tmb : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tmb)
        // Recupera o valor armazenado no DataHolder
        val conteudoObjetivo = DataHolder.conteudo1tela
        val conteudoAtividade = DataHolder.conteudo2tela
        //val conteudoBUTTON = DataHolder.conteudo3telaButton
        val inputname = DataHolder.conteudo3telaIdade
        val inputaltura = DataHolder.conteudo3telaAltura
        val inputpeso = DataHolder.conteudo3telaPeso


        val inputIdade = inputname?.toDoubleOrNull()
        val inputAltura = inputaltura?.toDoubleOrNull()
        val inputPeso = inputpeso?.toDoubleOrNull()
        val textView = findViewById<TextView>(R.id.tmb)
        val textmeta = findViewById<TextView>(R.id.txtprato)
        val textagua = findViewById<TextView>(R.id.seilamano)
        val btnPerfil = findViewById<TextView>(R.id.btn_perfil)

        if (inputIdade != null && inputAltura != null && inputPeso != null) {
            var conta=88.362+(13*inputPeso)+(4.799*inputAltura) - (5.677*inputIdade)

            val contaFormat = String.format("%.2f kcal",conta)
            textView.text =  contaFormat

            if(conteudoObjetivo == "Ganhar"){
                conta+=500
            }

            if(conteudoObjetivo == "Perder"){
                conta-=300
            }

            if(conteudoAtividade == "Ativo"){
                conta+=200
            }

            if(conteudoAtividade == "Muito"){
                conta+=400
            }

            if(conteudoAtividade == "Pouco"){
                conta+=100
            }

            val metaagua = inputPeso * 40

            val aguaformat = String.format("%.2f ML",metaagua)
            textagua.text = aguaformat

            val contaFormatada = String.format("%.2f Kcal", conta)
            textmeta.text =  contaFormatada



        }
        btnPerfil.setOnClickListener{
            val intent = Intent(this, TelaPerfil::class.java)
            startActivity(intent)
        }
    }
}


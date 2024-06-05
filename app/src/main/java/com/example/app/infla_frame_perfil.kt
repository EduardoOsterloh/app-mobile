package com.example.app

import DataHolder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class infla_frame_perfil : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.frame_perfil, container, false)
        val text_obj = view.findViewById<TextView>(R.id.info_objetivo)
        val text_altura =   view.findViewById<TextView>(R.id.info_altura)
        val text_peso = view.findViewById<TextView>(R.id.info_peso)
        val text_idade =  view.findViewById<TextView>(R.id.info_idade)
        val text_email = view.findViewById<TextView>(R.id.info_email)
        val text_sexo = view.findViewById<TextView>(R.id.info_sexo)
        val text_senha = view.findViewById<TextView>(R.id.senha)
        val nome = view.findViewById<TextView>(R.id.btnn)
        val text_atividade = view.findViewById<TextView>(R.id.info_atividade)



        val objetivo = DataHolder.safeConteudo1tela
        var altura = DataHolder.safeConteudo3telaAltura
        val peso = DataHolder.safeConteudo3telaPeso
        val idade = DataHolder.safeConteudo3telaIdade
        val email = DataHolder.safeConteudoEmail
        val Nome = DataHolder.safeConteudoNome
        val sexo = DataHolder.safeConteudo3telaButton
        val atividade = DataHolder.safeConteudo2telaButton



        nome.text = "Olá $Nome"
        text_obj.text = " Objetivo: $objetivo"
        text_altura.text = " Altura: $altura (cm)"
        text_peso.text = " Peso: $peso (Kg)"
        text_idade.text = " Idade: $idade (anos)"
        text_email.text = " Email: $email"
        text_sexo.text = "Sexo: $sexo"
        text_atividade.text = "Atividade: $atividade"
        text_senha.text = "Senha: ••••••••••••"




        return view
    }

}
package com.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.cardview.widget.CardView


class Activitystep2fragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_step2, container, false)
        val ativo = view.findViewById<CardView>(R.id.card_view)
        val pouco = view.findViewById<CardView>(R.id.card_view01)
        val muito = view.findViewById<CardView>(R.id.card_view02)
        var opcaoSelecionada: String? = null

        ativo.setOnClickListener{
            Toast.makeText(requireContext(), "Ativo selecionado", Toast.LENGTH_SHORT).show()
            opcaoSelecionada=  "Ativo"
            DataHolder.conteudo2tela = opcaoSelecionada
        }
        pouco.setOnClickListener{
            Toast.makeText(requireContext(), "Pouco ativoselecionado", Toast.LENGTH_SHORT).show()
            opcaoSelecionada = "Pouco ativo"
            DataHolder.conteudo2tela = opcaoSelecionada
        }
        muito.setOnClickListener{
            Toast.makeText(requireContext(), "Muito ativo selecionado", Toast.LENGTH_SHORT).show()
            opcaoSelecionada = "Muito ativo"
            DataHolder.conteudo2tela = opcaoSelecionada
        }
        return view
    }
}



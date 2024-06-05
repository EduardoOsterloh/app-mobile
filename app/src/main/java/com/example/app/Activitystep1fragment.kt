package com.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.Toast


class Activitystep1fragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_step1, container, false)
        val btnemagrecer = view.findViewById<Button>(R.id.buttonEmagrecer)
        val btnganhar = view.findViewById<Button>(R.id.buttonGanharPeso)
        val btnmanter = view.findViewById<Button>(R.id.buttonManterPeso)
        var opcaoSelecionada: String?

        btnemagrecer.setOnClickListener {
            Toast.makeText(requireContext(), "Emagrecer selecionado", Toast.LENGTH_SHORT).show()
            opcaoSelecionada = "Emagrecer"
            DataHolder.conteudo1tela = opcaoSelecionada
        }
        btnganhar.setOnClickListener {
            Toast.makeText(requireContext(), "Ganhar peso selecionado", Toast.LENGTH_SHORT).show()
            opcaoSelecionada = "Ganhar peso"
            DataHolder.conteudo1tela = opcaoSelecionada

        }
        btnmanter.setOnClickListener {
            Toast.makeText(requireContext(), "Manter peso selecionado", Toast.LENGTH_SHORT).show()
            opcaoSelecionada = "Manter peso"
            DataHolder.conteudo1tela = opcaoSelecionada
        }
        return view
    }





}
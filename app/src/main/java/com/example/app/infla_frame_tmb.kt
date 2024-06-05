package com.example.app


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Toast


class infla_frame_tmb : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.frame_tmb, container, false)
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
        val textView = view.findViewById<TextView>(R.id.tmb)
        val textmeta = view.findViewById<TextView>(R.id.txtprato)
        val textagua = view.findViewById<TextView>(R.id.seilamano)


        if (inputIdade != null && inputAltura != null && inputPeso != null) {
            var conta = 88.362 + (13 * inputPeso) + (4.799 * inputAltura) - (5.677 * inputIdade)

            val contaFormat = String.format("%.2f kcal", conta)
            textView.text = contaFormat
            DataHolder.conteudoTmb = contaFormat




            if (conteudoObjetivo == "Ganhar") {
                conta += 500
            }

            if (conteudoObjetivo == "Perder") {
                conta -= 300
            }

            if (conteudoAtividade == "Ativo") {
                conta += 200
            }

            if (conteudoAtividade == "Muito") {
                conta += 400
            }

            if (conteudoAtividade == "Pouco") {
                conta += 100
            }

            val metaagua = inputPeso * 40

            val aguaformat = String.format("%.2f ML", metaagua)
            textagua.text = aguaformat

            val contaFormatada = String.format("%.2f Kcal", conta)
            textmeta.text = contaFormatada



        }
        return view

    }
}
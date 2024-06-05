package com.example.app

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText


class Activitystep3fragment: Fragment() {

    private var selectedOption: Button? = null
    private lateinit var binding: Activitystep3fragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_step3, container, false)
        val btnFe = view.findViewById<Button>(R.id.btn_feminino)
        val btnmas = view.findViewById<Button>(R.id.btn_masculino)
        val finalizar = view.findViewById<Button>(R.id.finalizar)
        var opcaoSelecionada: String? = null

        val editText = view.findViewById<EditText>(R.id.inputidade)
        val editText00 = view.findViewById<EditText>(R.id.inputaltura)
        val editText01 = view.findViewById<EditText>(R.id.inputpeso)

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                DataHolder.conteudo3telaIdade = s.toString()}

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                }})

        editText00.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                DataHolder.conteudo3telaAltura = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

        editText01.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                DataHolder.conteudo3telaPeso = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

                finalizar.setOnClickListener {
                    val intent = Intent(activity, UsuarioCadastrado::class.java)
                    startActivity(intent)
                }

                btnFe.setOnClickListener {
                    setSelectedButton(btnFe)
                    opcaoSelecionada = "Feminino"
                    DataHolder.conteudo3telaButton = opcaoSelecionada

                }
                btnmas.setOnClickListener {
                    setSelectedButton(btnmas)
                    opcaoSelecionada = "Masculino"
                    DataHolder.conteudo3telaButton = opcaoSelecionada
                }


                return view
            }
    private fun setSelectedButton(button: Button) {
        selectedOption?.setBackgroundResource(R.drawable.nselec)
        selectedOption = button
        button.setBackgroundResource(R.drawable.selecionado)
    }}





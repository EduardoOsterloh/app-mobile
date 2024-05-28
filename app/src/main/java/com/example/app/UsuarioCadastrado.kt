package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.app.databinding.ActivityCadastrarBinding
import com.example.app.databinding.ActivityUsuarioCadastrado2Binding

class UsuarioCadastrado: AppCompatActivity() {
    private lateinit var binding: ActivityUsuarioCadastrado2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsuarioCadastrado2Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
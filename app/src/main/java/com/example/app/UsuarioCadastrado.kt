package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.app.databinding.ActivityUsuarioCadastrado2Binding

class UsuarioCadastrado : AppCompatActivity() {

    private lateinit var binding: ActivityUsuarioCadastrado2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsuarioCadastrado2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            replaceFragment(infla_frame_tmb())
        }

        binding.perfil.setOnClickListener {
            replaceFragment(infla_frame_perfil())
        }

        binding.tmb.setOnClickListener {
            replaceFragment(infla_frame_tmb())
        }

        binding.alimentos.setOnClickListener {
            replaceFragment(infla_frame_alimentos())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
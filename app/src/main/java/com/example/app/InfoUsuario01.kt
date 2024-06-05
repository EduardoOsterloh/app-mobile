package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.fragment.app.Fragment
import com.example.app.databinding.ActivityInfoUsuario01Binding

class InfoUsuario01 : AppCompatActivity() {
    private var currentStep = 1
    private lateinit var binding:ActivityInfoUsuario01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_usuario01)
        binding = ActivityInfoUsuario01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textGeral.setOnClickListener{
            val telacadastro = Intent(this,Cadastrar::class.java)
            startActivity(telacadastro)
        }

        binding.imageViewArrow.setOnClickListener{
            val telacadastro = Intent(this,Cadastrar::class.java)
            startActivity(telacadastro)
        }
        updateStepIndicators()
}

    private fun updateStepIndicators() {
        findViewById<View>(R.id.step1).setBackgroundResource(if (currentStep == 1) R.drawable.step_indicator_selected else R.drawable.step_indicator_unselected)
        findViewById<View>(R.id.step2).setBackgroundResource(if (currentStep == 2) R.drawable.step_indicator_selected else R.drawable.step_indicator_unselected)
        findViewById<View>(R.id.step3).setBackgroundResource(if (currentStep == 3) R.drawable.step_indicator_selected else R.drawable.step_indicator_unselected)

        findViewById<View>(R.id.imageViewArrow).visibility = if (currentStep == 1) View.VISIBLE else View.GONE
        findViewById<View>(R.id.textGeral).visibility = if (currentStep == 1) View.VISIBLE else View.GONE
        findViewById<View>(R.id.nextButton).visibility = if (currentStep == 3) View.GONE else View.VISIBLE
        findViewById<View>(R.id.previousButton).visibility = if (currentStep == 1) View.GONE else View.VISIBLE

        findViewById<View>(R.id.previousButton).apply{
            setOnClickListener{
                if (currentStep > 1) {
                    currentStep--
                    updateStepIndicators()}
            }
        }
        findViewById<View>(R.id.nextButton).apply {
            setOnClickListener {
                if (currentStep < 3) {
                    currentStep++
                    updateStepIndicators()
                }
            }
        }

        loadStepFragment()
    }

    private fun loadStepFragment() {
        val fragment: Fragment = when (currentStep) {
            1 -> Activitystep1fragment()
            2 -> Activitystep2fragment()
            3 -> Activitystep3fragment()
            else -> throw IllegalStateException("Unexpected step")
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.wizardContent, fragment)
            .commit()
    }
}




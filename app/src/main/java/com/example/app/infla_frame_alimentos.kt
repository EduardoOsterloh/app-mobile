package com.example.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import DataHolder

class infla_frame_alimentos : Fragment() {

    private lateinit var container_alimento: LinearLayout
    private lateinit var container_alimento2:LinearLayout
    private lateinit var container_alimento3:LinearLayout
    private lateinit var container_alimento4:LinearLayout

    private lateinit var progressText:TextView
    private lateinit var addFoodLauncher: ActivityResultLauncher<Intent>
    private lateinit var addFoodLauncher2: ActivityResultLauncher<Intent>
    private lateinit var addFoodLauncher3: ActivityResultLauncher<Intent>
    private lateinit var addFoodLauncher4: ActivityResultLauncher<Intent>


    private lateinit var TextCafe: TextView
    private lateinit var TextAlmoco: TextView
    private lateinit var TextTarde: TextView
    private lateinit var TextJanta: TextView



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frame_alimentos, container, false)
        TextCafe = view.findViewById(R.id.soma_calorias_cafe)
        TextAlmoco= view.findViewById(R.id.soma_calorias_almoco)
        TextTarde = view.findViewById(R.id.soma_calorias_lanchetarde)
        TextJanta = view.findViewById(R.id.soma_calorias_noite)



        container_alimento = view.findViewById(R.id.container_alimento)
        container_alimento2 = view.findViewById(R.id.container_alimento2)
        container_alimento3 = view.findViewById(R.id.container_alimento3)
        container_alimento4 = view.findViewById(R.id.container_alimento4)

        progressText = view.findViewById<TextView>(R.id.progressText)


        //KCAL A SER CONSUMIDA
        val conteudotmb = DataHolder.conteudoTmb
        progressText.text = conteudotmb


        val textadicionar: TextView = view.findViewById(R.id.textadicionar)
        textadicionar.setOnClickListener {
            val intent = Intent(context, _add_food::class.java)
            addFoodLauncher.launch(intent)
        }

        val textadicionar2: TextView = view.findViewById(R.id.textadicionar2)
        textadicionar2.setOnClickListener {
            val intent = Intent(context, _add_food::class.java)
            addFoodLauncher2.launch(intent)
        }

        val textadicionar3: TextView = view.findViewById(R.id.textadicionar3)
        textadicionar3.setOnClickListener {
            val intent = Intent(context, _add_food::class.java)
            addFoodLauncher3.launch(intent)
        }

        val textadicionar4:TextView=view.findViewById(R.id.textadicionar4)
        textadicionar4.setOnClickListener {
            val intent = Intent(context, _add_food::class.java)
            addFoodLauncher4.launch(intent)
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addFoodLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data = result.data
                val nomeAlimento = data?.getStringExtra("nomeAlimento")
                val caloriaAlimento = data?.getIntExtra("caloriaAlimento", 0)
                if (nomeAlimento != null && caloriaAlimento != null) {
                    val maxNameLength = 15
                    val marginLeft = 1
                    val marginRight = 35
                    val formattedFood = "%${marginLeft}s%-${maxNameLength}s %${marginRight}s%s Kcal".format("", nomeAlimento, "", caloriaAlimento)
                    addFoodItem(container_alimento,formattedFood)

                    val novoValorCafe = (TextCafe.text.toString().toInt() + caloriaAlimento).toString()+ " Kcal"
                    TextCafe.text = novoValorCafe

                }
            }
        }

        addFoodLauncher2 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data = result.data
                val nomeAlimento = data?.getStringExtra("nomeAlimento")
                val caloriaAlimento = data?.getIntExtra("caloriaAlimento", 0)
                if (nomeAlimento != null && caloriaAlimento != null) {
                    val maxNameLength = 15 // Defina o comprimento máximo do foodName como preferir
                    val marginLeft = 1 // Margem à esquerda
                    val marginRight = 35
                    val formattedFood = "%${marginLeft}s%-${maxNameLength}s %${marginRight}s%s Kcal".format("", nomeAlimento, "", caloriaAlimento)
                    addFoodItem(container_alimento2,formattedFood)

                    val novoValorAlmoco = (TextAlmoco.text.toString().toInt() + caloriaAlimento).toString()+ " Kcal"
                    TextAlmoco.text = novoValorAlmoco


                }
            }
        }

        addFoodLauncher3 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data = result.data
                val nomeAlimento = data?.getStringExtra("nomeAlimento")
                val caloriaAlimento = data?.getIntExtra("caloriaAlimento", 0)
                if (nomeAlimento != null && caloriaAlimento != null) {
                    val maxNameLength = 15
                    val marginLeft = 1 // Margem à esquerda
                    val marginRight = 35
                    val formattedFood = "%${marginLeft}s%-${maxNameLength}s %${marginRight}s%s Kcal".format("", nomeAlimento, "", caloriaAlimento)
                    addFoodItem(container_alimento3,formattedFood)

                    val novoValorTarde = (TextTarde.text.toString().toInt() + caloriaAlimento).toString()+ " Kcal"
                    TextTarde.text = novoValorTarde
                }
            }
        }

        addFoodLauncher4 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data = result.data
                val nomeAlimento = data?.getStringExtra("nomeAlimento")
                val caloriaAlimento = data?.getIntExtra("caloriaAlimento", 0)
                if (nomeAlimento != null && caloriaAlimento != null) {
                    val maxNameLength = 15
                    val marginLeft = 1 // Margem à esquerda
                    val marginRight = 35
                    val formattedFood = "%${marginLeft}s%-${maxNameLength}s %${marginRight}s%s Kcal".format("", nomeAlimento, "", caloriaAlimento)
                    addFoodItem(container_alimento4,formattedFood)

                    val novoValorNoite = (TextJanta.text.toString().toInt() + caloriaAlimento).toString()+ " Kcal"
                    TextJanta.text = novoValorNoite
                }
            }
        }




    }

    private fun addFoodItem(container: LinearLayout, foodInfo: String) {
        val foodTextView = TextView(context)
        foodTextView.text = foodInfo
        foodTextView.textSize = 18f
        foodTextView.setPadding(16, 16, 16, 16)

        container.addView(foodTextView)
    }
}



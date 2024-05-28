import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.R
import com.example.app.TelaPerfil
import com.example.app.databinding.ActivityTmbBinding
import com.example.app.tmb


class Teste : AppCompatActivity() {
    private lateinit var binding: ActivityTmbBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tmb)

        binding.btnPerfil.setOnClickListener{
            val intent = Intent(this, TelaPerfil::class.java)
            startActivity(intent)
        }

    }}
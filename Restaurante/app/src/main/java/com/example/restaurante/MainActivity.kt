package com.example.restaurante

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Declarando a variável binding para vincular os componentes da interface de usuário.
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Inflando o layout da atividade principal usando a classe de vinculação gerada.
        binding = ActivityMainBinding.inflate(layoutInflater)
        
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Obtendo o nome de usuário passado como extra da intenção.
        val username = intent.extras?.getString("username")

        // Verificando se o nome de usuário não é nulo ou vazio e exibindo uma saudação personalizada.
        if (!username.isNullOrEmpty()) {
            binding.textOla.text = "Olá $username"
        }

        // Configurando o listener de clique para o botão de fechar, que encerra todas as atividades.
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }

        // Configurando os listeners de clique para os checkboxes e atualizando a visibilidade e quantidade conforme necessário.
        binding.checkPizza.setOnClickListener {
            if (binding.checkPizza.isChecked()) {
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            } else {
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        binding.checkSalada.setOnClickListener {
            if (binding.checkSalada.isChecked()) {
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        binding.checkHamburger.setOnClickListener {
            if (binding.checkHamburger.isChecked()) {
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }
    }
}

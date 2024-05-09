package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    // Declarando a variável binding para vincular os componentes da interface de usuário.
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflando o layout da atividade de login usando a classe de vinculação gerada.
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o listener de clique para o botão de entrada.
        binding.buttonEntrar.setOnClickListener {
            // Obtendo o nome de usuário e senha dos campos de texto.
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            // Verificando se o nome de usuário e a senha correspondem aos valores esperados.
            if (username.equals("abc") && password.equals("123")) {
                // Criando uma intenção para iniciar a atividade principal e passando o nome de usuário como extra.
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("username", username)
                startActivity(i)
                // Finalizando a atividade de login após iniciar a atividade principal.
                finish()
            } else {
                // Exibindo um aviso ao usuário de que as credenciais estão incorretas.
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }
    }
}

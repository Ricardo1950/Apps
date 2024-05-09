package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Utilizando um Handler para postar uma ação após um atraso de 2 segundos.
        Handler(Looper.getMainLooper()).postDelayed({

            // Obtendo a intenção que iniciou esta atividade.
            val i = intent

            // Criando uma nova intenção para iniciar a atividade de pedido.
            val j = Intent(this, PedidoActivity::class.java)

            // Passando todos os extras da intenção original para a nova intenção.
            j.putExtras(i)

            // Iniciando a atividade de pedido.
            startActivity(j)

        }, 2000) // Atraso de 2 segundos antes de executar a ação.
    }
}

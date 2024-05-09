package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {

    // Declarando a variável binding para vincular os componentes da interface de usuário.
    private lateinit var binding: ActivityPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Inflando o layout da atividade de pedido usando a classe de vinculação gerada.
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Obtendo a intenção que iniciou esta atividade.
        val intent = intent

        // Obtendo as quantidades de pizza, salada e hambúrguer passadas como extras da intenção e convertendo para inteiro.
        val quantidadePizza = intent.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = intent.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = intent.getStringExtra("quantidadeHamburguer").toString().toInt()

        // Criando o texto do resumo do pedido com base nas quantidades e preços dos itens.
        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza * 8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada * 10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer * 12}\n"

        // Exibindo o resumo do pedido no componente de texto da interface.
        binding.textResumo.text = texto
    }
}

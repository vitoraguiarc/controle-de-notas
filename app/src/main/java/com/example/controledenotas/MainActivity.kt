package com.example.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//variavel utilizada na função
private lateinit var nomeEditText: EditText
private lateinit var nota1EditText: EditText
private lateinit var nota2EditText: EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado = findViewById<TextView>(R.id.resultado)
        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)

        calcular.setOnClickListener {
            nota1EditText = findViewById(R.id.nota1)
            nota2EditText = findViewById(R.id.nota2)
            nomeEditText = findViewById(R.id.nome)

            if (validarCampos()) {

                val nota1 = nota1EditText.text.toString().toInt()
                val nota2 = nota2EditText.text.toString().toInt()
                val nome = nomeEditText.text.toString()

                val media = calcularMedia(nota1, nota2,)

                resultado.text = situacaoAluno(media)


            }
        }

        //botão sair
        sair.setOnClickListener {
            finish()
        }
    }


    //Verificando se tem erro
    private fun validarCampos(): Boolean {
        var noError = true //sem erro
        if (nomeEditText.text.isBlank()) {
            nomeEditText.setError("Digite seu nome!") //caixa vazia ocorre o erro e avisa o usuario
            noError = false
        }
        if (nota1EditText.text.isBlank()) {
            nota1EditText.setError("Digite a sua nota 1")
            noError = false
        }
        if (nota2EditText.text.isBlank()) {
            nota2EditText.setError("Digite a sua nota 2")
            noError = false
        }

        return noError

    }
}
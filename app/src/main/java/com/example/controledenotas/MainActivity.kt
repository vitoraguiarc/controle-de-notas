package com.example.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)

        calcular.setOnClickListener {
            val nota1 = findViewById<EditText>(R.id.nota1).text.toString().toInt()
            val nota2 = findViewById<EditText>(R.id.nota2).text.toString().toInt()
            val faltas = findViewById<EditText>(R.id.faltas).text.toString().toInt()
            val resultado = findViewById<TextView>(R.id.resultado)
            val nota1Mostrar = findViewById<TextView>(R.id.valor1)
            val nota2Mostrar = findViewById<TextView>(R.id.valor2)
            val faltasMostrar = findViewById<TextView>(R.id.faltasTotal)

            val media = (nota1 + nota2) / 2


            if (media >= 5) {
                resultado.text = "Aprovado"
                resultado.setTextColor(Color.GREEN)
                nota1Mostrar.text = "Nota 1: ${nota1}"
                nota2Mostrar.text = "Nota 2: ${nota2}"
                faltasMostrar.text = "Total de faltas: ${faltas}"
            }   else {
                resultado.text = "Reprovado"
                resultado.setTextColor(Color.RED)
                nota1Mostrar.text = "Nota 1: ${nota1}"
                nota2Mostrar.text = "Nota 2: ${nota2}"
                faltasMostrar.text = "Total de faltas: ${faltas}"
            }

        }

        sair.setOnClickListener {
            finish()
        }
    }
}
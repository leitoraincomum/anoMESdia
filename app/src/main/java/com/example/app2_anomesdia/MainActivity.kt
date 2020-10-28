package com.example.app2_anomesdia

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_Ano = findViewById<EditText>(R.id.txt_Ano)
        val txt_Mes = findViewById<EditText>(R.id.txt_Mes)
        val txt_Dia = findViewById<EditText>(R.id.txt_Dia)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)
        val txt_Exibir = findViewById<TextView>(R.id.txt_Exibir)

        btn_Converter.setOnClickListener {
            if (txt_Ano.text.isEmpty()) {
                txt_Ano.error = "Digite a quantidade de ano(s)"
            } else if (txt_Mes.text.isEmpty()) {
                txt_Mes.error = "Digite a quantidade de mes(es)"
            } else if (txt_Dia.text.isEmpty()) {
                txt_Dia.error = "Digite a quantidade de dia(s)"
            } else {
                val ano = txt_Ano.text.toString().toInt()
                val mes = txt_Mes.text.toString().toInt()
                val dia = txt_Dia.text.toString().toInt()
                val resultado: Int
                resultado = ano * 360 + mes * 30 + dia
                txt_Resultado.text = "A idade digitada equivale a $resultado dia(s)"
                val exibir:String
                exibir = "$ano ano(s), $mes mes(es) e $dia = $resultado dias\n"
                txt_Exibir.text = "$exibir"
            }

        }

        btn_Limpar.setOnClickListener {
            txt_Ano.text.clear()
            txt_Dia.text.clear()
            txt_Mes.text.clear()
            txt_Resultado.text = "Insira os dados para novo cálculo"
            }
        }
    }


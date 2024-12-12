package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity2.KEY_IMC"

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result2)

            val result = intent.getFloatExtra(KEY_RESULT_IMC,0f)
            val TvResult = findViewById<TextView>(R.id.tv_result)
            val TvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
            TvResult.text = result.toString()

            var classificacao: String? =  null

            if (result < 16){
                classificacao = "Baixo Peso Grau I"
            } else if( result >=16 && result <=16.99){
                classificacao = "Baixo Peso Grau II"
            } else if ( result >=17 && result <=18.49){
                classificacao = "Baixo Peso Grau III"
            } else if ( result >=18.50 && result <=24.99){
                classificacao = "Peso Adequado"
            } else if ( result >=25 && result<=29.99){
                classificacao = "Sobrepeso"
            } else if ( result >=30 && result <=34.99){
                classificacao= "Obesidade Grau I"
            } else if ( result >=35 && result <=39.99){
                classificacao = "Obesidade Grau II"
            } else {
                classificacao = "Obesidade Grau III"
            }
            TvClassificacao.text =classificacao

        }
    }

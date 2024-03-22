package com.example.kotlinsito

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var resultado: TextView? = null
    private var input = ""
    private var num1 = 0.0
    private var num2 = 0.0
    private var operador = ' '
    private val calculadora = Calculadora()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultado = findViewById(R.id.resultado)
    }

    fun numeros(view: View) {
        val boton = view as Button
        val numero = boton.text.toString()
        if (input == "0") {
            input = numero
        } else {
            input += numero
        }
        resultado!!.text = input
    }

    fun operadores(view: View) {
        val boton = view as Button
        if (!input.isEmpty()) {
            num1 = input.toDouble()
            operador = boton.text.toString()[0]
            resultado!!.text = "$num1 $operador "
            input = ""
        }
    }

    fun punto(view: View?) {
        if (!input.contains(".")) {
            input += "."
            resultado!!.text = input
        }
    }

    fun igual(view: View?) {
        if (!input.isEmpty()) {
            num2 = input.toDouble()
            var resultadoCalculado = 0.0
            when (operador) {
                '+' -> resultadoCalculado = calculadora.sumar(num1, num2)
                '-' -> resultadoCalculado = calculadora.restar(num1, num2)
                '×' -> resultadoCalculado = calculadora.multiplicar(num1, num2)
                '÷' -> resultadoCalculado = calculadora.dividir(num1, num2)
                '^' -> resultadoCalculado = calculadora.potencia(num1, num2.toInt())
                else -> resultadoCalculado = Double.NaN
            }
            input = resultadoCalculado.toString()
            if (java.lang.Double.isNaN(resultadoCalculado)) {
                resultado!!.text = "ERROR"
            } else {
                resultado!!.text = input
            }
        }
    }

    fun ACReset(view: View?) {
        num1 = 0.0
        num2 = 0.0
        operador = ' '
        input = ""
        resultado!!.text = "0"
    }

    fun Fibonacci(view: View?) {
        if (!input.isEmpty()) {
            val numFibonacci = input.toInt()
            val serieFibonacci: kotlin.collections.List<Int> =
                calculadora.serieFibonacci(numFibonacci)
            resultado!!.text = "Serie Fibonacci($numFibonacci): $serieFibonacci"
        }
    }
}
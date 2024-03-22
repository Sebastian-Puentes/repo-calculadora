package com.example.kotlinsito
import java.util.ArrayList;


class Calculadora {
    fun sumar(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun restar(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multiplicar(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun dividir(num1: Double, num2: Double): Double {
        return if (num2 != 0.0) {
            num1 / num2
        } else {
            Double.NaN
        }
    }

    fun potencia(base: Double, exponente: Int): Double {
        return if (exponente == 0){
            1.0
        } else if (exponente < 0) {
            1.0 / (base * potencia(base, -exponente - 1))
        } else {
            base * potencia(base, exponente - 1)
        }
    }

    fun serieFibonacci(n: Int): kotlin.collections.List<Int> {
        val serie: MutableList<Int> = ArrayList()
        if (n < 0) {
            return serie
        }
        for (i in 0..n) {
            serie.add(fibonacci(i))
        }
        return serie
    }

    fun fibonacci(n: Int): Int {
        return if (n < 0) {
            -1
        } else if (n == 0) {
            0
        } else if (n == 1) {
            1
        } else {
            val NumMenos1 = fibonacci(n - 1)
            val NumMenos2 = fibonacci(n - 2)
            NumMenos1 + NumMenos2
        }
    }
}
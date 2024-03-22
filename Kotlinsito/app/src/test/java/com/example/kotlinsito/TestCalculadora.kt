package com.example.kotlinsito

import org.junit.Assert.assertEquals
import org.junit.Test

class TestCalculadora {
    @Test
    fun testSuma() {
        val calculadora = Calculadora()
        val resultado: Double = calculadora.sumar(2.0, 3.0)
        assertEquals(5.0, resultado, 0.001)
    }

    @Test
    fun testResta() {
        val calculadora = Calculadora()
        val resultado = calculadora.restar(5.0, 2.0)
        assertEquals(3.0, resultado, 0.001)
    }

    @Test
    fun testMultiplicacion() {
        val calculadora = Calculadora()
        val resultado = calculadora.multiplicar(5.0, 2.0)
        assertEquals(10.0, resultado, 0.001)
    }

    @Test
    fun testDivision() {
        val calculadora = Calculadora()
        val resultado = calculadora.dividir(6.0, 2.0)
        assertEquals(3.0, resultado, 0.001)
    }

    @Test
    fun testPotencia() {
        val calculadora = Calculadora()
        val resultado = calculadora.potencia(2.0, 3)
        assertEquals(8.0, resultado, 0.001)
    }

    @Test
    fun testFibonacci() {
        val calculadora = Calculadora()
        assertEquals(0, calculadora.fibonacci(0))
        assertEquals(1, calculadora.fibonacci(1))
        assertEquals(8, calculadora.fibonacci(6))
        assertEquals(55, calculadora.fibonacci(10))
    }
}
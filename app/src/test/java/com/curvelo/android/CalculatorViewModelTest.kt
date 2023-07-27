package com.curvelo.android

import com.curvelo.android.model.Calculator
import org.junit.Assert.*

import org.junit.Test

class CalculatorViewModelTest {
    private lateinit var calculator: Calculator

    @Test
    fun getNumber1() {
        calculator = Calculator(0,0)
    }

    @Test
    fun testAdd() {
        calculator = Calculator(5,10)
        assertEquals(15,calculator.add())

        calculator = Calculator(-5,10)
        assertEquals(5,calculator.add())

        calculator = Calculator(0,0)
        assertEquals(0,calculator.add())

    }

}
package com.curvelo.android.ViewModel

import androidx.lifecycle.ViewModel
import com.curvelo.android.model.Calculator

class CalculatorViewModel:ViewModel() {
    var number1 : Int = 0
    var number2: Int = 0

    fun addNumbers():Int{
        val calculator = Calculator(number1,number2)
        return calculator.add()
    }
}
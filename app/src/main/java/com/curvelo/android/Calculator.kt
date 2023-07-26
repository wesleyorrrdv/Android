package com.curvelo.android

data class Calculator(val number1: Int, val number2:Int){
    fun add(): Int = number1 + number2
}
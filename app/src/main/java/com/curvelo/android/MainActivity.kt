package com.curvelo.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var calculatorViewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val etNumber1 = findViewById<TextView>(R.id.etNumber1)
        val etNumber2 = findViewById<TextView>(R.id.etNumber2)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            calculatorViewModel.number1 = etNumber1.text.toString().toInt()
            calculatorViewModel.number2 = etNumber2.text.toString().toInt()
            tvResult.text = "Result: ${calculatorViewModel.addNumbers()}"
        }
    }
}
package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculateActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    lateinit var tvAnswer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etFirstNumber= findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        tvAnswer = findViewById(R.id.tvAnswer)

        btnAdd.setOnClickListener {
            tvAnswer.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            addition(number1,number2)

        }
        btnSubtract.setOnClickListener {
            tvAnswer.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            subtraction(number1,number2)

        }
        btnMultiply.setOnClickListener {
            tvAnswer.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            multiplication(number1,number2)

        }
        btnModulus.setOnClickListener {
            tvAnswer.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            modulus(number1,number2)
        }
    }

    fun addition(number1:Double, number2: Double){
        val add = number1+number2
        tvAnswer.text = add.toString()
    }
    fun subtraction(number1: Double, number2: Double){
        val subtract = number1-number2
        tvAnswer.text = subtract.toString()
    }
    fun multiplication(number1: Double, number2: Double){
        val multiply = number1*number2
        tvAnswer.text = multiply.toString()
    }
    fun modulus(number1: Double, number2: Double){
        val remainder = number1%number2
        tvAnswer.text = remainder.toString()
    }
}
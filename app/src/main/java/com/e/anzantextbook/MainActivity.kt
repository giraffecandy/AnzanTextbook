package com.e.anzantextbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumber1 = Random.nextInt(1000)
        val randomNumber2 = Random.nextInt(1000)
        number1Text.text = randomNumber1.toString()
        number2Text.text = randomNumber2.toString()

        val randomOperator = Random.nextInt(2)
        var operatorText = ""
        var correctAnswer = 0

        if (randomOperator == 0) {
            operatorText = "+"
            signText.text = operatorText
            correctAnswer = randomNumber1 + randomNumber2
        } else {
            operatorText = "-"
            signText.text = operatorText
            correctAnswer = randomNumber1 - randomNumber2
        }

    }
}
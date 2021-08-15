package com.aup.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollthedice:Button=findViewById(R.id.b1)
        rollthedice.setOnClickListener {
            rolldice()

        }
    }

    private fun rolldice() {
        val dice = Dice()
        val diceRoll = dice.roll_dice()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

    }
}
class Dice{
    fun roll_dice(): Int {
        return (1..6).random()

    }
}
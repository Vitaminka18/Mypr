package com.example.mypr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rButton:Button=findViewById(R.id.button)
        rButton.setOnClickListener {
           rollDice()
        }
    }

    private fun rollDice() {
        val dice=Dice(6)
        val kubRoll=dice.roll()
        val diceImage:ImageView=findViewById(R.id.imageView)
        when(kubRoll){
            1->diceImage.setImageResource(R.drawable.dice)
            2->diceImage.setImageResource(R.drawable.dice_two)
            3->diceImage.setImageResource(R.drawable.dice_three)
            4->diceImage.setImageResource(R.drawable.dice_four)
            5->diceImage.setImageResource(R.drawable.dice_five)
            6->diceImage.setImageResource(R.drawable.dice_six)

        }


    }

    class Dice(val numSides:Int){
        fun roll(): Int {
            return(1..numSides).random()
        }
    }
}
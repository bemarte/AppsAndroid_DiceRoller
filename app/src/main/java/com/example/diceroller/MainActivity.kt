package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById to get a reference to the button and assign it to an immutable variable called rollButton
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            //test Toast
            //Toast.makeText(this, "Botão clicado",Toast.LENGTH_SHORT).show()
            rollDice()
            rollDice2()
        }

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
    }

    private fun rollDice() {

        val drawbleResource = when (Random.nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawbleResource)
    }

    private fun rollDice2() {

        val drawbleResource = when (Random.nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawbleResource)
    }

}
package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import kotlin.random.Random
import android.widget.ImageView
import android.widget.Button


class MainActivity : ComponentActivity() {
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain)
        enableEdgeToEdge()

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.myButton)
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomDiceValue = Random.nextInt(1, 7)
        val imageResource = when (randomDiceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        imageView.setImageResource(imageResource)

        Toast.makeText(this, "Rolled a $randomDiceValue!", Toast.LENGTH_SHORT).show()
    }
}
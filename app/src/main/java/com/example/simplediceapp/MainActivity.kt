package com.example.simplediceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var dice = Dice()
    lateinit var diceValueField: TextView
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", dice.toString())
        diceValueField  = findViewById( R.id.showNrField )
        diceImage       = findViewById( R.id.diceImage )

    }

    fun rollDiceClick( view: View) {

        dice.roll()
        Log.d("MainActivity", dice.toString())

        diceValueField.text = dice.toString()

        diceImage.setImageResource(R.drawable.ic_dice_2)

    }




}

package com.example.simplediceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class DiceRollActivity : AppCompatActivity() {

    var dice = Dice()
    lateinit var diceImage: ImageView
    lateinit var answerText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roll)

        diceImage   = findViewById( R.id.diceImage )
        answerText  = findViewById( R.id.answerTextView )

        rollDice()
    }

    fun rollDice() {

        dice.roll()

        var iconName = R.drawable.ic_dice_1

        val diceVal = dice.toString()

        when ( diceVal ) {
            "1" -> iconName = R.drawable.ic_dice_1
            "2" -> iconName = R.drawable.ic_dice_2
            "3" -> iconName = R.drawable.ic_dice_3
            "4" -> iconName = R.drawable.ic_dice_4
            "5" -> iconName = R.drawable.ic_dice_5
            "6" -> iconName = R.drawable.ic_dice_6
        }

        val guess = intent.getStringExtra( EXTRA_GUESS )

        answerText.text = if ( guess.toInt() == diceVal.toInt() ) {
            "Rätt"
        }
        else {
            "Fel"
        }

        diceImage.setImageResource(iconName)
    }

}

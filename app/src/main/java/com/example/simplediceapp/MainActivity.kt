package com.example.simplediceapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var dice = Dice()
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", dice.toString())
        diceImage       = findViewById( R.id.diceImage )

    }

    fun rollDiceClick( view: View) {

        dice.roll()

        var iconName = R.drawable.ic_dice_1

       when( dice.toString() ) {
           "1" -> iconName = R.drawable.ic_dice_1
           "2" -> iconName = R.drawable.ic_dice_2
           "3" -> iconName = R.drawable.ic_dice_3
           "4" -> iconName = R.drawable.ic_dice_4
           "5" -> iconName = R.drawable.ic_dice_5
           "6" -> iconName = R.drawable.ic_dice_6
       }


        Log.d("MainActivity", dice.toString())


        diceImage.setImageResource(iconName)

    }




}

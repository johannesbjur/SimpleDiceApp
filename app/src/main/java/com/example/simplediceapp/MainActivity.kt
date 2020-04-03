package com.example.simplediceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val EXTRA_GUESS = "com.example.simplediceapp.guess"

class MainActivity : AppCompatActivity() {

    lateinit var guessTextInput: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendBtn = findViewById<Button>(R.id.sendBtn)
        guessTextInput = findViewById(R.id.guessTextInput)

        sendBtn.setOnClickListener {

            sendToAnswerActivity()
        }
    }

    fun sendToAnswerActivity() {

        val intent = Intent( this, DiceRollActivity::class.java ).apply {

            putExtra( EXTRA_GUESS, guessTextInput.text.toString() )
        }

        startActivity(intent)
    }



}

package com.example.simplediceapp

import kotlin.random.Random

class Dice() {

    var value: Int = Random.nextInt( 1, 7 )


    fun roll() {

        this.value = Random.nextInt( 1, 7 )
    }

    override fun toString(): String {

        return this.value.toString()
    }
}
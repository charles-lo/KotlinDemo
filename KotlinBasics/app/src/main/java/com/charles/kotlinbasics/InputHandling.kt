package com.charles.rockpaperscissor

fun main() {
    println("Please enter a number: ")
    val inputString = readln()
    val inputNumber = inputString.toInt()
    val multiplier = 5
    println("Result of operation is: " + inputNumber * multiplier)
}
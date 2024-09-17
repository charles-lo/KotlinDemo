package com.charles.kotlinbasics

fun main() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    println(numbers)
    for (i in 0 until numbers.size) {
        numbers[i] = numbers[i] * 2
    }
    println(numbers)

}


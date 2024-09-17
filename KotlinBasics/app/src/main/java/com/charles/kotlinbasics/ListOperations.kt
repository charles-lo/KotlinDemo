package com.charles.kotlinbasics

fun main() {

    val fruitsList = mutableListOf("Apple", "Orange", "Pineapple", "Grape", "Banana")
    println(fruitsList)
    fruitsList.add("Peach")
    println(fruitsList)
    fruitsList.remove("Banana")
    println(fruitsList)
    if (fruitsList.contains("Grape")) {
        println(" we have grape ")
    } else {
        println(" we don't have grape ")
    }


}


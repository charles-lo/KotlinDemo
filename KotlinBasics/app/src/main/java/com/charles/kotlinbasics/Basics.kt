package com.charles.kotlinbasics

import androidx.annotation.Size

fun main() {
    val number1 = 1;
//    number1 = 2

    /*
    //  var val readln practice
    var myAge = 35
    println(myAge)
    myAge = 36
    println(myAge)

    val enterdValue = readln()
    var age = enterdValue.toInt()

     */

    /*
    makeCoffee(5, "Jimmy")
    makeCoffee(1, "Charles")
    makeCoffee(0, "Andy")*/

    /*
    println("Enter number 1")
    val num1 = readln().toInt()
    println("Enter number 2")
    val num2 = readln().toInt()
    val result = add(num1, num2)
    println("The result of $num1 + $num2 is: $result")*/

    /*
    var daisy = Dog("Daisy", "Dwarf poodle")
    println("${daisy.name}  ${daisy.breed}    ${daisy.age} years old ")*/

    /*
    val myBook = Book()
    val customBook = Book("HA", "Charles", "2024")
    println("${myBook.title}  ${myBook.author}   ${myBook.yearPublished} ")
    println("${customBook.title}  ${customBook.author}   ${customBook.yearPublished} ")*/
    val  coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)
    makeCoffee(coffeeForDenis)
}

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun divide(num1: Int, num2: Int):Double{
    return num1/num2.toDouble()
}

fun add(num1:Int, num2:Int):Int{
    return num1 + num2
}

fun makeCoffee(details: CoffeeDetails) {
    when (details.sugarCount) {
        0 -> {
            println("Coffee with no sugar for ${details.name}")
        }
        1 -> {
            println("Coffee with ${details.sugarCount} spoon of sugar ${details.name}")
        }
        else -> {
            println("Coffee with ${details.sugarCount} spoons of sugar for ${details.name}")
        }
    }
}

fun makeCoffee(sugarCount : Int, name : String) {
    when (sugarCount) {
        0 -> {
            println("Coffee with no sugar for $name")
        }
        1 -> {
            println("Coffee with $sugarCount spoon of sugar $name")
        }
        else -> {
            println("Coffee with $sugarCount spoons of sugar for $name")
        }
    }
}
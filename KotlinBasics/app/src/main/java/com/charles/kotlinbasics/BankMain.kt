package com.charles.kotlinbasics

fun main() {
    val CharlesBankAccount = BankAccount("Charles Lo", 19999.0)
    CharlesBankAccount.deposit(200.0)
    CharlesBankAccount.withdraw(1200.0)
    CharlesBankAccount.deposit(3000.0)
    //CharlesBankAccount.displayTransactionHistory()

    val SarahAcc = BankAccount("Sarah", 0.0)
    SarahAcc.deposit(100.0)
    SarahAcc.withdraw(10.0)
    SarahAcc.deposit(300.0)
    SarahAcc.displayTransactionHistory()
    println("${SarahAcc.accountHolder}'s balance is ${SarahAcc.accBlance()} ")
}
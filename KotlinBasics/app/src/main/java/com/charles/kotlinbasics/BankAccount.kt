package com.charles.kotlinbasics

class BankAccount(
    var accountHolder: String,
    var balance: Double)
{
    private  val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            // we can withdraw
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            //we cannot withdraw money
            println("You don't have the funds to withdraw $$amount")
        }
    }

    fun accBlance() : Double{
        return balance
    }

    fun  displayTransactionHistory() {
        println("Transaction history of $")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }
}
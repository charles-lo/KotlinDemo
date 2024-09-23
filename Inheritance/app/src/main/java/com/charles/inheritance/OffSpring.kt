package com.charles.inheritance

class OffSpring : Secondary(), Archer, Singer{
    override fun archery() {
        super.archery()
        println("Archer skills enhanced by offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skill enhanced by offspring")
    }
}
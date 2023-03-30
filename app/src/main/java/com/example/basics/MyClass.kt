package com.example.basics

import java.util.*

fun main(){
    var person1 = Person("Park", "minhyeok")
    var person2 = Person()
    var person3 : Person = Person("D")
    var person4 = Person(lastName = "성은 모르고 이름만")
    println("------------------------------")

    var myCar = Car()
    println(myCar.myBrand)
    println(myCar.owner)
    myCar.maxSpeed = -5
    println(myCar.maxSpeed)
}

class Person(firstName : String = "P", lastName : String = "MH"){

    init {
        println("firstName is $firstName, lastName is $lastName")
    }


}

class Car(){
    lateinit var owner : String

    val myBrand: String = "BMW"
    // Custom getter
        get(){
            return field.toLowerCase()
        }
    var maxSpeed: Int = 250
        set(value) {
            field = if(value > 0) value else throw java.lang.IllegalArgumentException("0보다 커야함")
        }
    init {
        this.owner = "MH"
    }
}
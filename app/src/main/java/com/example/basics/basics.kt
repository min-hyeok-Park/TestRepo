package com.example.basics

fun main(){
    println("Hello11")
    var result = 5+3
    println("Hello $result$result")

    var name = "MH"
    if(name == "MH"){
        println("if - Hello")
    } else{
        println("if - Bye")
    }

    println("-----------------------------")
    var test = 18
    when(16){
        in 16..17 -> println("drive")
        in 18..20 -> println("vote")
        !in 0..20 -> println("drink")
        else -> println("Invaild")
    }

    println("-----------------------------")

    for(num in 1..10){
        print("$num ")
    }
    println("")

    for(i in 1 until 10){
        print("$i ")
    }
    println("")

    for(j in 10 downTo 1 step 2){
        print("$j ")
    }
    println("")

    for (o in 10.downTo(1).step(2)){
        print("$o ")
    }


}
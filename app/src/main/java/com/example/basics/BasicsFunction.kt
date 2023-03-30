package com.example.basics

fun main(){
    myFun()
    var result = myAdd(3,5)
    println("$result")
}

fun myAdd(a:Int, b:Int) : Int{
    return a+b
}

fun myFun(){
    println("Called from myFun")
}
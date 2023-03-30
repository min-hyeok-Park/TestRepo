package com.example.basics

fun main(){
    // 타입 추론
    // val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    // val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)

    //println(numbers.contentToString())
    // 이것처럼 하는줄 알았지만 for element처럼 가능
    /*
    for (i in 0 until numbers.size){
        print("${numbers[i]} ")
    }
    */
    for(element in numbers){
        print(element)
    }
}
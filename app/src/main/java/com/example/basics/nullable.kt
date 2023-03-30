package com.example.basics

fun main(){
    var name : String = "MH"
    // name = null은 불가능
    var nullableName : String? = "MH"
    nullableName = null // 이거는 가능

    var len = name.length
    println("$len")
    var len2 = nullableName?.length
    println("$len2")
    //nullableName?.let { println(it.length) }

    println("----------------------------")
    // ?: Elvis operator 엘비스 연산자
    var name2 = nullableName ?: "널이라면 기본값"
    println("$name2")

}
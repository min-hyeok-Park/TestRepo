package com.example.basics

// data class는 반드시 1개 이상의 매개변수를 입력해줘야 함.
data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "MH")

    // 프로퍼티 접근법
    //val name = user1.name
    //println(name)

    // id는 val이라 변경 불가능
    //user1.id = 2
    user1.name = "BBB"

    val user2 = User(1, "BBB")
    println(user1 == user2)

    val updatedUser = user1.copy(name = "CCC")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1())
    println(updatedUser.component2())

    val (id, name) = updatedUser
    println("id: $id, name: $name")
}
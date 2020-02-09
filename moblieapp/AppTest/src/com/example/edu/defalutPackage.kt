package com.example.edu

import kotlin.math.PI
import kotlin.math.abs
import com.example.dpack.Person
fun main() {
    val intro: String = "hi"
    val num: Int = 20
    println(PI)
    println(abs(-12.6))
    println("intro : $intro, num: $num")
    val user = Person("seonsik", 30)
    println("user_info : ${user.name + "," +user.age}")
}
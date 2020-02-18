package com.example.chap03

fun main() {
    val res1 = sums(3,2)
    val res2 = mul(sums(3,3),3)

    println("res1 = $res1, res2 = $res2")
}

fun sums(a:Int , b:Int) = a+b
fun mul(a:Int, b:Int) = a*b
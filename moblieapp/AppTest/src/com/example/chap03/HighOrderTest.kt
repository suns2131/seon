package com.example.chap03

fun main() {
    var result : Int
    val multi = {x:Int, y:Int -> x*y} // 일반변수에 람다식 할당
    result  =multi(10,20)//람다식은 함수처럼 사용가능
    println(result)
}
package com.example.chap03

fun main() {
    val num1 = 10
    val num2 = 3
    val result:Int

    result =  max(num1,num2)
    println(result)
    printSum(10,15)
    add("seonsik")
}

fun max(a:Int , b:Int) = if(a>b) a else b

fun printSum(a:Int,b:Int):Unit {println("sum : $a and $b is ${a+b}")}

fun add(name :String , email:String = "defalut")
{
    //name과 email을 회원목록에 저장
    //email의 기본값은 defalut로 고정.
    val output = "$name 님의 Email은 $email 입니다."
    println(output)
}

package com.example.edu

fun main() {
    var str1 : String? ="hello kotlin"
   str1 = null
    println("str1 :$str1 length : ${str1?.length ?: -1}")

    val num : Int = 10
    val num1 = num
    println(num === num1)

    val c :Int? = num
    val d :Int? = num
    val e :Int? = c
    println(c == d)
    println(num === d)
    println(c === e)

    var a: Any =1
    a = 20L
    println("a : $a type: ${a.javaClass}")

    checkArg("stringchk")
    checkArg(10)
}

fun checkArg(x : Any)
{
    //자료형 검사
    if(x is String)
    {
        println("x is String : $x")
    }
    else if(x is Int)
    {
        println("x is Int : $x")
    }
}
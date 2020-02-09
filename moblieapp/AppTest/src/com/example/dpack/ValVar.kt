package com.example.dpack

fun main() {
    val number = 10
    var language = "Korea"
    val Secondnum: Int = 20
    var a = 1
    val str = "a = $a"
    val str2 = "a = ${a+2}"
    language = "English"
    println("number : $number")
    println("language : $language")
    println("Secondnum : $Secondnum")

    println("Byte min: "+ Byte.MIN_VALUE + "  max : "+ Byte.MAX_VALUE)
    println("Short min: "+ Short.MIN_VALUE + "  max : "+ Short.MAX_VALUE)
    println("Long min: "+ Long.MIN_VALUE + "  max : "+ Long.MAX_VALUE)
    println("Int min: "+ Int.MIN_VALUE + "  max : "+ Int.MAX_VALUE)
    println("Float min: "+ Float.MIN_VALUE + "  max : "+ Float.MAX_VALUE)
    println("double min: "+ Double.MIN_VALUE + "  max : "+ Double.MAX_VALUE)

    println("str: \"$str\", str2 : \"$str2\"")

}


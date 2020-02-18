package com.example.chap03

fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name,email)
    add("둘리","dooly@gamil.com")
    defaultArgs()
    defaultArgs(200)
}
fun defaultArgs(x: Int = 100, y:Int = 200)
{
    print(x + y)
}
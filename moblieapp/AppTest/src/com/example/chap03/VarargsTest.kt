package com.example.chap03

fun main()
{
    normalVargs(1,2,3,4,5,6,7,8,9,1,0)
    normalVargs(1,2,3,4,5,6,7,8)
}
fun normalVargs(vararg count: Int)
{
    for(num in count)
    {
        print("$num")
    }
    println("\n")
}
package com.sistemalima.collections

fun main() {


    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    // modelo 1
    for (value in values) {
        println(value)
    }
    println("----------------------------------------")
    // modelo 2

    values.sort()
    values.forEach { it -> println(it) }


}
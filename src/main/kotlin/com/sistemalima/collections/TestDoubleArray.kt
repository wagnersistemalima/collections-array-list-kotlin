package com.sistemalima.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 5000.0, 500.0)
    salarios.sort()

    salarios.forEachIndexed { index, salario ->
        if (salario >= 5000.0) {
            salarios[index] = salario * 1.1
        }else {
            salarios[index] = salario
        }
          }

    salarios.forEach { println(it) }
}
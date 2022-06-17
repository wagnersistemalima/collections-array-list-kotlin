package com.sistemalima.collections

fun main() {
    val nomes = arrayOf("Marcos", "Wagner", "Antonio")

    nomes[0] = "Antonio"
    nomes[1] = "Wagner"
    nomes[2] = "Marcos"

    nomes.sort()

    nomes.forEach { it -> println(it) }

}
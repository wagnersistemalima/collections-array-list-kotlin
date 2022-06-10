package com.sistemalima.collections

// listas mutaveis

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 5000.0, tipoContratacao = "PJ")

    println()
    println("------Iniciando-------")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println()
    println("------Contratando o Pedro-------")

    funcionarios.add(pedro)

    funcionarios.forEach { println(it) }

    println()
    println("------Demitindo o Joao-------")

    funcionarios.remove(joao)

    funcionarios.forEach { println(it) }


}
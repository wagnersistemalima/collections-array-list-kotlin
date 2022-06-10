package com.sistemalima.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 5000.0, tipoContratacao = "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    println("----------Imprimindo a lista de funcionarios--------------------")
    println()

    funcionarios.forEach { println(it) }

    println()
    println("---------Buscando o funcionario especifico----------------")


    println(funcionarios.find { it.nome == "Maria" })

    println()
    println("---------Organizando a lista pelo salario e mostrando na tela os funcionarios ordenados------------")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }


    println()
    println("---------------------")

    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
)
package com.sistemalima.collections

fun main() {

    val salarios = arrayListOf(1000.0, 2250.0, 4000.0, 250.0)


    println("------------ Função Lambda maxOf e minOf e average-----------")

    val maior: Double? = salarios.maxOrNull()
    val menor: Double? = salarios.minOrNull()
    val media: Double = salarios.average()

    println("maior salario = $maior")
    println("menor salario = $menor")
    println("media salario = %.2f".format(media))

    println("-----------Implementando função--------------------")

    val maiorSalario = calculaMaiorSalario(salarios)
    val menorSalario = calculaMenorSalario(salarios)

    println("maior salario e: $maiorSalario")
    println("menor salario e: $menorSalario")


    println("-----------Quantos elementos do Array estao entre 2.000 e 5.000 --------------------")

    val quant = salarios.count { it in 2000.0..5000.0 }

    println("Quantidade salarios entre 2.000 e 5.000 = $quant")

    println("-----------Filtrar salarios menor ou iqual a 1.000 --------------------")

    println("Salarios menor ou iqual a 1.000 = ${salarios.filter { it <= 1000.0 }}")

}

private fun calculaMaiorSalario(salarios: MutableList<Double>): Double {

    var contador = 0
    var maiorSalario = salarios[0]

    for (salario in salarios) {

        if (salario >= maiorSalario ) {
            maiorSalario = salario
            contador++
        }
    }

    return maiorSalario
}

private fun calculaMenorSalario(salarios: MutableList<Double>): Double {

    var contador = 0
    var menorSalario = salarios[0]

    for (salario in salarios) {
        if (salario <= menorSalario ) {
            menorSalario = salario
            contador++
        }
    }

    return menorSalario
}
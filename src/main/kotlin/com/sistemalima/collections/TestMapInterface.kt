package com.sistemalima.collections

// Uma coleção que contém pares de objetos (chaves e valores) e suporta a recuperação eficiente
// do valor correspondente a cada chave. As chaves do mapa são exclusivas; o mapa contém apenas
// um valor para cada chave. Os métodos nesta interface suportam somente acesso somente leitura
// ao mapa; o acesso de leitura e gravação é suportado por meio da interface MutableMap

fun main() {

    val listaDoBancoDeDados = mutableMapOf<Int, String>()

    listaDoBancoDeDados.put(51, "Joao")
    listaDoBancoDeDados.put(29, "Maria")
    listaDoBancoDeDados.put(3, "Jose")

    val id = 5

    val consultaNobanco = findById(id, listaDoBancoDeDados)

    println("---------------------------------")

    if (consultaNobanco.isEmpty()) {
        println("ERROR 404, Entity not found")
    }else {
        println(consultaNobanco)
    }

}

fun findById(id: Int, lista: MutableMap<Int, String>): Map<Int, String> {

    return lista.filter {it.key == id}
}
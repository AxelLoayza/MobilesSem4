package com.loayza.axel.sem4

import kotlin.text.iterator

class AnalizadorTexto {

    fun contarVocales(texto: String) = texto.count { it in "aeiouAEIOU" }
}

fun main() {
    // busca en las palabras las vocales
    val listaPalabras = listOf("", "Hola", "Murciélago", "xyz", "AeIoU", "¡Hola Mundo!", "Programación", "Android", "Kotlin")

    println("=== CONTADOR DE VOCALES ===")
    listaPalabras.forEach { println("La palabra \"$it\" tiene ${AnalizadorTexto().contarVocales(it)} vocales") }
}
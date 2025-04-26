package com.loayza.axel.sem4

import kotlin.text.iterator

class VowelCounter {
    /**

     * @param text La cadena de texto a analizar
     * @return Número de vocales encontradas en el texto
     */
    fun countVowels(text: String): Int {
        if (text.isEmpty()) return 0

        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var count = 0

        for (character in text) {
            if (character in vowels) {
                count++
            }
        }

        return count
    }
}


fun contarVocales(texto: String): Int {
    val vocales = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var contador = 0

    for (caracter in texto) {
        if (caracter in vocales) {
            contador++
        }
    }

    return contador
}


fun main() {
    // Lista de palabras para probar
    val palabras = listOf(
        "",
        "Hola",
        "Murciélago",
        "xyz",
        "AeIoU",
        "¡Hola Mundo!",
        "Programación",
        "Android",
        "Kotlin"
    )

    println("=== CONTADOR DE VOCALES ===")

    // cada palabra mostrara su numero de vocales  co nayuda de las variables
    for (palabra in palabras) {
        val numVocales = contarVocales(palabra)
        println("La palabra \"$palabra\" tiene $numVocales vocales")
    }
}
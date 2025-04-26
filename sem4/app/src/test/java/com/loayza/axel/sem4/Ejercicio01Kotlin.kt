package com.loayza.axel.sem4
import org.junit.Test
import org.junit.Assert.*


class AnagramChecker {

    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        if (palabra1.length != palabra2.length) return false

        val palabra1 = palabra1.lowercase().toCharArray().sortedArray()
        val palabra2 = palabra2.lowercase().toCharArray().sortedArray()
        return palabra1.contentEquals(palabra2)
    }
}

fun main() {
    val checker = AnagramChecker()

    // aca se usa la variable para la lista de palabras
    val paresDePalabras = listOf(
        "listen" to "silent",
        "hello" to "world",
        "race" to "care"
    )

    println("=== VERIFICADOR DE ANAGRAMAS ===")

    // aqui la salida con un condicional que diferencia los anagramas de los NO anagramas
    for ((palabraA, palabraB) in paresDePalabras) { val esAnagrama = checker.sonAnagramas(palabraA, palabraB) ;val resultado = if (esAnagrama) "es anagrama" else "no es anagrama"
        println("\"$palabraA\" $resultado de \"$palabraB\"")
    }
}
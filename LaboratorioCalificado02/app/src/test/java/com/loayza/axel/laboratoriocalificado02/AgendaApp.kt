package com.loayza.axel.laboratoriocalificado02

data class Contacts(val nombre: String, val telefono: String, val correo: String)

class AgendaApp {
    private val contactos = mutableListOf<Contacts>()
    fun agregar(c: Contacts) = contactos.add(c).also { println("Agregado: ${c.nombre}") }
    fun listar() = if (contactos.isEmpty()) println("Agenda vacía.") else contactos.forEach(::println)
    fun buscar(nombre: String) = contactos.find { it.nombre.equals(nombre, true) }
        ?.let { println("Encontrado: $it") } ?: println("No encontrado.")
}

fun main() {
    val agenda = AgendaApp()
    while (true) {
        println("\n1. Agregar  2. Listar  3. Buscar  4. Salir")
        when (readLine()?.toIntOrNull()) {
            1 -> agenda.agregar(
                Contacts(
                    nombre = print("Nombre: ").run { readLine().orEmpty() },
                    telefono = print("Tel: ").run { readLine().orEmpty() },
                    correo = print("Email: ").run { readLine().orEmpty() }
                )
            )
            2 -> agenda.listar()
            3 -> print("Nombre a buscar: ").run { agenda.buscar(readLine().orEmpty()) }
            4 -> return
            else -> println("Opción inválida")
        }
    }
}

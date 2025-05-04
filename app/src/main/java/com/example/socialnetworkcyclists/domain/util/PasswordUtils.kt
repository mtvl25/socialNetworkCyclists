package com.example.socialnetworkcyclists.domain.util

import java.security.MessageDigest

/**
 * Funciones para hashing de contraseñas.
 */
object PasswordUtils {

    /**
     * Devuelve el hash SHA-256 de la cadena de entrada, en minúsculas hexadecimal.
     */
    fun sha256(input: String): String {
        // 1. Crea el digest para SHA-256
        val md = MessageDigest.getInstance("SHA-256")
        // 2. Alimenta el digest con los bytes UTF-8 de la contraseña
        val hashBytes = md.digest(input.toByteArray(Charsets.UTF_8))
        // 3. Convierte cada byte al par hex (“02x” con padding)
        return hashBytes.joinToString("") { byte ->
            "%02x".format(byte)
        }
    }
}
package com.example.socialnetworkcyclists.domain.util

import java.security.SecureRandom

/**
 * Generador de identificadores únicos (UUID-like) compatible con API 24+
 */
object IdGenerator {
    private val secureRandom = SecureRandom()

    fun generate(): String {
        val bytes = ByteArray(16)
        secureRandom.nextBytes(bytes)
        // Convertimos a cadena hex de 32 caracteres
        return bytes.joinToString(separator = "") { byte ->
            (byte.toInt() and 0xFF).toString(16).padStart(2, '0')
        }
    }
}
package com.example.socialnetworkcyclists.domain.model

import com.example.socialnetworkcyclists.domain.util.IdGenerator

/**
 * Representa a un amigo en el sistema.
 *
 * @param id          Identificador único de esta relación de amistad.
 * @param userId      ID del usuario propietario de esta relación.
 * @param friendId    ID del usuario amigo.
 * @param friendName  Nombre de usuario del amigo.
 * @param since       Timestamp (ms) cuando se confirmó la amistad.
 */
data class Friend(
    val id: String,
    val userId: String,
    val friendId: String,
    val friendName: String,
    val since: Long = System.currentTimeMillis()
)

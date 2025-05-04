package com.example.socialnetworkcyclists.domain.model

import com.example.socialnetworkcyclists.domain.util.IdGenerator


/**
 * Representa una solicitud de amistad de un usuario a otro.
 *
 * @param id             Identificador único de la solicitud.
 * @param fromUserId     Quien envía la solicitud.
 * @param toUserId       A quien va dirigida.
 * @param status         Estado actual de la solicitud.
 */
data class FriendRequest(
    val id: String,
    val fromUserId: String,
    val toUserId: String,
    val status: RequestStatus = RequestStatus.PENDING,
)
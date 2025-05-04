package com.example.socialnetworkcyclists.domain.repository

import com.example.socialnetworkcyclists.domain.model.Friend
import com.example.socialnetworkcyclists.domain.model.FriendRequest

interface FriendRepository{


    /* TIPOS DE SOLICITUD*/

    // --- Envía una solicitud y devuelve su ID, o null si ya existe una pendiente. ---
    fun sendFriendRequest(fromUserId: String, toUserId: String): String?

    // --- Acepta la solicitud indicada y crea la amistad; true si se procesó. ---
    fun acceptFriendRequest(requestId: String): Boolean

    // --- Rechaza (declina) la solicitud indicada; true si existía y se actualizó.---
    fun declineFriendRequest(requestId: String): Boolean


    // --- Cancela una solicitud que este usuario envió y aún está pendiente. ---
    fun cancelOutgoingRequest(requestId: String): Boolean

    // --- Solicitudes recibidas por el usuario. ---
    fun getIncomingRequests(userId: String): List<FriendRequest>

    // --- Solicitudes que el usuario ha enviado y aún no han sido respondidas. ---
    fun getOutgoingRequests(userId: String): List<FriendRequest>

    /* ────── AMISTADES ────── */


    // ---  Devuelve la lista de amigos del usuario. ---
    fun getFriends(userId: String): List<Friend>
    /**
     * Crea una amistad bidireccional. Suele llamarse internamente
     * tras `acceptFriendRequest`, pero se expone por si haces importaciones masivas.
     */
    fun addFriend(friend: Friend): Boolean
    /** Elimina la relación de amistad entre dos usuarios. */
    fun removeFriend(userId: String, friendId: String): Boolean






}
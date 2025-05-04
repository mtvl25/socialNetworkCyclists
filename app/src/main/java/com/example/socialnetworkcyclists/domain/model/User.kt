package com.example.socialnetworkcyclists.domain.model

import com.example.socialnetworkcyclists.domain.util.IdGenerator


/**
 * Entidad principal de usuario.
 * @param id                     generado automáticamente
 * @param name                   nombre de usuario
 * @param username               user unico  de usuario
 * @param passwordHash               contraseña (en producción nunca en texto plano)
 * @param age                    Edad
 * @param location               ubicación (ciudad, coordenadas…)
 * @param preferredCyclingType   tipo de ciclismo preferido
 * @param favoriteRoute          objeto con los datos de la ruta favorita
 * @param friends                lista de amigos
 * @param statistics             objeto de estadísticas, compartiendo el mismo id
 */
data class User(    //Es como una class normal pero tiene ventajas como por el ejemplo el .copy

    //Datos basicos
    val id: String?=null,
    val username: String,
    val passwordHash: String,
    val name: String,
    val age: Int,
    val location: String,

    //Preferencias
    val preferredCyclingType: CyclingType,
    val favoriteRoute: Route? = null,

    //Amigos y solicitudes
    val friends: List<Friend> = emptyList(),                   //Lista vacia por defecto
    val incomingRequests: List<FriendRequest> = emptyList(),   // Solicitudes recibidas
    val outgoingRequests: List<FriendRequest> = emptyList() ,  // Solicitudes enviadas
    val statistics: Statistics? = null,          //Al objeto Statisics se le asigna automaticamente el id correspondiente del user
){
    fun withAddedFriend(friend: Friend): User =
        copy(friends = friends + friend)
}





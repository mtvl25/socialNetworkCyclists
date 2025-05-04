package com.example.socialnetworkcyclists.data.repository

import com.example.socialnetworkcyclists.domain.model.RegistrationFormState
import com.example.socialnetworkcyclists.domain.model.User
import com.example.socialnetworkcyclists.domain.model.CyclingType
import com.example.socialnetworkcyclists.domain.model.Route
import com.example.socialnetworkcyclists.domain.repository.UserRepository
import com.example.socialnetworkcyclists.domain.util.PasswordUtils
import com.example.socialnetworkcyclists.domain.util.SearchUtils
import com.example.socialnetworkcyclists.domain.util.SortUtils

class InMemoryUserRepository:UserRepository{
    private val  users: MutableMap<String,User> = mutableMapOf()
    private var idCounter:Int = 0

    override fun createUser(form: RegistrationFormState): Boolean {

        //(1)Generamos ID y hash
        val newId = "user-${++idCounter}"
        val hash = PasswordUtils.sha256(form.password)

        // 3) Convertimos el string a enum (maneja el error si no es válido)
        val preferredCyclingType = try {
            CyclingType.valueOf(form.preferredCyclingType.uppercase())
        } catch (e: IllegalArgumentException) {
            return false
        }

        // 4) Armamos el User
        val newUser = User(
            id                    = newId,
            username              = form.username,
            passwordHash          = hash,
            name                  = form.name,
            age                   = form.age,
            location              = form.location,
            preferredCyclingType  = preferredCyclingType,

        )

        users[newId] = newUser
        return true
    }

    override fun existsUserByUsername(username: String): Boolean {
        // 1) Normalizamos la clave a minúsculas para ignorar caso
        val key = username.lowercase()

        // 2) Extraemos todas las usernames en minúsculas
        val nameList: List<String> = users.values.map { it.username.lowercase() }

        // 3) Ordenamos la lista con Merge Sort (O(n log n))
        val sortedNames: List<String> = SortUtils.mergeSort(nameList)

        // 4) Buscamos la key con Binary Search (O(log n))
        val index = SearchUtils.binarySearch(sortedNames, key)

        // 5) Si index >= 0, la username existe
        return index >= 0

    }

    override fun findUserById(userId: String): User?{
        return users[userId]
    }

    override fun findUserByName(name: String): User? {
        // 1) Normalizamos a minúsculas:
        val key = name.lowercase()

        // 2) Extraemos todos los nombres en minúsculas:
        val nameList = users.values
            .map { it.username.lowercase() }

        // 3) Ordenamos la lista (O(n log n)):
        val sortedNames = SortUtils.mergeSort(nameList)

        // 4) Buscamos la clave (O(log n)):
        val idx = SearchUtils.binarySearch(sortedNames, key)
        if (idx < 0) return null

        // 5) Si existe, devolvemos el User original cuyo nombre coincida:
        //    aquí usamos firstOrNull en O(n), pero el coste global sigue O(n log n).
        val foundName = sortedNames[idx]

        return users.values.firstOrNull {
            it.username.equals(foundName, ignoreCase = true)
        }
    }

    override fun findUsersByLocation(location: String): List<User> {
        val key = location.lowercase()                   // 1) normaliza a minúsculas
        val result = mutableListOf<User>()               // 2) lista de resultados

        // 3) búsqueda manual (no usamos `filter`)
        for (user in users.values) {
            if (user.location.lowercase() == key) {
                result.add(user)
            }
        }

        return result                                   // 4) devolvemos lo encontrado
    }


    override fun findUsersByPreferredCyclingType(cyclingType: CyclingType): List<User> {
        val result = mutableListOf<User>()
        // Recorremos todos los usuarios y recogemos los que coincidan
        for (user in users.values) {
            if (user.preferredCyclingType == cyclingType) {
                result.add(user)
            }
        }
        return result
    }

    override fun findUsersByFavoriteRoute(route: Route): List<User> {
        val result = mutableListOf<User>()
        // Recorremos todos los usuarios en el mapa
        for (user in users.values) {
            // Comprobamos que favoriteRoute no sea null antes de comparar
            val fav = user.favoriteRoute
            // Comparamos por id de la Route
            if (fav != null && fav.id == route.id) {
                result.add(user)
            }
        }
        return result
    }

    override fun getAllUsersSortedByAge(ascending: Boolean): List<User> {
        // 1) Convertimos el mapa de usuarios a lista
        val userList = users.values.toList()
        // 2) Usamos mergeSortBy pasando la clave .age
        val sorted = SortUtils.mergeSortBy(userList) { it.age }
        // 3) Si no queremos ascendente, invertimos la lista
        return if (ascending) sorted else sorted.asReversed()
    }

    override fun getAllUsersSortedByUsername(ascending: Boolean): List<User> {
        // 1) Sacamos todos los usuarios en una lista
        val userList = users.values.toList()
        // 2) Ordenamos con mergeSortBy usando .username (en minúsculas para consistencia)
        val sorted = SortUtils.mergeSortBy(userList) { it.username.lowercase() }
        // 3) Si piden descendente, invertimos; si no, devolvemos tal cual
        return if (ascending) sorted else sorted.asReversed()
    }

    override fun deleteUser(userId: String): Boolean {
        return if (users.containsKey(userId)) {
            users.remove(userId)
            true
        } else {
            false
        }
    }

}
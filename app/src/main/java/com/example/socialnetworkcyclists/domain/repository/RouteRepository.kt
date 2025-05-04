package com.example.socialnetworkcyclists.domain.repository

import com.example.socialnetworkcyclists.domain.model.Route

/**
 * Contrato de la capa de dominio para gestionar rutas.
 * No contiene detalles de infraestructura; las implementaciones
 * concretas vivirán en data/repository (Room, Retrofit, etc.).
 */
interface RouteRepository {

    /* ──────── CREATE ──────── */

    /** Crea una nueva ruta. */
    fun createRoute(route: Route)

    /* ──────── READ ──────── */

    /** Obtiene una ruta por su ID o null si no existe. */
    fun getRouteById(routeId: String): Route?

    /** Devuelve todas las rutas ordenadas alfabéticamente. */
    fun getAllRoutesSortedByName(ascending: Boolean = true): List<Route>

    /** Busca rutas cuyo nombre contenga el texto proporcionado. */
    fun findRoutesByName(nameQuery: String): List<Route>

    /** Devuelve todas las rutas de una determinada ubicación/ciudad. */
    fun findRoutesByLocation(location: String): List<Route>

    /** Devuelve las rutas cuya longitud está dentro del rango [minKm, maxKm]. */
    fun findRoutesByDistance(minKm: Double, maxKm: Double): List<Route>


    /* ──────── UPDATE ──────── */

    /** Actualiza todos los campos de la ruta indicada (mismo id).  */
    fun updateRoute(route: Route): Boolean

    /* ──────── DELETE ──────── */
    /** Elimina la ruta con el ID indicado. */
    fun deleteRoute(routeId: String): Boolean
}

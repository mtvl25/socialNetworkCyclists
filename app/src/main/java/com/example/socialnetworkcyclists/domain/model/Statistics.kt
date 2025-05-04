package com.example.socialnetworkcyclists.domain.model



/**
 * Estadísticas globales de un usuario.
 *
 * @param id                Identificador único (igual al del usuario).
 * @param totalDistanceKm   Distancia total recorrida en kilómetros.
 * @param totalTimeHours    Tiempo total dedicado al ciclismo en horas.
 * @param ftp               Functional Threshold Power (umbral funcional de potencia).
 * // Añade aquí más métricas según lo necesites.
 */
data class Statistics(
    val id: String,
    val totalDistanceKm: Double = 0.0,
    val totalTimeHours: Double = 0.0,
    val ftp: Int = 0
    // …otras estadísticas opcionales
)
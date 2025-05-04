package com.example.socialnetworkcyclists.domain.repository

import com.example.socialnetworkcyclists.domain.model.Statistics

/**
 * Contrato de la capa de dominio para gestionar las estadísticas
 * acumulativas de un usuario ciclista.
 *
 * Cada registro Statistics comparte el mismo id que el User
 * correspondiente (1‑a‑1).
 */
interface StatisticsRepository {

    /* ─────────── CREATE ─────────── */

    /**
     * Crea un nuevo registro de estadísticas para un usuario.
     * Normalmente se invoca inmediatamente después de registrar al User.
     */
    fun createStatistics(statistics: Statistics)

    /* ─────────── READ ─────────── */

    /** Obtiene las estadísticas de un usuario por su id, o null si no existen. */
    fun getStatisticsByUserId(userId: String): Statistics?

    /** Devuelve un listado paginado u ordenado de los líderes por distancia total. */
    fun getTopUsersByDistance(limit: Int = 10): List<Statistics>

    /** Devuelve a los líderes por tiempo total sobre la bicicleta. */
    fun getTopUsersByTime(limit: Int = 10): List<Statistics>

    /** Devuelve a los líderes por FTP (Functional Threshold Power). */
    fun getTopUsersByFtp(limit: Int = 10): List<Statistics>

    /* ─────────── UPDATE ─────────── */

    /**
     * Sustituye por completo el objeto Statistics.
     * Úsalo si recalculas varias métricas de una vez.
     */
    fun updateStatistics(statistics: Statistics): Boolean

    /**
     * Incrementa la distancia total y el tiempo total acumulados.
     *
     * @param userId            id del usuario
     * @param distanceToAddKm   kilómetros a sumar
     * @param timeToAddHours    horas a sumar
     * @return true si el usuario existía y se actualizó
     */
    fun addSessionTotals(
        userId: String,
        distanceToAddKm: Double,
        timeToAddHours: Double
    ): Boolean

    /**
     * Actualiza solo el FTP del usuario.
     * @return true si se encontró y se modificó el registro
     */
    fun updateFtp(userId: String, newFtp: Int): Boolean

    /* ─────────── DELETE ─────────── */

    /** Elimina definitivamente el registro de estadísticas de un usuario. */
    fun deleteStatistics(userId: String): Boolean
}

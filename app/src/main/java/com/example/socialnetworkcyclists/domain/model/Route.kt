package com.example.socialnetworkcyclists.domain.model




/**
 * Representa una ruta ciclística dentro de la aplicación.
 *
 * @param id           Identificador único (autogenerado).
 * @param name         Nombre legible de la ruta (p. ej. "Ruta del Embalse").
 * @param terrainType  Tipo de terreno (p. ej. "asfalto", "sendero", "grava").
 * @param distanceKm   Distancia en kilómetros.
 * @param difficulty   Nivel de dificultad (FÁCIL, MEDIO, DIFÍCIL).
 */
data class Route(
    val id: String,
    val name: String,
    val terrainType: TerrainType,  //enum
    val distanceKm: Double,
    val difficulty: DifficultyLevel,  //enum
    val location: String,
)
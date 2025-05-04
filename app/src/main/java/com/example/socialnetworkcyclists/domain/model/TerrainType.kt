package com.example.socialnetworkcyclists.domain.model

/**
 * Enum que define los tipos de terreno permitidos para una ruta,
 * evitando valores arbitrarios o mal tipeados.
 */


enum class TerrainType {
    ASPHALT,      // Asfalto liso y pavimentado
    TRAIL,        // Sendero de tierra o bosque
    GRAVEL,       // Camino de grava
    DIRT,         // Camino de tierra compactada
    SAND,         // Terreno arenoso
    COBBLESTONE,  // Adoquín o empedrado
    URBAN,        // Áreas urbanas o pavimento mixto
    MIXED         // Combinación de distintos tipos
}
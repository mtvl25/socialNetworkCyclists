package com.example.socialnetworkcyclists.domain.model

/** Tipos de ciclismo posibles */
enum class CyclingType {  // enum Permite definir un tipo con un conjunto limitado de valores constantes,
    ROAD,                  //No hay valores inesperados y CylingType.x  y hay 5 opciones no mas.
    MOUNTAIN,
    BMX,
    GRAVEL,
    COMMUTER
}
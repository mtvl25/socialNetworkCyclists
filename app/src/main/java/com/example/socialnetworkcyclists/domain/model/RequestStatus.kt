package com.example.socialnetworkcyclists.domain.model

enum class RequestStatus {
    PENDING,    // Esperando aceptación
    ACCEPTED,   // Aceptada por el destinatario
    DECLINED    // Rechazada por el destinatario
}
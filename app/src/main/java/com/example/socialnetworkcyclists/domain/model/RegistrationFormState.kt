package com.example.socialnetworkcyclists.domain.model

data class RegistrationFormState (
    //Datos basicos
    val username: String,
    val password: String,
    val name: String,
    val age: Int,
    val location: String,
    val preferredCyclingType:String,
    )
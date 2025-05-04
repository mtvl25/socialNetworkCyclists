package com.example.socialnetworkcyclists.data.local.mapper_R
import com.example.socialnetworkcyclists.data.dto.SignupRequest
import com.example.socialnetworkcyclists.domain.model.CyclingType
import com.example.socialnetworkcyclists.domain.model.User



//MAPPER QUE CONVIERTE EL DTO AL FORMATO A UN OBJETO NORMAL PROCESABLE
fun SignupRequest.toDomainUser(
    id: String,
    passwordHash:String,
):User{
    return User(
        id                   = id,
        username             = username,
        passwordHash         = passwordHash,
        name                 = name,
        age                  = age,
        location             = location,
        preferredCyclingType = CyclingType.valueOf(preferredCyclingType),
    )
}
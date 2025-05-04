package com.example.socialnetworkcyclists.domain.usecase

import com.example.socialnetworkcyclists.domain.model.RegistrationFormState
import com.example.socialnetworkcyclists.domain.repository.UserRepository

class  RegisterUserUseCase(private val userRepository: UserRepository){
    operator fun invoke(form: RegistrationFormState): Boolean {
        // 1. (Opcional) Lógica de validación de negocio antes de registrar
        if (form.password.isBlank() || form.username.isBlank()) {
            // Podríamos lanzar una excepción o retornar false indicando error
            return false
        }
        // 2. Comprobar si el usuario ya existe (según las reglas de negocio,
        // por ejemplo, quizás no se permiten dos usuarios con el mismo email)
        val alreadyExists = userRepository.existsUserByUsername(form.username)
        if (alreadyExists) {
            return false  // Ya existe un usuario con ese ID (regla de negocio)
        }


        userRepository.createUser(form)

        // 3. Delegar la operación de registro al repositorio
        return true
    }
}

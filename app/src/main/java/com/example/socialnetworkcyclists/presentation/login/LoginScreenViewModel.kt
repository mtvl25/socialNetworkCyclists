package com.example.socialnetworkcyclists.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class LoginScreenViewModel: ViewModel() {

    //Almacenamientos de estados de la ui
    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var isloading by mutableStateOf(false)
        private set
    var errorMessage by mutableStateOf<String?>(null)
        private set


    //Eventos De usuario
    fun onEmailchange(newEmail:String){
            email=newEmail
            errorMessage=null
    }


    fun onPaswordChange(newPassword:String){
        password=newPassword
        errorMessage=null
    }

    //Logica de negocio

    //Funcion login que le pasamos por parametro onSuccess el cual va a ser una funcion que no devuelve nada, la cual se va a ejecutar cuando el login sea valido
    fun login(onSuccess:()-> Unit){
        if(email.isBlank() || password.isBlank()){
            errorMessage="Por favor ingrese correo y contraseña"
        }

        viewModelScope.launch{
            isloading=true
            errorMessage=null
            //Intenta validar las credenciales y si no hay exception se llama a la funcion pasada por parametro
            try{
               // validateCredentials(email, password)
                onSuccess()

            }
            //Manejo de exception 1
            catch (e: Exception){

            }finally {
                isloading=false
            }
        }

    }



    /*
    fun login(onSuccess: () -> Unit) {
        // Validaciones básicas
        if (email.isBlank() || password.isBlank()) {
            errorMessage = "Por favor ingresa correo y contraseña."
            return
        }

        viewModelScope.launch {
            isLoading = true
            errorMessage = null

            try {
                // TODO: reemplaza este delay con tu llamada real al repositorio:
                delay(1500)

                // Supongamos que la autenticación fue exitosa:
                onSuccess()
            } catch (e: Exception) {
                // Captura errores de red, validación, etc.
                errorMessage = "Error al iniciar sesión: ${e.localizedMessage}"
            } finally {
                isLoading = false
            }
        }
    }


     */

}
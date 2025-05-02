package com.example.socialnetworkcyclists.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel(){
    private val _email = MutableLiveData("")
    val email : LiveData<String> = _email







    fun onEmailChanged(newEmail: String) {
        _email.value = newEmail
        // Si usaras State: email = newEmail
    }
}
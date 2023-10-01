package com.example.ecoearn.data

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
class LoginViewModel : ViewModel() {
    var registrationUIState = mutableStateOf(RegistrationUIState())

    fun onEvent(event:UIEvent){
        when(event){
            is UIEvent.FullNameChanged -> {
                registrationUIState.value.fullName = event.fullName
            }
            is UIEvent.EmailChanged -> {
                registrationUIState.value.email = event.email
            }
            is UIEvent.PasswordChanged -> {
                registrationUIState.value.password = event.password
            }
            is UIEvent.ContactNumberChanged -> {
                registrationUIState.value.contactNumber = event.contactNumber
            }
            is UIEvent.CurrentLocationChanged -> {
                registrationUIState.value.currentLocation = event.currentLocation
            }
        }
    }
}
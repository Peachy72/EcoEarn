package com.example.ecoearn.data

sealed class UIEvent {
    data class FullNameChanged(val fullName: String) : UIEvent()
    data class EmailChanged(val email: String) : UIEvent()
    data class PasswordChanged(val password: String) : UIEvent()
    data class ContactNumberChanged(val contactNumber: String) : UIEvent()
    data class CurrentLocationChanged(val currentLocation: String) : UIEvent()
}
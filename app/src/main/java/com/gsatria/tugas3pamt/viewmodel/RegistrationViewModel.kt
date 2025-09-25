package com.gsatria.tugas3pamt.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class RegistrationViewModel : ViewModel() {
    var nim = mutableStateOf("")
    var nama = mutableStateOf("")
    var email = mutableStateOf("")
    var alamat = mutableStateOf("")
    var isRegistered = mutableStateOf(false)

    fun register() {
        if (nim.value.isNotBlank() && nama.value.isNotBlank() && email.value.isNotBlank()) {
            isRegistered.value = true
        } else {
            isRegistered.value = false
        }
    }

    fun reset() {
        nim.value = ""
        nama.value = ""
        email.value = ""
        alamat.value = ""
        isRegistered.value = false
    }
}
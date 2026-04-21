package cst.unitbvfmi2026.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class LoginState {
    var email by mutableStateOf("")
    var password by mutableStateOf("")
}

package com.example.my_application.application.horce_racing

import java.time.LocalDate

data class RegisterRacehorseCommand(
    val name: String,
    val dateOfBirth: LocalDate,
)

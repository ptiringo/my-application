package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.Country
import java.time.LocalDate

data class RegisterAsProCommand(
    val firstName: String,
    val familyName: String,
    val dateOfBirth: LocalDate,
    val country: Country
)

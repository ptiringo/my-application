package com.example.my_application.application.sakamichi

import java.time.LocalDate

data class NewMember(
    val firstName: String,
    val familyName: String,
    val firstNameKana: String,
    val familyNameKana: String,
    val dateOfBirth: LocalDate,
)

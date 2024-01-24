package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.Country

data class RegisterRacecourseCommand(
    val name: String,
    val country: Country
)

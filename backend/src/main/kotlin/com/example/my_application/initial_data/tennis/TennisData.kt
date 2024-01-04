package com.example.my_application.initial_data.tennis

import com.example.my_application.application.tennis.RegisterAsProCommand
import com.example.my_application.domain.tennis.Country
import java.time.LocalDate

val RAFAEL_NADAL = RegisterAsProCommand(
    firstName = "Rafael",
    familyName = "Nadal",
    dateOfBirth = LocalDate.of(1986, 6, 3),
    country = Country.Spain
)

val NOVAK_DJOKOVIC = RegisterAsProCommand(
    firstName = "Novak",
    familyName = "Djokovic",
    dateOfBirth = LocalDate.of(1987, 5, 22),
    country = Country.Serbia
)

val DANIIL_MEDVEDEV = RegisterAsProCommand(
    firstName = "Daniil",
    familyName = "Medvedev",
    dateOfBirth = LocalDate.of(1996, 2, 11),
    country = Country.Russia
)

val KEI_NISHIKORI = RegisterAsProCommand(
    firstName = "圭",
    familyName = "錦織",
    dateOfBirth = LocalDate.of(1989, 12, 29),
    country = Country.Japan
)

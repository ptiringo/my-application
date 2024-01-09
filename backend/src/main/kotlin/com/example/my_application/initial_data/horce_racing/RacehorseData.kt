package com.example.my_application.initial_data.horce_racing

import com.example.my_application.application.horce_racing.RegisterRacehorseCommand
import java.time.LocalDate

val KITASAN_BLACK = RegisterRacehorseCommand(
    name = "キタサンブラック",
    dateOfBirth = LocalDate.of(2012, 3, 10)
)

val FIRST_FORCE = RegisterRacehorseCommand(
    name = "ファストフォース",
    dateOfBirth = LocalDate.of(2016, 5, 9)
)

val MELODY_LANE = RegisterRacehorseCommand(
    name = "メロディーレーン",
    dateOfBirth = LocalDate.of(2016, 2, 12)
)

val EQUINOX = RegisterRacehorseCommand(
    name = "イクイノックス",
    dateOfBirth = LocalDate.of(2019, 3, 23)
)

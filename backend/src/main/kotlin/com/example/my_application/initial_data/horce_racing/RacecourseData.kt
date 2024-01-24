package com.example.my_application.initial_data.horce_racing

import com.example.my_application.application.horce_racing.RegisterRacecourseCommand
import com.example.my_application.domain.horse_racing.Country

val MEYDAN = RegisterRacecourseCommand(
    name = "メイダン",
    country = Country.UnitedArabEmirates
)

val RANDWICK = RegisterRacecourseCommand(
    name = "ランドウィック",
    country = Country.Australia
)

val SAPPORO = RegisterRacecourseCommand(
    name = "札幌",
    country = Country.Japan
)

val TOKYO = RegisterRacecourseCommand(
    name = "東京",
    country = Country.Japan
)

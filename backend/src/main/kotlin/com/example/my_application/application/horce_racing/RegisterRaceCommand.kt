package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.TrackSurface
import com.example.my_application.domain.horse_racing.race.Grade

data class RegisterRaceCommand(
    val name: String,
    val grade: Grade,
    val truckSurface: TrackSurface,
    val distance: Int,
    val racecourseId: Long,
)

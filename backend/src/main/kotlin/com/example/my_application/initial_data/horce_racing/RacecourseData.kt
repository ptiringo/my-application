package com.example.my_application.initial_data.horce_racing

import com.example.my_application.application.horce_racing.RegisterRaceCommand
import com.example.my_application.domain.horse_racing.TrackSurface
import com.example.my_application.domain.horse_racing.race.Grade

val DUBAI_SHEEMA_CLASSIC = { racecourseId: Long ->
    RegisterRaceCommand(
        name = "ドバイシーマクラシック",
        grade = Grade.G1,
        truckSurface = TrackSurface.TURF,
        distance = 2410,
        racecourseId = racecourseId,
    )
}

val ALL_AGED_STAKES = { racecourseId: Long ->
    RegisterRaceCommand(
        name = "オールエイジドステークス",
        grade = Grade.G1,
        truckSurface = TrackSurface.TURF,
        distance = 1400,
        racecourseId = racecourseId,
    )
}
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

val JAPAN_CUP = { racecourseId: Long ->
    RegisterRaceCommand(
        name = "ジャパンカップ",
        grade = Grade.G1,
        truckSurface = TrackSurface.TURF,
        distance = 2400,
        racecourseId = racecourseId,
    )
}

val KYOTO_KINEN = { racecourseId: Long ->
    RegisterRaceCommand(
        name = "京都記念",
        grade = Grade.G2,
        truckSurface = TrackSurface.TURF,
        distance = 2200,
        racecourseId = racecourseId,
    )
}

val SAUDI_CUP = { racecourseId: Long ->
    RegisterRaceCommand(
        name = "サウジカップ",
        grade = Grade.G1,
        truckSurface = TrackSurface.DIRT,
        distance = 1800,
        racecourseId = racecourseId,
    )
}

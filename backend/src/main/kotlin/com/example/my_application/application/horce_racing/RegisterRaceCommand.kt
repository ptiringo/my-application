package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.TrackSurface
import com.example.my_application.domain.horse_racing.race.Grade

/** レース登録コマンド */
data class RegisterRaceCommand(
    /** レース名 */
    val name: String,

    /** グレード */
    val grade: Grade,

    /** 馬場（表面素材） */
    val truckSurface: TrackSurface,

    /** 距離 */
    val distance: Int,

    /** 開催競馬場ID */
    val racecourseId: Long,
)

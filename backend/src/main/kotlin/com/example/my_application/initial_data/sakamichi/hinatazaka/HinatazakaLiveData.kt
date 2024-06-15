package com.example.my_application.initial_data.sakamichi.hinatazaka

import com.example.my_application.application.sakamichi.HoldLiveCommand
import com.example.my_application.application.sakamichi.HoldLiveScheduleInfo
import java.time.LocalDate
import java.time.LocalTime

val HINATA_FES_2024 = { groupId: Long ->
    HoldLiveCommand(
        groupId = groupId,
        title = "ひなたフェス2024",
        schedules = listOf(
            HoldLiveScheduleInfo(
                date = LocalDate.of(2024, 9, 7),
                venue = setOf("ひなた宮崎県総合運動公園", "ひなたサンマリンスタジアム宮崎"),
                openAt = LocalTime.of(15, 0),
                startAt = LocalTime.of(17, 0)
            ),
            HoldLiveScheduleInfo(
                date = LocalDate.of(2024, 9, 8),
                venue = setOf("ひなた宮崎県総合運動公園", "ひなたサンマリンスタジアム宮崎"),
                openAt = LocalTime.of(15, 0),
                startAt = LocalTime.of(17, 0)
            ),
        )
    )
}

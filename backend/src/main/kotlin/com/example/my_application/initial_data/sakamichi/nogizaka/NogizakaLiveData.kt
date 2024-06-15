package com.example.my_application.initial_data.sakamichi.nogizaka

import com.example.my_application.application.sakamichi.HoldLiveCommand
import com.example.my_application.application.sakamichi.HoldLiveScheduleInfo
import java.time.LocalDate
import java.time.LocalTime

val UNDER_LIVE_35TH_SINGLE = { groupId: Long ->
    HoldLiveCommand(
        groupId = groupId,
        title = "35thSGアンダーライブ",
        schedules = listOf(
            HoldLiveScheduleInfo(
                date = LocalDate.of(2024, 6, 7),
                venue = setOf("有明アリーナ"),
                openAt = LocalTime.of(17, 0),
                startAt = LocalTime.of(18, 30)
            ),
            HoldLiveScheduleInfo(
                date = LocalDate.of(2024, 6, 8),
                venue = setOf("有明アリーナ"),
                openAt = LocalTime.of(16, 0),
                startAt = LocalTime.of(17, 30)
            ),
            HoldLiveScheduleInfo(
                date = LocalDate.of(2024, 6, 9),
                venue = setOf("有明アリーナ"),
                openAt = LocalTime.of(16, 0),
                startAt = LocalTime.of(17, 30)
            ),
        )
    )
}

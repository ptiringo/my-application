package com.example.my_application.initial_data.sakamichi.sakurazaka

import com.example.my_application.application.sakamichi.HoldLiveCommand
import com.example.my_application.application.sakamichi.HoldLiveScheduleInfo
import java.time.LocalDate
import java.time.LocalTime


// ライブ
val FOURTH_ARENA_TOUR_2024 = { groupId: Long ->
    HoldLiveCommand(
        groupId = groupId,
        title = "4th ARENA TOUR 2024 新・櫻前線 -Go on back?- IN 東京ドーム",
        schedules = listOf(
            HoldLiveScheduleInfo(
                date = LocalDate.of(2024, 6, 15),
                venue = setOf("東京ドーム"),
                openAt = LocalTime.of(15, 30),
                startAt = LocalTime.of(18, 0)
            ),
            HoldLiveScheduleInfo(
                date = LocalDate.of(2024, 6, 16),
                venue = setOf("東京ドーム"),
                openAt = LocalTime.of(15, 30),
                startAt = LocalTime.of(18, 0)
            ),
        )
    )
}

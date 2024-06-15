package com.example.my_application.initial_data.sakamichi.hinatazaka

import com.example.my_application.application.sakamichi.ReleaseNewSingleCommand
import java.time.LocalDate

val ONE_CHOICE = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 9,
        title = "One Choice",
        releaseDate = LocalDate.of(2023, 4, 19)
    )
}
val KIMIWA_HONEYDEW = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 11,
        title = "君はハニーデュー",
        releaseDate = LocalDate.of(2024, 5, 8)
    )
}

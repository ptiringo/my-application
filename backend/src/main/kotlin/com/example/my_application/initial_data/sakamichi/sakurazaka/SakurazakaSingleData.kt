package com.example.my_application.initial_data.sakamichi.sakurazaka

import com.example.my_application.application.sakamichi.ReleaseNewSingleCommand
import java.time.LocalDate

// シングルリリース
val SILENT_MAJORITY = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 1,
        title = "サイレントマジョリティー",
        releaseDate = LocalDate.of(2016, 4, 6)
    )
}
val START_OVER = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 6,
        title = "Start over!",
        releaseDate = LocalDate.of(2023, 6, 28)
    )
}
val SHOUNIN_YOKKYU = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 7,
        title = "承認欲求",
        releaseDate = LocalDate.of(2023, 10, 18)
    )
}
val IKUTSU_NO_KORONI_MODORITAINOKA = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 8,
        title = "何歳の頃に戻りたいのか",
        releaseDate = LocalDate.of(2024, 2, 21)
    )
}
val JIGOUJITOKU = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 9,
        title = "自業自得",
        releaseDate = LocalDate.of(2024, 6, 26)
    )
}

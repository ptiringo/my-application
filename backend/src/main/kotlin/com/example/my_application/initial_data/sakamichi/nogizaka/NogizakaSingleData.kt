package com.example.my_application.initial_data.sakamichi.nogizaka

import com.example.my_application.application.sakamichi.ReleaseNewSingleCommand
import java.time.LocalDate

val BARRETTA = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 7,
        title = "バレッタ",
        releaseDate = LocalDate.of(2013, 11, 27)
    )
}
val SING_OUT = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 23,
        title = "Sing Out!",
        releaseDate = LocalDate.of(2019, 5, 29)
    )
}

/** しあわせの保護色 */
val SHIAWASE_NO_HOGOSHOKU = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 25,
        title = "しあわせの保護色",
        releaseDate = LocalDate.of(2020, 3, 25)
    )
}

/** Monopoly **/
val MONOPOLY = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 35,
        title = "Monopoly",
        releaseDate = LocalDate.of(2023, 12, 6)
    )
}

/** チャンスは平等 **/
val CHANCE_HA_BYOUDOU = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 35,
        title = "チャンスは平等",
        releaseDate = LocalDate.of(2024, 4, 10)
    )
}

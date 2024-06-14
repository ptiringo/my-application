package com.example.my_application.application.tennis

import java.time.LocalDate

/** トーナメント開催コマンド */
data class HoldTournamentCommand(
    /** トーナメントID */
    val tournamentId: Long,

    /** 開始日 */
    val startDate: LocalDate,

    /** 終了日 */
    val endDate: LocalDate,
)

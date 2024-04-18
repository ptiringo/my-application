package com.example.my_application.application.tennis

import java.time.LocalDate

data class HoldTournamentCommand(
    val tournamentId: Long,
    val startDate: LocalDate,
    val endDate: LocalDate,
)

package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.TennisSurface
import com.example.my_application.domain.tennis.TournamentCategory

data class RegisterTournamentCommand(
    val name: String,
    val location: String,
    val tournamentCategory: TournamentCategory,
    val tennisSurface: TennisSurface,
)

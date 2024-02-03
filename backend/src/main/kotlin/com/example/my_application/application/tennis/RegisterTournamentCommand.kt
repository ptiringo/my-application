package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.tournament.TennisSurface
import com.example.my_application.domain.tennis.tournament.TournamentCategory

data class RegisterTournamentCommand(
    val name: String,
    val location: String,
    val tournamentCategory: TournamentCategory,
    val tennisSurface: TennisSurface,
)

package com.example.my_application.initial_data.tennis

import com.example.my_application.application.tennis.RegisterTournamentCommand
import com.example.my_application.domain.tennis.tournament.TennisSurface
import com.example.my_application.domain.tennis.tournament.TournamentCategory

val MONTE_CARLO = RegisterTournamentCommand(
    name = "Monte-Carlo Masters",
    location = "Monte-Carlo",
    tournamentCategory = TournamentCategory.ATP_TOUR_MASTERS_1000,
    tennisSurface = TennisSurface.CLAY
)

val AUSTRALIAN_OPEN = RegisterTournamentCommand(
    name = "Australian Open",
    location = "Melbourne",
    tournamentCategory = TournamentCategory.GRAND_SLAM,
    tennisSurface = TennisSurface.HARD
)

val BNP_PARIBAS_OPEN = RegisterTournamentCommand(
    name = "BNP Paribas Open",
    location = "Indian Wells",
    tournamentCategory = TournamentCategory.ATP_TOUR_MASTERS_1000,
    tennisSurface = TennisSurface.HARD
)

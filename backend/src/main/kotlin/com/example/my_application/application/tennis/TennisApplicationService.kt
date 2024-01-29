package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.Tournament
import com.example.my_application.domain.tennis.player.Player
import com.example.my_application.infrastructure.tennis.PlayerRepository
import com.example.my_application.infrastructure.tennis.TournamentRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@Transactional
@ApplicationScoped
class TennisApplicationService {

    @Inject
    lateinit var playerRepository: PlayerRepository

    @Inject
    lateinit var tournamentRepository: TournamentRepository

    fun registerAsPro(command: RegisterAsProCommand): Player {
        val player = Player(
            firstName = command.firstName,
            familyName = command.familyName,
            dateOfBirth = command.dateOfBirth,
            country = command.country
        )
        playerRepository.persist(player)
        return player
    }

    fun registerTournament(command: RegisterTournamentCommand): Tournament {
        val tournament = Tournament(
            name = command.name,
            location = command.location,
            tournamentCategory = command.tournamentCategory,
            tennisSurface = command.tennisSurface
        )
        tournamentRepository.persist(tournament)
        return tournament
    }
}

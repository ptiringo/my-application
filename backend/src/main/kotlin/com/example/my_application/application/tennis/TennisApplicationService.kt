package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.held_tournament.HeldTournament
import com.example.my_application.domain.tennis.player.Player
import com.example.my_application.domain.tennis.tournament.Tournament
import com.example.my_application.infrastructure.tennis.HeldTournamentRepository
import com.example.my_application.infrastructure.tennis.PlayerRepository
import com.example.my_application.infrastructure.tennis.TournamentRepository
import javax.enterprise.context.ApplicationScoped
import javax.transaction.Transactional

@Transactional
@ApplicationScoped
class TennisApplicationService(
    private val playerRepository: PlayerRepository,
    private val tournamentRepository: TournamentRepository,
    private val heldTournamentRepository: HeldTournamentRepository
) {
    fun registerAsPro(command: RegisterAsProCommand): Player {
        val player = Player(
            firstName = command.firstName,
            familyName = command.familyName,
            dateOfBirth = command.dateOfBirth,
            country = command.country,
            dominantHand = command.dominantHand,
            backhandStyle = command.backhandStyle
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

    fun holdTournament(command: HoldTournamentCommand): HeldTournament {
        val tournament = tournamentRepository.findById(command.tournamentId)
            ?: throw IllegalArgumentException("Tournament not found")
        val heldTournament = HeldTournament(
            tournament = tournament,
            startDate = command.startDate,
            endDate = command.endDate
        )
        heldTournamentRepository.persist(heldTournament)
        return heldTournament
    }
}

package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.player.Player
import com.example.my_application.infrastructure.tennis.PlayerRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class TennisApplicationService {

    @Inject
    lateinit var playerRepository: PlayerRepository

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
}

package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.Jockey
import com.example.my_application.domain.horse_racing.Name
import com.example.my_application.domain.horse_racing.racehorse.Racehorse
import com.example.my_application.domain.horse_racing.trainer.Trainer
import com.example.my_application.infrastructure.horse_racing.JockeyRepository
import com.example.my_application.infrastructure.horse_racing.RacehorseRepository
import com.example.my_application.infrastructure.horse_racing.trainer.TrainerRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class HorseRacingApplicationService {

    @Inject
    lateinit var racehorseRepository: RacehorseRepository

    @Inject
    lateinit var jockeyRepository: JockeyRepository

    @Inject
    lateinit var trainerRepository: TrainerRepository

    @Transactional
    fun registerRacehorse(command: RegisterRacehorseCommand): Racehorse {
        val racehorse = Racehorse(
            name = command.name,
            dateOfBirth = command.dateOfBirth
        )
        racehorseRepository.persist(racehorse)
        return racehorse
    }

    @Transactional
    fun registerJockey(command: RegisterJockeyCommand): Jockey {
        val jockey = Jockey(
            name = Name(
                firstNameKana = command.firstNameKana,
                familyNameKana = command.familyNameKana,
                firstNameKanji = command.firstNameKanji,
                familyNameKanji = command.familyNameKanji,
                firstNameAlphabet = command.firstNameAlphabet,
                familyNameAlphabet = command.familyNameAlphabet,
            )
        )
        jockeyRepository.persist(jockey)
        return jockey
    }

    @Transactional
    fun registerTrainer(trainer: Trainer) {
        trainerRepository.persist(trainer)
    }
}

package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.horse.Horse
import com.example.my_application.domain.horse_racing.horse.Racehorse
import com.example.my_application.domain.horse_racing.jockey.Jockey
import com.example.my_application.domain.horse_racing.jockey.Name
import com.example.my_application.domain.horse_racing.trainer.Trainer
import com.example.my_application.infrastructure.horse_racing.HorseRepository
import com.example.my_application.infrastructure.horse_racing.JockeyRepository
import com.example.my_application.infrastructure.horse_racing.trainer.TrainerRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class HorseRacingApplicationService {

    @Inject
    lateinit var horseRepository: HorseRepository

    @Inject
    lateinit var jockeyRepository: JockeyRepository

    @Inject
    lateinit var trainerRepository: TrainerRepository

    @Transactional
    fun registerRacehorse(command: RegisterRacehorseCommand): Horse {
        val horse = Horse(
            name = command.name,
            dateOfBirth = command.dateOfBirth
        )
        Racehorse(horse)
        horseRepository.persist(horse)
        return horse
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

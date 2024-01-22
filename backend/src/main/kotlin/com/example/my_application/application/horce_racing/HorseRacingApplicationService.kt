package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.horce_owner.HorseOwner
import com.example.my_application.domain.horse_racing.horse.Horse
import com.example.my_application.domain.horse_racing.horse.Racehorse
import com.example.my_application.domain.horse_racing.jockey.Jockey
import com.example.my_application.domain.horse_racing.jockey.Name
import com.example.my_application.domain.horse_racing.race.Race
import com.example.my_application.domain.horse_racing.trainer.Trainer
import com.example.my_application.infrastructure.horse_racing.*
import com.example.my_application.infrastructure.horse_racing.trainer.TrainerRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class HorseRacingApplicationService {

    @Inject
    private lateinit var horseRepository: HorseRepository

    @Inject
    private lateinit var jockeyRepository: JockeyRepository

    @Inject
    private lateinit var trainerRepository: TrainerRepository

    @Inject
    private lateinit var horseOwnerRepository: HorseOwnerRepository

    @Inject
    private lateinit var raceRepository: RaceRepository

    @Inject
    private lateinit var racecourseRepository: RacecourseRepository

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

    @Transactional
    fun registerHorseOwner(command: RegisterHorseOwnerCommand): HorseOwner {
        val horseOwner = HorseOwner(name = command.name)
        horseOwnerRepository.persist(horseOwner)
        return horseOwner
    }

    @Transactional
    fun registerRace(command: RegisterRaceCommand): Race {
        val racecourse = racecourseRepository.findById(command.racecourseId)!!
        val race = Race(
            name = command.name,
            grade = command.grade,
            racecourse = racecourse,
            trackSurface = command.truckSurface,
            distance = command.distance,
        )
        raceRepository.persist(race)
        return race
    }
}

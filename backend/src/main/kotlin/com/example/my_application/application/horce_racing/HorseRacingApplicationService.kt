package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.horce_owner.HorseOwner
import com.example.my_application.domain.horse_racing.horse.Horse
import com.example.my_application.domain.horse_racing.horse.Racehorse
import com.example.my_application.domain.horse_racing.jockey.Jockey
import com.example.my_application.domain.horse_racing.jockey.Name
import com.example.my_application.domain.horse_racing.race.Race
import com.example.my_application.domain.horse_racing.racecourse.Racecourse
import com.example.my_application.domain.horse_racing.trainer.Trainer
import com.example.my_application.infrastructure.horse_racing.*
import com.example.my_application.infrastructure.horse_racing.trainer.TrainerRepository
import javax.enterprise.context.ApplicationScoped
import javax.transaction.Transactional

/** 競馬アプリケーションサービス */
@ApplicationScoped
class HorseRacingApplicationService(
    private val horseRepository: HorseRepository,
    private val jockeyRepository: JockeyRepository,
    private val trainerRepository: TrainerRepository,
    private val horseOwnerRepository: HorseOwnerRepository,
    private val raceRepository: RaceRepository,
    private val racecourseRepository: RacecourseRepository
) {
    /** 競走馬登録 */
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

    /** 騎手登録 */
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

    /** 調教師登録 */
    @Transactional
    fun registerTrainer(command: RegisterTrainerCommand): Trainer {
        val trainer = Trainer(
            firstName = command.firstName,
            familyName = command.familyName,
        )
        trainerRepository.persist(trainer)
        return trainer
    }

    /** 馬主登録 */
    @Transactional
    fun registerHorseOwner(command: RegisterHorseOwnerCommand): HorseOwner {
        val horseOwner = HorseOwner(name = command.name)
        horseOwnerRepository.persist(horseOwner)
        return horseOwner
    }

    /** 競馬場登録 */
    @Transactional
    fun registerRacecourse(command: RegisterRacecourseCommand): Racecourse {
        val racecourse = Racecourse(
            name = command.name,
            country = command.country,
        )
        racecourseRepository.persist(racecourse)
        return racecourse
    }

    /** 競走登録 */
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

    /** 顕彰馬として選出 */
    @Transactional
    fun selectAsKenshoba(horseId: Long, selectedYear: Int) {
        val horse = horseRepository.findById(horseId)!!
        horse.selectedAsKenshoba(selectedYear)
    }
}

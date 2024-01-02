package com.example.my_application

import com.example.my_application.application.horce_racing.HorseRacingTrainerService
import com.example.my_application.application.sakamichi.SakamichiApplicationService
import com.example.my_application.domain.horse_racing.*
import com.example.my_application.domain.sakamichi.member.Name
import com.example.my_application.domain.tennis.TennisPlayer
import com.example.my_application.domain.tennis.TennisSurface
import com.example.my_application.domain.tennis.Tournament
import com.example.my_application.domain.tennis.TournamentCategory
import com.example.my_application.domain.urban_sociology.Municipality
import com.example.my_application.domain.urban_sociology.MunicipalityType
import com.example.my_application.domain.urban_sociology.Prefecture
import com.example.my_application.domain.urban_sociology.PrefectureType
import com.example.my_application.domain.urban_sociology.ikebukuro.IkebukuroIncident
import com.example.my_application.infrastructure.horse_racing.*
import com.example.my_application.infrastructure.sakamichi.single.SingleRepository
import com.example.my_application.infrastructure.tennis.TennisPlayerRepository
import com.example.my_application.infrastructure.tennis.TournamentRepository
import com.example.my_application.infrastructure.urban_sociology.MunicipalityRepository
import com.example.my_application.infrastructure.urban_sociology.PrefectureRepository
import com.example.my_application.infrastructure.urban_sociology.ikebukuro.IkebukuroIncidentRepository
import com.example.my_application.initial_data.horce_racing.KATO_KAZUHIRO
import com.example.my_application.initial_data.sakamichi.*
import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import java.time.LocalDate
import javax.inject.Inject
import javax.transaction.Transactional
import com.example.my_application.domain.tennis.Country as TennisCountry

@QuarkusMain
class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Quarkus.run(MainApplication::class.java, *args)
        }
    }
}

class MainApplication : QuarkusApplication {

    @Inject
    lateinit var jockeyRepository: JockeyRepository

    @Inject
    lateinit var countryRepository: CountryRepository

    @Inject
    lateinit var raceRepository: RaceRepository

    @Inject
    lateinit var racecourseRepository: RacecourseRepository

    @Inject
    lateinit var racehorseRepository: RacehorseRepository

    @Inject
    lateinit var prefectureRepository: PrefectureRepository

    @Inject
    lateinit var municipalityRepository: MunicipalityRepository

    @Inject
    lateinit var singleRepository: SingleRepository

    @Inject
    lateinit var tennisPlayerRepository: TennisPlayerRepository

    @Inject
    lateinit var tournamentRepository: TournamentRepository

    @Inject
    lateinit var ikebukuroIncidentRepository: IkebukuroIncidentRepository

    @Inject
    lateinit var horseRacingTrainerService: HorseRacingTrainerService

    @Inject
    lateinit var sakamichiApplicationService: SakamichiApplicationService

    override fun run(args: Array<String>): Int {
        insertData()
        Quarkus.waitForExit();
        return 0
    }

    @Transactional
    fun insertData() {
        horseRacing()
        sakamichi()
        tennis()
        urbanSociology()
    }

    private fun horseRacing() {
        jockeyRepository.persist(
            Jockey(Name("勝己", "安藤", "かつみ", "あんどう"))
        )

        val japan = Country(name = "日本")
        val unitedArabEmirates = Country(name = "アラブ首長国連邦")
        val australia = Country(name = "オーストラリア")
        countryRepository.persist(japan, unitedArabEmirates, australia)

        val meydan = Racecourse("メイダン", unitedArabEmirates)
        val randwick = Racecourse("ランドウィック", australia)
        val sapporo = Racecourse("札幌", japan)
        racecourseRepository.persist(meydan, randwick, sapporo)

        raceRepository.persist(
            Race("ドバイシーマクラシック", Grade.G1, meydan, TrackSurface.TURF, 2410),
            Race("オールエイジドステークス", Grade.G1, randwick, TrackSurface.TURF, 1400)
        )

        racehorseRepository.persist(
            Racehorse("キタサンブラック", dateOfBirth = LocalDate.of(2012, 3, 10)),
            Racehorse("ファストフォース", dateOfBirth = LocalDate.of(2016, 5, 9))
        )

        horseRacingTrainerService.registerTrainer(KATO_KAZUHIRO)
    }

    private fun sakamichi() {
        // 乃木坂
        sakamichiApplicationService.registerNogizakaMembers(NOGIZAKA_MEMBERS_1st)
        sakamichiApplicationService.registerNogizakaMembers(NOGIZAKA_MEMBERS_3rd)
        sakamichiApplicationService.registerNogizakaMembers(KUBO_SHIORI)
        sakamichiApplicationService.registerNogizakaMembers(KANAGAWA_SAYA)
        sakamichiApplicationService.registerNogizakaMembers(NOGIZAKA_MEMBERS_5th)

        // 櫻坂
        val sakurazaka46 = sakamichiApplicationService.createNewGroup(groupName = SAKURAZAKA46.name)
        sakamichiApplicationService.registerSakurazakaMembers(SAKURAZAKA_MEMBERS_1st)
        sakamichiApplicationService.registerSakurazakaMembers(HABU_MIZUHO)
        sakamichiApplicationService.registerSakurazakaMembers(SAKURAZAKA_MEMBERS_2nd)
        sakamichiApplicationService.registerSakurazakaMembers(TAMURA_HONO)
        sakamichiApplicationService.registerSakurazakaMembers(SAKURAZAKA_MEMBERS_3rd)
        sakamichiApplicationService.registerSakurazakaMembers(MURAYAMA_MIU)

        sakamichiApplicationService.releaseNewSingle(groupId = sakurazaka46.id, title = "Start over!")

        // 日向坂
        val hinatazaka46 = sakamichiApplicationService.createNewGroup(groupName = HINATAZAKA46.name)
        sakamichiApplicationService.registerHinatazakaMembers(HINATAZAKA_MEMBERS_1st)
        sakamichiApplicationService.registerHinatazakaMembers(HINATAZAKA_MEMBERS_2nd)
        sakamichiApplicationService.registerHinatazakaMembers(NIBU_AKARI)
        sakamichiApplicationService.registerHinatazakaMembers(HINATAZAKA_MEMBERS_3rd)
        sakamichiApplicationService.registerHinatazakaMembers(HINATAZAKA_MEMBERS_4th)
        sakamichiApplicationService.registerHinatazakaMembers(KONISHI_KANAMI, SHIMIZU_RIO)

        sakamichiApplicationService.releaseNewSingle(groupId = hinatazaka46.id, title = "One Choice")
    }

    private fun tennis() {
        tournamentRepository.persist(
            Tournament(
                "Monte-Carlo",
                TournamentCategory.ATP_TOUR_MASTERS_1000,
                TennisSurface.CLAY
            )
        )

        tennisPlayerRepository.persist(
            TennisPlayer(
                "Daniil", "Medvedev",
                LocalDate.of(1996, 2, 11), TennisCountry.Russia
            ),
            TennisPlayer(
                "圭", "錦織",
                LocalDate.of(1989, 12, 29), TennisCountry.Japan
            )
        )
    }

    private fun urbanSociology() {
        val tokyo = Prefecture("東京", PrefectureType.TO)
        prefectureRepository.persist(tokyo)

        val tama = Municipality("多摩", tokyo, MunicipalityType.SHI)
        municipalityRepository.persist(tama)

        ikebukuroIncidentRepository.persist(
            IkebukuroIncident("東池袋自動車暴走死傷事故", LocalDate.of(2019, 4, 19))
        )
    }

}

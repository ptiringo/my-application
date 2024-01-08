package com.example.my_application

import com.example.my_application.application.horce_racing.HorseRacingApplicationService
import com.example.my_application.application.sakamichi.SakamichiApplicationService
import com.example.my_application.application.tennis.TennisApplicationService
import com.example.my_application.domain.horse_racing.Country
import com.example.my_application.domain.horse_racing.TrackSurface
import com.example.my_application.domain.horse_racing.race.Grade
import com.example.my_application.domain.horse_racing.race.Race
import com.example.my_application.domain.horse_racing.racecourse.Racecourse
import com.example.my_application.domain.tennis.TennisSurface
import com.example.my_application.domain.tennis.Tournament
import com.example.my_application.domain.tennis.TournamentCategory
import com.example.my_application.domain.urban_sociology.Municipality
import com.example.my_application.domain.urban_sociology.MunicipalityType
import com.example.my_application.domain.urban_sociology.Prefecture
import com.example.my_application.domain.urban_sociology.PrefectureType
import com.example.my_application.domain.urban_sociology.ikebukuro.IkebukuroIncident
import com.example.my_application.infrastructure.horse_racing.CountryRepository
import com.example.my_application.infrastructure.horse_racing.HorseRepository
import com.example.my_application.infrastructure.horse_racing.RaceRepository
import com.example.my_application.infrastructure.horse_racing.RacecourseRepository
import com.example.my_application.infrastructure.tennis.TournamentRepository
import com.example.my_application.infrastructure.urban_sociology.MunicipalityRepository
import com.example.my_application.infrastructure.urban_sociology.PrefectureRepository
import com.example.my_application.infrastructure.urban_sociology.ikebukuro.IkebukuroIncidentRepository
import com.example.my_application.initial_data.horce_racing.*
import com.example.my_application.initial_data.sakamichi.*
import com.example.my_application.initial_data.tennis.*
import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import java.time.LocalDate
import javax.inject.Inject
import javax.transaction.Transactional

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
    lateinit var countryRepository: CountryRepository

    @Inject
    lateinit var raceRepository: RaceRepository

    @Inject
    lateinit var racecourseRepository: RacecourseRepository

    @Inject
    lateinit var horseRepository: HorseRepository

    @Inject
    lateinit var prefectureRepository: PrefectureRepository

    @Inject
    lateinit var municipalityRepository: MunicipalityRepository

    @Inject
    lateinit var tournamentRepository: TournamentRepository

    @Inject
    lateinit var tennisApplicationService: TennisApplicationService

    @Inject
    lateinit var ikebukuroIncidentRepository: IkebukuroIncidentRepository

    @Inject
    lateinit var horseRacingApplicationService: HorseRacingApplicationService

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
        horseRacingApplicationService.registerRacehorse(KITASAN_BLACK)
        horseRacingApplicationService.registerRacehorse(FIRST_FORCE)
        horseRacingApplicationService.registerRacehorse(MELODY_LANE)

        horseRacingApplicationService.registerJockey(CHRISTOPHE_LEMAIRE)
        horseRacingApplicationService.registerJockey(ANDO_KATSUMI)

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

        horseRacingApplicationService.registerTrainer(KATO_KAZUHIRO)
    }

    private fun sakamichi() {
        // 乃木坂
        val nogizaka46 = sakamichiApplicationService.createNewGroup(NOGIZAKA46)
        val nogizakaMembersGen2 =
            sakamichiApplicationService.joinNewMembers(NOGIZAKA46_MEMBERS_GEN2(nogizaka46.id))
        val nogizakaMembersGen3 =
            sakamichiApplicationService.joinNewMembers(NOGIZAKA46_MEMBERS_GEN3(nogizaka46.id))
        val nigizakaMembersGen4 =
            sakamichiApplicationService.joinNewMembers(NOGIZAKA46_MEMBERS_GEN4(nogizaka46.id))
        val nogizakaMembersGen5 =
            sakamichiApplicationService.joinNewMembers(NOGIZAKA46_MEMBERS_GEN5(nogizaka46.id))

        // 櫻坂
        val sakurazaka46 = sakamichiApplicationService.createNewGroup(SAKURAZAKA46)
        val sakurazakaMembersGen2 =
            sakamichiApplicationService.joinNewMembers(SAKURAZAKA46_MEMBERS_GEN2(sakurazaka46.id))
        val sakurazakaMembersGen3 =
            sakamichiApplicationService.joinNewMembers(SAKURAZAKA46_MEMBERS_GEN3(sakurazaka46.id))

        sakamichiApplicationService.releaseNewSingle(groupId = sakurazaka46.id, title = "Start over!")

        // 日向坂
        val hinatazaka46 = sakamichiApplicationService.createNewGroup(HINATAZAKA46)
        val hinatazakaMembersGen2 =
            sakamichiApplicationService.joinNewMembers(HINATAZAKA46_MEMBERS_GEN2(hinatazaka46.id))
        val hinatazakaMembersGen3 =
            sakamichiApplicationService.joinNewMembers(HINATAZAKA46_MEMBERS_GEN3(hinatazaka46.id))
        val hinatazakaMembersGen4 =
            sakamichiApplicationService.joinNewMembers(HINATAZAKA46_MEMBERS_GEN4(hinatazaka46.id))

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

        tennisApplicationService.registerAsPro(RAFAEL_NADAL)
        tennisApplicationService.registerAsPro(NOVAK_DJOKOVIC)
        tennisApplicationService.registerAsPro(DANIIL_MEDVEDEV)
        tennisApplicationService.registerAsPro(KEI_NISHIKORI)
        tennisApplicationService.registerAsPro(ALEX_DE_MINAUR)
        tennisApplicationService.registerAsPro(GRIGOR_DIMITROV)
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

package com.example.my_application

import com.example.my_application.application.horce_racing.HorseRacingApplicationService
import com.example.my_application.application.sakamichi.SakamichiApplicationService
import com.example.my_application.application.tennis.TennisApplicationService
import com.example.my_application.domain.urban_sociology.Municipality
import com.example.my_application.domain.urban_sociology.MunicipalityType
import com.example.my_application.domain.urban_sociology.Prefecture
import com.example.my_application.domain.urban_sociology.PrefectureType
import com.example.my_application.domain.urban_sociology.ikebukuro.IkebukuroIncident
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
    lateinit var prefectureRepository: PrefectureRepository

    @Inject
    lateinit var municipalityRepository: MunicipalityRepository

    @Inject
    lateinit var tennis: TennisApplicationService

    @Inject
    lateinit var ikebukuroIncidentRepository: IkebukuroIncidentRepository

    @Inject
    lateinit var horseRacing: HorseRacingApplicationService

    @Inject
    lateinit var sakamichi: SakamichiApplicationService

    override fun run(args: Array<String>): Int {
        insertData()
        Quarkus.waitForExit();
        return 0
    }

    fun insertData() {
        horseRacing()
        sakamichi()
        tennis()
        urbanSociology()
    }

    fun horseRacing() {
        horseRacing.registerRacehorse(LOGIC)
        horseRacing.registerRacehorse(KITASAN_BLACK)
        horseRacing.registerRacehorse(FIRST_FORCE)
        horseRacing.registerRacehorse(MELODY_LANE)
        horseRacing.registerRacehorse(EQUINOX)
        horseRacing.registerRacehorse(YAMANIN_OURS)
        horseRacing.registerRacehorse(LUGAL)
        horseRacing.registerRacehorse(COMMAND_LINE)

        horseRacing.registerJockey(CHRISTOPHE_LEMAIRE)
        horseRacing.registerJockey(ANDO_KATSUMI)
        horseRacing.registerJockey(LUKE_MORRIS)

        val meydan = horseRacing.registerRacecourse(MEYDAN)
        val randwick = horseRacing.registerRacecourse(RANDWICK)
        horseRacing.registerRacecourse(SAPPORO)
        val tokyo = horseRacing.registerRacecourse(TOKYO)
        val kyoto = horseRacing.registerRacecourse(KYOTO)

        horseRacing.registerRace(DUBAI_SHEEMA_CLASSIC(meydan.id))
        horseRacing.registerRace(ALL_AGED_STAKES(randwick.id))
        horseRacing.registerRace(JAPAN_CUP(tokyo.id))
        horseRacing.registerRace(KYOTO_KINEN(kyoto.id))

        horseRacing.registerTrainer(KATO_KAZUHIRO)
        horseRacing.registerTrainer(SUGIYAMA_HARUKI)

        horseRacing.registerHorseOwner(KUMETA_MASAAKI)
    }

    private fun sakamichi() {
        // 乃木坂
        val (nogizaka46, nogi1stGen) = sakamichi.createNewGroup(NOGIZAKA46)
        val nogi1stMembers = nogi1stGen.members
        val nishinoNanase = nogi1stMembers.single { it.name.familyName == "西野" && it.name.firstName == "七瀬" }

        sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN2(nogizaka46.id))
        sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN3(nogizaka46.id))

        val nogi4thGen = sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN4(nogizaka46.id))
        val kanagawaSaya = nogi4thGen.members.single { it.name.familyName == "金川" && it.name.firstName == "紗耶" }

        sakamichi.graduate(memberId = nishinoNanase.id, leavedDate = LocalDate.of(2019, 2, 24))

        sakamichi.releaseNewSingle(SHIAWASE_NO_HOGOSHOKU(nogizaka46.id))
        sakamichi.releaseNewSingle(SING_OUT(nogizaka46.id))

        sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN5(nogizaka46.id))

        LocalDate.of(2023, 10, 31).let {
            sakamichi.startBreakOfActivity(memberId = kanagawaSaya.id, startAt = it)
        }

        LocalDate.of(2024, 1, 10).let {
            sakamichi.comeBack(memberId = kanagawaSaya.id, endAt = it)
        }

        // 櫻坂
        val (sakurazaka46, sakura1stGen) = sakamichi.createNewGroup(SAKURAZAKA46)
        val sakura1stMembers = sakura1stGen.members
        val habuMizuho = sakura1stMembers.single { it.name.familyName == "土生" && it.name.firstName == "瑞穂" }
        val kobayashiYui = sakura1stMembers.single { it.name.familyName == "小林" && it.name.firstName == "由依" }

        sakamichi.joinNewMembers(SAKURAZAKA46_MEMBERS_GEN2(sakurazaka46.id))
        sakamichi.joinNewMembers(SAKURAZAKA46_MEMBERS_GEN3(sakurazaka46.id))

        sakamichi.releaseNewSingle(START_OVER(sakurazaka46.id))
        sakamichi.releaseNewSingle(SHOUNIN_YOKKYU(sakurazaka46.id))
        sakamichi.releaseNewSingle(IKUTSU_NO_KORONI_MODORITAINOKA(sakurazaka46.id))

        sakamichi.graduate(habuMizuho.id, LocalDate.of(2023, 11, 25))
        sakamichi.graduate(kobayashiYui.id, LocalDate.of(2024, 2, 1))

        // 日向坂
        val (hinatazaka46, hinata1stGen) = sakamichi.createNewGroup(HINATAZAKA46)
        val hinata1stMembers = hinata1stGen.members
        val saitoKyoko = hinata1stMembers.single { it.name.familyName == "齊藤" && it.name.firstName == "京子" }

        sakamichi.joinNewMembers(HINATAZAKA46_MEMBERS_GEN2(hinatazaka46.id))
        sakamichi.joinNewMembers(HINATAZAKA46_MEMBERS_GEN3(hinatazaka46.id))
        val hinata4thGen = sakamichi.joinNewMembers(HINATAZAKA46_MEMBERS_GEN4(hinatazaka46.id))
        val kishiHonoka = hinata4thGen.members.single { it.name.familyName == "岸" && it.name.firstName == "帆夏" }

        sakamichi.releaseNewSingle(ONE_CHOICE(hinatazaka46.id))

        sakamichi.withdrawFromActivity(kishiHonoka.id, LocalDate.of(2023, 12, 7))

        sakamichi.graduate(memberId = saitoKyoko.id, leavedDate = LocalDate.of(2024, 4, 5))
    }

    private fun tennis() {
        tennis.registerTournament(MONTE_CARLO)
        tennis.registerTournament(AUSTRALIAN_OPEN)

        tennis.registerAsPro(RAFAEL_NADAL)
        tennis.registerAsPro(NOVAK_DJOKOVIC)
        tennis.registerAsPro(DANIIL_MEDVEDEV)
        tennis.registerAsPro(KEI_NISHIKORI)
        tennis.registerAsPro(ALEX_DE_MINAUR)
        tennis.registerAsPro(GRIGOR_DIMITROV)
        tennis.registerAsPro(ANDREY_RUBLEV)
        tennis.registerAsPro(CARLOS_ALCARAZ)
        tennis.registerAsPro(ALEXANDER_ZVEREV)
        tennis.registerAsPro(SAKAMOTO_REI)
        tennis.registerAsPro(STEFANOS_TSITSIPAS)
        tennis.registerAsPro(ROGER_FEDERER)
        tennis.registerAsPro(MILOS_RAONIC)
    }

    @Transactional
    fun urbanSociology() {
        val tokyo = Prefecture("東京", PrefectureType.TO)
        prefectureRepository.persist(tokyo)

        val tama = Municipality("多摩", tokyo, MunicipalityType.SHI)
        municipalityRepository.persist(tama)

        ikebukuroIncidentRepository.persist(
            IkebukuroIncident("東池袋自動車暴走死傷事故", LocalDate.of(2019, 4, 19))
        )
    }

}

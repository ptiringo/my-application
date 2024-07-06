package com.example.my_application

import com.example.my_application.application.horce_racing.HorseRacingApplicationService
import com.example.my_application.application.sakamichi.SakamichiApplicationService
import com.example.my_application.application.tennis.HoldTournamentCommand
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
import com.example.my_application.initial_data.sakamichi.hinatazaka.HINATAZAKA46
import com.example.my_application.initial_data.sakamichi.hinatazaka.HINATAZAKA46_MEMBERS_GEN1
import com.example.my_application.initial_data.sakamichi.hinatazaka.HINATAZAKA46_MEMBERS_GEN2
import com.example.my_application.initial_data.sakamichi.hinatazaka.HINATAZAKA46_MEMBERS_GEN3
import com.example.my_application.initial_data.sakamichi.hinatazaka.HINATAZAKA46_MEMBERS_GEN4
import com.example.my_application.initial_data.sakamichi.hinatazaka.HINATA_FES_2024
import com.example.my_application.initial_data.sakamichi.hinatazaka.KIMIWA_HONEYDEW
import com.example.my_application.initial_data.sakamichi.hinatazaka.ONE_CHOICE
import com.example.my_application.initial_data.sakamichi.nogizaka.BARRETTA
import com.example.my_application.initial_data.sakamichi.nogizaka.CHANCE_HA_BYOUDOU
import com.example.my_application.initial_data.sakamichi.nogizaka.MONOPOLY
import com.example.my_application.initial_data.sakamichi.nogizaka.NOGIZAKA46
import com.example.my_application.initial_data.sakamichi.nogizaka.NOGIZAKA46_MEMBERS_GEN2
import com.example.my_application.initial_data.sakamichi.nogizaka.NOGIZAKA46_MEMBERS_GEN3
import com.example.my_application.initial_data.sakamichi.nogizaka.NOGIZAKA46_MEMBERS_GEN4
import com.example.my_application.initial_data.sakamichi.nogizaka.NOGIZAKA46_MEMBERS_GEN5
import com.example.my_application.initial_data.sakamichi.nogizaka.SHIAWASE_NO_HOGOSHOKU
import com.example.my_application.initial_data.sakamichi.nogizaka.SING_OUT
import com.example.my_application.initial_data.sakamichi.nogizaka.UNDER_LIVE_35TH_SINGLE
import com.example.my_application.initial_data.sakamichi.sakurazaka.FOURTH_ARENA_TOUR_2024
import com.example.my_application.initial_data.sakamichi.sakurazaka.IKUTSU_NO_KORONI_MODORITAINOKA
import com.example.my_application.initial_data.sakamichi.sakurazaka.JIGOUJITOKU
import com.example.my_application.initial_data.sakamichi.sakurazaka.SAKURAZAKA46
import com.example.my_application.initial_data.sakamichi.sakurazaka.SAKURAZAKA46_MEMBERS_GEN2
import com.example.my_application.initial_data.sakamichi.sakurazaka.SAKURAZAKA46_MEMBERS_GEN3
import com.example.my_application.initial_data.sakamichi.sakurazaka.SHOUNIN_YOKKYU
import com.example.my_application.initial_data.sakamichi.sakurazaka.SILENT_MAJORITY
import com.example.my_application.initial_data.sakamichi.sakurazaka.START_OVER
import com.example.my_application.initial_data.tennis.*
import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import java.time.LocalDate
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

class MainApplication(
    private val horseRacing: HorseRacingApplicationService,
    private val sakamichi: SakamichiApplicationService,
    private val tennis: TennisApplicationService,
    private val prefectureRepository: PrefectureRepository,
    private val municipalityRepository: MunicipalityRepository,
    private val ikebukuroIncidentRepository: IkebukuroIncidentRepository
) : QuarkusApplication {

    override fun run(args: Array<String>): Int {
        insertData()
        Quarkus.waitForExit();
        return 0
    }

    fun insertData() {
        horseRacing()
        nogizaka()
        sakurazaka()
        hinatazaka()
        tennis()
        urbanSociology()
    }

    private fun horseRacing() {
        val kingKamehameha = horseRacing.registerRacehorse(KING_KAMEHAMEHA)
        horseRacing.registerRacehorse(LOGIC)
        horseRacing.registerRacehorse(KITASAN_BLACK)
        horseRacing.registerRacehorse(FIRST_FORCE)
        horseRacing.registerRacehorse(MELODY_LANE)
        horseRacing.registerRacehorse(EQUINOX)
        horseRacing.registerRacehorse(YAMANIN_OURS)
        horseRacing.registerRacehorse(LUGAL)
        horseRacing.registerRacehorse(COMMAND_LINE)
        horseRacing.registerRacehorse(PEPTIDE_NILE)
        horseRacing.registerRacehorse(ELUSIVE_PANTHER)
        horseRacing.registerRacehorse(DANON_PREMIUM)
        horseRacing.registerRacehorse(GRAN_ALEGRIA)

        horseRacing.registerJockey(CHRISTOPHE_LEMAIRE)
        horseRacing.registerJockey(ANDO_KATSUMI)
        horseRacing.registerJockey(LUKE_MORRIS)
        horseRacing.registerJockey(BUSHIZAWA_TOMOHARU)

        val meydan = horseRacing.registerRacecourse(MEYDAN)
        val randwick = horseRacing.registerRacecourse(RANDWICK)
        horseRacing.registerRacecourse(SAPPORO)
        val tokyo = horseRacing.registerRacecourse(TOKYO)
        val kyoto = horseRacing.registerRacecourse(KYOTO)
        val kingAbdulaziz = horseRacing.registerRacecourse(KING_ABDULAZIZ)
        horseRacing.registerRacecourse(EPSOM)
        val nakayama = horseRacing.registerRacecourse(NAKAYAMA)
        horseRacing.registerRacecourse(KANAZAWA)
        val leopardstown = horseRacing.registerRacecourse(LEOPARDSTOWN)

        horseRacing.registerRace(DUBAI_SHEEMA_CLASSIC(meydan.id))
        horseRacing.registerRace(ALL_AGED_STAKES(randwick.id))
        horseRacing.registerRace(JAPAN_CUP(tokyo.id))
        horseRacing.registerRace(KYOTO_KINEN(kyoto.id))
        horseRacing.registerRace(SAUDI_CUP(kingAbdulaziz.id))
        horseRacing.registerRace(DUBAI_GOLDEN_SHAHEEN(meydan.id))
        horseRacing.registerRace(SATSUKI_SHO(nakayama.id))
        horseRacing.registerRace(IRISH_CHAMPION_STAKES(leopardstown.id))

        horseRacing.registerTrainer(KATO_KAZUHIRO)
        horseRacing.registerTrainer(SUGIYAMA_HARUKI)
        horseRacing.registerTrainer(FUKUNAGA_YUICHI)

        horseRacing.registerHorseOwner(KUMETA_MASAAKI)

        horseRacing.selectAsKenshoba(kingKamehameha.id, 2024)
    }

    private fun nogizaka() {
        val nogizaka46 = sakamichi.createNewGroup(NOGIZAKA46)
        val nogi1stGen = nogizaka46.generation.first()
        val nogi1stMembers = nogi1stGen.members
        val nishinoNanase = nogi1stMembers.single { it.name.familyName == "西野" && it.name.firstName == "七瀬" }

        sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN2(nogizaka46.id))
        val nogi3rdGen = sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN3(nogizaka46.id))
        val sakaguchiTamami = nogi3rdGen.members.single { it.name.familyName == "阪口" && it.name.firstName == "珠美" }

        sakamichi.releaseNewSingle(BARRETTA(nogizaka46.id))

        val nogi4thGen = sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN4(nogizaka46.id))
        val kanagawaSaya = nogi4thGen.members.single { it.name.familyName == "金川" && it.name.firstName == "紗耶" }

        sakamichi.graduate(memberId = nishinoNanase.id, leavedDate = LocalDate.of(2019, 2, 24))

        sakamichi.releaseNewSingle(SHIAWASE_NO_HOGOSHOKU(nogizaka46.id))
        sakamichi.releaseNewSingle(SING_OUT(nogizaka46.id))

        sakamichi.joinNewMembers(NOGIZAKA46_MEMBERS_GEN5(nogizaka46.id))

        LocalDate.of(2023, 10, 31).let {
            sakamichi.startBreakOfActivity(memberId = kanagawaSaya.id, startAt = it)
        }

        sakamichi.releaseNewSingle(MONOPOLY(nogizaka46.id))

        LocalDate.of(2024, 1, 10).let {
            sakamichi.comeBack(memberId = kanagawaSaya.id, endAt = it)
        }

        sakamichi.releaseNewSingle(CHANCE_HA_BYOUDOU(nogizaka46.id))

        sakamichi.holdLive(UNDER_LIVE_35TH_SINGLE(nogizaka46.id))
    }

    private fun sakurazaka() {
        val sakurazaka46 = sakamichi.createNewGroup(SAKURAZAKA46)
        val sakura1stGen = sakurazaka46.generation.first()
        val sakura1stMembers = sakura1stGen.members
        val habuMizuho = sakura1stMembers.single { it.name.familyName == "土生" && it.name.firstName == "瑞穂" }
        val kobayashiYui = sakura1stMembers.single { it.name.familyName == "小林" && it.name.firstName == "由依" }
        val odaNana = sakura1stMembers.single { it.name.familyName == "織田" && it.name.firstName == "奈那" }

        sakamichi.releaseNewSingle(SILENT_MAJORITY(sakurazaka46.id))

        sakamichi.joinNewMembers(SAKURAZAKA46_MEMBERS_GEN2(sakurazaka46.id))

        sakamichi.graduate(odaNana.id, LocalDate.of(2020, 1, 23))

        sakamichi.joinNewMembers(SAKURAZAKA46_MEMBERS_GEN3(sakurazaka46.id))

        sakamichi.releaseNewSingle(START_OVER(sakurazaka46.id))
        sakamichi.releaseNewSingle(SHOUNIN_YOKKYU(sakurazaka46.id))

        sakamichi.graduate(habuMizuho.id, LocalDate.of(2023, 11, 25))
        sakamichi.graduate(kobayashiYui.id, LocalDate.of(2024, 2, 1))
        sakamichi.releaseNewSingle(IKUTSU_NO_KORONI_MODORITAINOKA(sakurazaka46.id))

        sakamichi.holdLive(FOURTH_ARENA_TOUR_2024(sakurazaka46.id))

        sakamichi.releaseNewSingle(JIGOUJITOKU(sakurazaka46.id))
    }

    private fun hinatazaka() {
        val hinatazaka46 = sakamichi.createNewGroup(HINATAZAKA46)
        val hinata1stGen = sakamichi.joinNewMembers(HINATAZAKA46_MEMBERS_GEN1(hinatazaka46.id))
        val hinata1stMembers = hinata1stGen.members
        val saitoKyoko = hinata1stMembers.single { it.name.familyName == "齊藤" && it.name.firstName == "京子" }

        sakamichi.joinNewMembers(HINATAZAKA46_MEMBERS_GEN2(hinatazaka46.id))
        sakamichi.joinNewMembers(HINATAZAKA46_MEMBERS_GEN3(hinatazaka46.id))
        val hinata4thGen = sakamichi.joinNewMembers(HINATAZAKA46_MEMBERS_GEN4(hinatazaka46.id))
        val kishiHonoka = hinata4thGen.members.single { it.name.familyName == "岸" && it.name.firstName == "帆夏" }

        sakamichi.releaseNewSingle(ONE_CHOICE(hinatazaka46.id))

        sakamichi.withdrawFromActivity(kishiHonoka.id, LocalDate.of(2023, 12, 7))

        sakamichi.graduate(memberId = saitoKyoko.id, leavedDate = LocalDate.of(2024, 4, 5))

        sakamichi.releaseNewSingle(KIMIWA_HONEYDEW(hinatazaka46.id))

        sakamichi.holdLive(HINATA_FES_2024(hinatazaka46.id))
    }

    private fun tennis() {
        val monteCarlo = tennis.registerTournament(MONTE_CARLO)
        tennis.registerTournament(AUSTRALIAN_OPEN)
        tennis.registerTournament(BNP_PARIBAS_OPEN)
        tennis.registerTournament(MIAMI_OPEN)
        tennis.registerTournament(HOUSTON)
        val rolandGarros = tennis.registerTournament(ROLAND_GARROS)
        tennis.registerTournament(ROTHESAY_INTERNATIONAL)

        tennis.registerAsPro(SHUZO_MATSUOKA)
        tennis.registerAsPro(MIKHAIL_YOUZHNY)
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
        tennis.registerAsPro(NICOLAS_JARRY)
        tennis.registerAsPro(ALEXANDER_BUBLIK)
        tennis.registerAsPro(THANASI_KOKKINAKIS)
        tennis.registerAsPro(JAN_LENNARD_STRUFF)
        tennis.registerAsPro(FELIX_AUGER_ALIASSIME)
        tennis.registerAsPro(JANNIK_SINNER)
        tennis.registerAsPro(TOMMY_PAUL)
        tennis.registerAsPro(OSAKA_NAOMI)
        tennis.registerAsPro(SEBASTIAN_OFNER)
        tennis.registerAsPro(DOMINIC_THIEM)
        tennis.registerAsPro(CASPER_RUUD)
        tennis.registerAsPro(TOMAS_MACHAC)
        tennis.registerAsPro(RICHARD_GASQUET)
        tennis.registerAsPro(BORNA_CORIC)
        tennis.registerAsPro(FRANCES_TIAFOE)

        tennis.holdTournament(
            HoldTournamentCommand(
                monteCarlo.id,
                startDate = LocalDate.of(2023, 4, 7),
                endDate = LocalDate.of(2023, 4, 14)
            )
        )

        tennis.holdTournament(
            HoldTournamentCommand(
                rolandGarros.id,
                startDate = LocalDate.of(2023, 5, 26),
                endDate = LocalDate.of(2023, 6, 9)
            )
        )
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

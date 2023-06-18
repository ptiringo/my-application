package com.example.my_application

import com.example.my_application.domain.horse_racing.*
import com.example.my_application.domain.sakamichi.*
import com.example.my_application.domain.sakamichi.Name
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
import com.example.my_application.infrastructure.sakamichi.HinatazakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.NogizakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.SakurazakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.SingleRepository
import com.example.my_application.infrastructure.tennis.TennisPlayerRepository
import com.example.my_application.infrastructure.tennis.TournamentRepository
import com.example.my_application.infrastructure.urban_sociology.MunicipalityRepository
import com.example.my_application.infrastructure.urban_sociology.PrefectureRepository
import com.example.my_application.infrastructure.urban_sociology.ikebukuro.IkebukuroIncidentRepository
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
    lateinit var sakurazakaMemberRepository: SakurazakaMemberRepository

    @Inject
    lateinit var nogizakaMemberRepository: NogizakaMemberRepository

    @Inject
    lateinit var hinatazakaMemberRepository: HinatazakaMemberRepository

    @Inject
    lateinit var singleRepository: SingleRepository

    @Inject
    lateinit var tennisPlayerRepository: TennisPlayerRepository

    @Inject
    lateinit var tournamentRepository: TournamentRepository

    @Inject
    lateinit var ikebukuroIncidentRepository: IkebukuroIncidentRepository

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
    }

    private fun sakamichi() {
        // 乃木坂
        nogizakaMemberRepository.persist(
            // 1期
            NogizakaMember(
                Name("飛鳥", "齋藤", "あすか", "さいとう"),
                LocalDate.of(1998, 8, 10),
                BecomingNogizakaMember.FIRST
            ).apply {
                graduate()
            },
            NogizakaMember(
                Name("七瀬", "西野", "ななせ", "にしの"),
                LocalDate.of(1994, 5, 25),
                BecomingNogizakaMember.FIRST
            ).apply {
                graduate()
            },
            // 3期
            NogizakaMember(
                Name("葉月", "向井", "はづき", "むかい"),
                LocalDate.of(1999, 8, 23),
                BecomingNogizakaMember.THIRD
            ),
            NogizakaMember(
                Name("祐希", "与田", "ゆうき", "よだ"),
                LocalDate.of(2000, 5, 5),
                BecomingNogizakaMember.THIRD
            ),
            // 4期
            NogizakaMember(
                Name("彩", "小川", "あや", "おがわ"),
                LocalDate.of(2007, 6, 27),
                BecomingNogizakaMember.FIFTH
            ),
            NogizakaMember(
                Name("桜", "川﨑", "さくら", "かわさき"),
                LocalDate.of(2003, 4, 17),
                BecomingNogizakaMember.FIFTH
            ),
            NogizakaMember(
                Name("姫奈", "岡本", "ひな", "おかもと"),
                LocalDate.of(2003, 12, 17),
                BecomingNogizakaMember.FIFTH
            ),
            NogizakaMember(
                Name("瑛紗", "池田", "てれさ", "いけだ"),
                LocalDate.of(2002, 5, 12),
                BecomingNogizakaMember.FIFTH
            ),
            NogizakaMember(
                Name("和", "井上", "なぎ", "いのうえ"),
                LocalDate.of(2005, 2, 17),
                BecomingNogizakaMember.FIFTH
            )
        )

        // 櫻坂
        sakurazakaMemberRepository.persist(
            SakurazakaMember(
                Name("友香", "菅井", "ゆうか", "すがい"),
                LocalDate.of(1995, 11, 29),
                BecomingSakuraMember.FIRST
            ).apply {
                graduate()
            },
            SakurazakaMember(
                Name("葵", "原田", "あおい", "はらだ"),
                LocalDate.of(2000, 5, 7),
                BecomingSakuraMember.FIRST
            ).apply {
                graduate()
            },
            SakurazakaMember(
                Name("冬優花", "齋藤", "ふゆか", "さいとう"),
                LocalDate.of(1998, 2, 15),
                BecomingSakuraMember.FIRST
            ),
        )

        sakurazakaMemberRepository.persist(
            // 2期
            SakurazakaMember(
                Name("光莉", "遠藤", "ひかり", "えんどう"),
                LocalDate.of(1999, 4, 17),
                BecomingSakuraMember.NEW_SECOND
            ).apply {
                takeLeaveOfAbsence(LocalDate.of(2021, 9, 6))
                comeBack(LocalDate.of(2021, 12, 8))
                takeLeaveOfAbsence(LocalDate.of(2023, 4, 19))
            },

            // 3期
            SakurazakaMember(
                Name("麗奈", "小田倉", "おだくら", "れいな"),
                LocalDate.of(2004, 7, 25),
                BecomingSakuraMember.THIRD
            ),
            SakurazakaMember(
                Name("凪紗", "小島", "なぎさ", "こじま"),
                LocalDate.of(2005, 7, 7),
                BecomingSakuraMember.THIRD
            ),
            SakurazakaMember(
                Name("美羽", "村山", "みう", "むらやま"),
                LocalDate.of(2005, 2, 15),
                BecomingSakuraMember.THIRD
            )
        )

        singleRepository.persist(Single(Group.Sakurazaka46, 6, "Start over!"))

        // 日向坂
        hinatazakaMemberRepository.persist(
            // 1期
            HinatazakaMember(
                Name("史帆", "加藤", "しほ", "かとう"),
                LocalDate.of(1998, 2, 22),
                BecomingHinataMember.FIRST
            ),
            HinatazakaMember(
                Name("久美", "佐々木", "くみ", "ささき"),
                LocalDate.of(1996, 1, 22),
                BecomingHinataMember.FIRST
            ),
            HinatazakaMember(
                Name("京子", "斉藤", "きょうこ", "さいとう"),
                LocalDate.of(1997, 9, 5),
                BecomingHinataMember.FIRST
            ),
            // 2期
            HinatazakaMember(
                Name("菜緒", "小坂", "なお", "こさか"),
                LocalDate.of(2002, 9, 7),
                BecomingHinataMember.SECOND
            ),
            HinatazakaMember(
                Name("鈴花", "富田", "すずか", "とみた"),
                LocalDate.of(2001, 1, 18),
                BecomingHinataMember.SECOND
            ),
            HinatazakaMember(
                Name("好花", "松田", "このか", "まつだ"),
                LocalDate.of(1999, 4, 27),
                BecomingHinataMember.SECOND
            ),
        )
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

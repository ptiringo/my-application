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
import com.example.my_application.infrastructure.horse_racing.*
import com.example.my_application.infrastructure.sakamichi.HinatazakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.NogizakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.SakurazakaMemberRepository
import com.example.my_application.infrastructure.tennis.TennisPlayerRepository
import com.example.my_application.infrastructure.tennis.TournamentRepository
import com.example.my_application.infrastructure.urban_sociology.MunicipalityRepository
import com.example.my_application.infrastructure.urban_sociology.PrefectureRepository
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
    lateinit var tennisPlayerRepository: TennisPlayerRepository

    @Inject
    lateinit var tournamentRepository: TournamentRepository

    @Transactional
    override fun run(args: Array<String>): Int {
        horseRacing()
        sakamichi()
        tennis()
        urbanSociology()
        return 0
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
            Racehorse("ファストフォース", dateOfBirth = LocalDate.of(2016, 5, 9))
        )
    }

    private fun sakamichi() {
        // 乃木坂
        val asukaSaito = NogizakaMember(
            Name("飛鳥", "齋藤", "あすか", "さいとう"),
            LocalDate.of(1998, 8, 10),
            BecomingNogizakaMember.FIRST
        )
        asukaSaito.graduate()

        val nanaseNishino = NogizakaMember(
            Name("七瀬", "西野", "ななせ", "にしの"),
            LocalDate.of(1994, 5, 25),
            BecomingNogizakaMember.FIRST
        )
        nanaseNishino.graduate()

        nogizakaMemberRepository.persist(
            // 1期
            asukaSaito,
            nanaseNishino,
            // 3期
            NogizakaMember(
                Name("葉月", "向井", "はづき", "むかい"),
                LocalDate.of(1999, 8, 23),
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
        val aoiHarada = SakurazakaMember(
            Name("葵", "原田", "あおい", "はらだ"),
            LocalDate.of(2000, 5, 7),
            BecomingSakuraMember.FIRST
        )
        aoiHarada.graduate()
        sakurazakaMemberRepository.persist(aoiHarada)

        sakurazakaMemberRepository.persist(
            SakurazakaMember(
                Name("麗奈", "小田倉", "おだくら", "れいな"),
                LocalDate.of(2004, 7, 25),
                BecomingSakuraMember.THIRD
            )
        )

        // 日向坂
        hinatazakaMemberRepository.persist(
            // 1期
            HinatazakaMember(
                Name("久美", "佐々木", "くみ", "ささき"),
                LocalDate.of(1996, 1, 22),
                BecomingHinataMember.FIRST
            ),
            HinatazakaMember(
                Name("京子", "斉藤", "きょうこ", "さいとう"),
                LocalDate.of(1997, 9, 5),
                BecomingHinataMember.FIRST
            )
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
            )
        )
    }

    private fun urbanSociology() {
        val tokyo = Prefecture("東京", PrefectureType.TO)
        prefectureRepository.persist(tokyo)

        val tama = Municipality("多摩", tokyo, MunicipalityType.SHI)
        municipalityRepository.persist(tama)
    }

}

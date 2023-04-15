package com.example.my_application

import com.example.my_application.domain.horse_racing.*
import com.example.my_application.domain.sakamichi.*
import com.example.my_application.domain.sakamichi.Name
import com.example.my_application.domain.urban_sociology.Municipality
import com.example.my_application.domain.urban_sociology.MunicipalityType
import com.example.my_application.domain.urban_sociology.Prefecture
import com.example.my_application.domain.urban_sociology.PrefectureType
import com.example.my_application.infrastructure.horse_racing.JockeyRepository
import com.example.my_application.infrastructure.horse_racing.RaceRepository
import com.example.my_application.infrastructure.horse_racing.RacecourseRepository
import com.example.my_application.infrastructure.horse_racing.RacehorseRepository
import com.example.my_application.infrastructure.sakamichi.HinatazakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.NogizakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.SakurazakaMemberRepository
import com.example.my_application.infrastructure.urban_sociology.MunicipalityRepository
import com.example.my_application.infrastructure.urban_sociology.PrefectureRepository
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
    lateinit var jockeyRepository: JockeyRepository

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

    @Transactional
    override fun run(args: Array<String>): Int {
        horseRacing()
        urbanSociology()
        sakamichi()
        return 0
    }

    private fun horseRacing() {
        val katsumiAndo = Jockey(name = Name("勝己", "安藤", "かつみ", "あんどう"))
        jockeyRepository.persist(katsumiAndo)

        val meydan = Racecourse(name = "メイダン")
        val sapporo = Racecourse(name = "札幌")
        racecourseRepository.persist(meydan, sapporo)

        val dubaiSheemaClassic = Race(
            name = "ドバイシーマクラシック",
            racecourse = meydan,
            trackSurface = TrackSurface.TURF,
            distance = 2410
        )
        raceRepository.persist(dubaiSheemaClassic)

        val firstForce = Racehorse(name = "ファストフォース", dateOfBirth = LocalDate.of(2016, 5, 9))
        racehorseRepository.persist(firstForce)
    }

    private fun urbanSociology() {
        val tokyo = Prefecture(name = "東京", type = PrefectureType.TO)
        prefectureRepository.persist(tokyo)

        val tama = Municipality(name = "多摩", type = MunicipalityType.SHI, prefecture = tokyo)
        municipalityRepository.persist(tama)
    }

    private fun sakamichi() {
        // 乃木坂
        val nanaseNishino = NogizakaMember(
            name = Name("七瀬", "西野", "ななせ", "にしの"),
            dateOfBirth = LocalDate.of(1994, 5, 25),
            becomingMember = BecomingNogizakaMember.FIRST
        )
        nanaseNishino.graduate()

        nogizakaMemberRepository.persist(
            // 1期
            nanaseNishino,
            // 3期
            NogizakaMember(
                name = Name("葉月", "向井", "はづき", "むかい"),
                dateOfBirth = LocalDate.of(1999, 8, 23),
                becomingMember = BecomingNogizakaMember.THIRD
            ),
            // 4期
            NogizakaMember(
                name = Name("彩", "小川", "あや", "おがわ"),
                dateOfBirth = LocalDate.of(2007, 6, 27),
                becomingMember = BecomingNogizakaMember.FIFTH
            ),
            NogizakaMember(
                name = Name("桜", "川﨑", "さくら", "かわさき"),
                dateOfBirth = LocalDate.of(2003, 4, 17),
                becomingMember = BecomingNogizakaMember.FIFTH
            ),
            NogizakaMember(
                name = Name("姫奈", "岡本", "ひな", "おかもと"),
                dateOfBirth = LocalDate.of(2003, 12, 17),
                becomingMember = BecomingNogizakaMember.FIFTH
            ),
            NogizakaMember(
                name = Name("瑛紗", "池田", "てれさ", "いけだ"),
                dateOfBirth = LocalDate.of(2002, 5, 12),
                becomingMember = BecomingNogizakaMember.FIFTH
            )
        )

        // 櫻坂
        val aoiHarada = SakurazakaMember(
            name = Name("葵", "原田", "あおい", "はらだ"),
            dateOfBirth = LocalDate.of(2000, 5, 7),
            becomingMember = BecomingSakuraMember.FIRST
        )
        aoiHarada.graduate()
        sakurazakaMemberRepository.persist(aoiHarada)

        sakurazakaMemberRepository.persist(
            SakurazakaMember(
                name = Name("麗奈", "小田倉", "おだくら", "れいな"),
                dateOfBirth = LocalDate.of(2004, 7, 25),
                becomingMember = BecomingSakuraMember.THIRD
            )
        )

        // 日向坂
        hinatazakaMemberRepository.persist(
            // 1期
            HinatazakaMember(
                name = Name("久美", "佐々木", "くみ", "ささき"),
                dateOfBirth = LocalDate.of(1996, 1, 22),
                becomingMember = BecomingHinataMember.FIRST
            ),
            HinatazakaMember(
                name = Name("京子", "斉藤", "きょうこ", "さいとう"),
                dateOfBirth = LocalDate.of(1997, 9, 5),
                becomingMember = BecomingHinataMember.FIRST
            )
        )
    }
}

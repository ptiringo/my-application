package com.example.my_application

import com.example.my_application.domain.horse_racing.Jockey
import com.example.my_application.domain.horse_racing.Race
import com.example.my_application.domain.horse_racing.Racecourse
import com.example.my_application.domain.horse_racing.Racehorse
import com.example.my_application.domain.sakamichi.*
import com.example.my_application.domain.urban_sociology.Municipality
import com.example.my_application.domain.urban_sociology.MunicipalityType
import com.example.my_application.domain.urban_sociology.Prefecture
import com.example.my_application.domain.urban_sociology.PrefectureType
import com.example.my_application.infrastructure.horse_racing.JockeyRepository
import com.example.my_application.infrastructure.horse_racing.RaceRepository
import com.example.my_application.infrastructure.horse_racing.RacecourseRepository
import com.example.my_application.infrastructure.horse_racing.RacehorseRepository
import com.example.my_application.infrastructure.sakamichi.NogizakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.SakurazakaMemberRepository
import com.example.my_application.infrastructure.urban_sociology.MunicipalityRepository
import com.example.my_application.infrastructure.urban_sociology.PrefectureRepository
import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
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

        val dubaiSheemaClassic = Race(name = "ドバイシーマクラシック")
        raceRepository.persist(dubaiSheemaClassic)

        val sapporo = Racecourse(name = "札幌")
        racecourseRepository.persist(sapporo)

        val firstForce = Racehorse(name = "ファストフォース")
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
        val hinaOkamoto = NogizakaMember(
            name = Name("姫奈", "岡本", "ひな", "おかもと"),
            becomingMember = BecomingNogizakaMember.FIFTH
        )

        val teresaIkeda = NogizakaMember(
            name = Name("瑛紗", "池田", "てれさ", "いけだ"),
            becomingMember = BecomingNogizakaMember.FIFTH
        )
        nogizakaMemberRepository.persist(hinaOkamoto, teresaIkeda)

        // 櫻坂
        val aoiHarada = SakurazakaMember(
            name = Name("葵", "原田", "あおい", "はらだ"),
            becomingMember = BecomingSakuraMember.FIRST
        )
        aoiHarada.graduate()
        sakurazakaMemberRepository.persist(aoiHarada)

        val reinaOdakura =
            SakurazakaMember(
                name = Name("麗奈", "小田倉", "おだくら", "れいな"),
                becomingMember = BecomingSakuraMember.THIRD
            )
        sakurazakaMemberRepository.persist(reinaOdakura)
    }
}

package com.example.my_application

import com.example.my_application.domain.sakamichi.*
import com.example.my_application.domain.urban_sociology.Municipality
import com.example.my_application.domain.urban_sociology.MunicipalityType
import com.example.my_application.domain.urban_sociology.Prefecture
import com.example.my_application.domain.urban_sociology.PrefectureType
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
    lateinit var prefectureRepository: PrefectureRepository

    @Inject
    lateinit var municipalityRepository: MunicipalityRepository

    @Inject
    lateinit var sakurazakaMemberRepository: SakurazakaMemberRepository

    @Inject
    lateinit var nogizakaMemberRepository: NogizakaMemberRepository

    @Transactional
    override fun run(args: Array<String>): Int {
        urbanSociology()
        sakamichi()
        return 0
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
            name = Name(
                firstName = "姫奈",
                familyName = "岡本",
                firstNameKana = "ひな",
                familyNameKana = "おかもと"
            ),
            becomingMember = BecomingNogizakaMember.FIFTH
        )
        nogizakaMemberRepository.persist(hinaOkamoto)

        // 櫻坂
        val aoiHarada = SakurazakaMember(
            name = Name(
                firstName = "葵",
                familyName = "原田",
                firstNameKana = "あおい",
                familyNameKana = "はらだ"
            ),
            becomingMember = BecomingSakuraMember.FIRST
        )
        aoiHarada.graduate()
        sakurazakaMemberRepository.persist(aoiHarada)

        val reinaOdakura =
            SakurazakaMember(
                name = Name(
                    firstName = "麗奈",
                    familyName = "小田倉",
                    firstNameKana = "おだくら",
                    familyNameKana = "れいな"
                ),
                becomingMember = BecomingSakuraMember.THIRD
            )
        sakurazakaMemberRepository.persist(reinaOdakura)
    }
}
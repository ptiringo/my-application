package com.example.my_application.application.tennis

import com.example.my_application.domain.tennis.Country
import com.example.my_application.domain.tennis.player.BackhandStyle
import com.example.my_application.domain.tennis.player.DominantHand
import java.time.LocalDate

/** プロ登録コマンド */
data class RegisterAsProCommand(
    /** 名前 */
    val firstName: String,

    /** 苗字 */
    val familyName: String,

    /** 生年月日 */
    val dateOfBirth: LocalDate,

    /** 国籍 */
    val country: Country,

    /** 利き手 */
    val dominantHand: DominantHand,

    /** バックハンドスタイル */
    val backhandStyle: BackhandStyle
)

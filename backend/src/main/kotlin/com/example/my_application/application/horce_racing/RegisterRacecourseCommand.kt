package com.example.my_application.application.horce_racing

import com.example.my_application.domain.horse_racing.Country

/** 競馬場登録コマンド */
data class RegisterRacecourseCommand(
    /** 競馬場名 */
    val name: String,

    /** 国 */
    val country: Country
)

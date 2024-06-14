package com.example.my_application.application.horce_racing

import java.time.LocalDate

/** 競走馬登録コマンド */
data class RegisterRacehorseCommand(
    /** 競走馬名 */
    val name: String,

    /** 生年月日 */
    val dateOfBirth: LocalDate,
)

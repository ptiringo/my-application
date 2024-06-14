package com.example.my_application.application.horce_racing

/** 調教師登録コマンド */
data class RegisterTrainerCommand(
    /** 名前 */
    val firstName: String,

    /** 苗字 */
    val familyName: String,
)

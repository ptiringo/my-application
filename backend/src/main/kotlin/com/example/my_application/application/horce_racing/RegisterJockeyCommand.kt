package com.example.my_application.application.horce_racing

/** 騎手登録コマンド */
data class RegisterJockeyCommand(
    /** 騎手名前かな */
    val firstNameKana: String,

    /** 騎手苗字かな */
    val familyNameKana: String,

    /** 騎手名前漢字 */
    val firstNameKanji: String? = null,

    /** 騎手苗字漢字 */
    val familyNameKanji: String? = null,

    /** 騎手名前アルファベット */
    val firstNameAlphabet: String? = null,

    /** 騎手苗字アルファベット */
    val familyNameAlphabet: String? = null,
)

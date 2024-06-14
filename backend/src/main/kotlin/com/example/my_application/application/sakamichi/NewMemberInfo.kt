package com.example.my_application.application.sakamichi

import java.time.LocalDate

/** 新メンバー情報 */
data class NewMemberInfo(
    /** 名前 */
    val firstName: String,

    /** 苗字 */
    val familyName: String,

    /** 名前かな */
    val firstNameKana: String,

    /** 苗字かな */
    val familyNameKana: String,

    /** 生年月日 */
    val dateOfBirth: LocalDate,

    /** ミドルネーム */
    val middleName: String? = null,
)

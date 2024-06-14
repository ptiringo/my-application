package com.example.my_application.application.sakamichi

import java.time.LocalDate

/** ニューシングルリリースコマンド */
data class ReleaseNewSingleCommand(
    /** グループID */
    val groupId: Long,

    /** シングルの通し番号 */
    val number: Int,

    /** タイトル */
    val title: String,

    /** リリース日 */
    val releaseDate: LocalDate,
)

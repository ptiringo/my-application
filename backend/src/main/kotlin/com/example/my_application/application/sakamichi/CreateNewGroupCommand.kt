package com.example.my_application.application.sakamichi

import java.time.LocalDate

/** グループ新規作成コマンド */
data class CreateNewGroupCommand(
    /** グループ名 */
    val groupName: String,

    /** 結成日 */
    val formationDate: LocalDate,

    /** 初期メンバー */
    val initialMembers: List<NewMemberInfo>
)

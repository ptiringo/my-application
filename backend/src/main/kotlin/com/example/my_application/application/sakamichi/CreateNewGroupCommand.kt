package com.example.my_application.application.sakamichi

import java.time.LocalDate

data class CreateNewGroupCommand(
    /** グループ名 */
    val groupName: String,
    /** 結成日 */
    val formationDate: LocalDate,
    /** 初期メンバー */
    val initialMembers: List<NewMember>
)

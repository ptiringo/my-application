package com.example.my_application.application.sakamichi

import java.time.LocalDate

data class JoinNewMembersCommand(
    /** グループID */
    val groupId: Long,
    /** 加入日 */
    val joinDate: LocalDate,
    /** 新メンバー */
    val newMembers: List<NewMember>
)

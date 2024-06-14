package com.example.my_application.application.sakamichi

import java.time.LocalDate

/** 新メンバー加入コマンド */
data class JoinNewMembersCommand(
    /** グループID */
    val groupId: Long,

    /** 加入日 */
    val joinDate: LocalDate,

    /** 新メンバー */
    val newMembers: List<NewMemberInfo>
)

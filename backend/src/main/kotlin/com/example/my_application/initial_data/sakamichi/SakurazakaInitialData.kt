package com.example.my_application.initial_data.sakamichi

import com.example.my_application.application.sakamichi.CreateNewGroupCommand
import com.example.my_application.application.sakamichi.JoinNewMembersCommand
import com.example.my_application.application.sakamichi.NewMember
import java.time.LocalDate

/** 櫻坂46 */
val SAKURAZAKA46 =
    CreateNewGroupCommand(
        groupName = "櫻坂46",
        formationDate = LocalDate.of(2015, 8, 21),
        initialMembers = listOf(
            NewMember(
                firstName = "友香",
                familyName = "菅井",
                firstNameKana = "ゆうか",
                familyNameKana = "すがい",
                dateOfBirth = LocalDate.of(1995, 11, 29)
            ),
            NewMember(
                firstName = "葵",
                familyName = "原田",
                firstNameKana = "あおい",
                familyNameKana = "はらだ",
                dateOfBirth = LocalDate.of(2000, 5, 7)
            ),
            NewMember(
                firstName = "冬優花",
                familyName = "齋藤",
                firstNameKana = "ふゆか",
                familyNameKana = "さいとう",
                dateOfBirth = LocalDate.of(1998, 2, 15)
            ),
            NewMember(
                firstName = "由依",
                familyName = "小林",
                firstNameKana = "ゆい",
                familyNameKana = "こばやし",
                dateOfBirth = LocalDate.of(1999, 10, 23)
            ),
            NewMember(
                firstName = "瑞穂",
                familyName = "土生",
                firstNameKana = "みづほ",
                familyNameKana = "はぶ",
                dateOfBirth = LocalDate.of(1997, 7, 7)
            ),
            NewMember(
                firstName = "ねる",
                familyName = "長濱",
                firstNameKana = "ねる",
                familyNameKana = "ながはま",
                dateOfBirth = LocalDate.of(1998, 9, 4)
            )
        )
    )


/** 2期生 */
val SAKURAZAKA46_MEMBERS_GEN2 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2018, 8, 19),
        newMembers = listOf(
            NewMember(
                firstName = "光莉",
                familyName = "遠藤",
                firstNameKana = "ひかり",
                familyNameKana = "えんどう",
                dateOfBirth = LocalDate.of(1999, 4, 17)
            ),
            NewMember(
                firstName = "保乃",
                familyName = "田村",
                firstNameKana = "ほの",
                familyNameKana = "たむら",
                dateOfBirth = LocalDate.of(1998, 10, 21)
            )
        )
    )
}

/** 3期生 */
val SAKURAZAKA46_MEMBERS_GEN3 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2023, 1, 6),
        newMembers = listOf(
            NewMember(
                firstName = "美羽",
                familyName = "村山",
                firstNameKana = "みう",
                familyNameKana = "むらやま",
                dateOfBirth = LocalDate.of(2005, 2, 15)
            ),
            NewMember(
                firstName = "麗奈",
                familyName = "小田倉",
                firstNameKana = "れいな",
                familyNameKana = "おだくら",
                dateOfBirth = LocalDate.of(2004, 7, 25)
            ),
            NewMember(
                firstName = "凪紗",
                familyName = "小島",
                firstNameKana = "なぎさ",
                familyNameKana = "こじま",
                dateOfBirth = LocalDate.of(2005, 7, 7)
            )
        )
    )
}

package com.example.my_application.initial_data.sakamichi

import com.example.my_application.application.sakamichi.CreateNewGroupCommand
import com.example.my_application.application.sakamichi.JoinNewMembersCommand
import com.example.my_application.application.sakamichi.NewMember
import java.time.LocalDate


/** 日向坂46 */
val HINATAZAKA46 =
    CreateNewGroupCommand(
        groupName = "日向坂46",
        formationDate = LocalDate.of(2016, 5, 8),
        initialMembers = listOf(
            NewMember(
                firstName = "史帆",
                familyName = "加藤",
                firstNameKana = "しほ",
                familyNameKana = "かとう",
                dateOfBirth = LocalDate.of(1998, 2, 22)
            ),
            NewMember(
                firstName = "久美",
                familyName = "佐々木",
                firstNameKana = "くみ",
                familyNameKana = "ささき",
                dateOfBirth = LocalDate.of(1996, 1, 22)
            ),
            NewMember(
                firstName = "京子",
                familyName = "斉藤",
                firstNameKana = "きょうこ",
                familyNameKana = "さいとう",
                dateOfBirth = LocalDate.of(1997, 9, 5)
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
val HINATAZAKA46_MEMBERS_GEN2 =
    JoinNewMembersCommand(
        groupId = 0,
        joinDate = LocalDate.of(2017, 8, 15),
        newMembers = listOf(
            NewMember(
                firstName = "菜緒",
                familyName = "小坂",
                firstNameKana = "なお",
                familyNameKana = "こさか",
                dateOfBirth = LocalDate.of(2002, 9, 7)
            ),
            NewMember(
                firstName = "鈴花",
                familyName = "富田",
                firstNameKana = "すずか",
                familyNameKana = "とみた",
                dateOfBirth = LocalDate.of(2001, 1, 18)
            ),
            NewMember(
                firstName = "好花",
                familyName = "松田",
                firstNameKana = "このか",
                familyNameKana = "まつだ",
                dateOfBirth = LocalDate.of(1999, 4, 27)
            ),
            NewMember(
                firstName = "明里",
                familyName = "丹生",
                firstNameKana = "あかり",
                familyNameKana = "にぶ",
                dateOfBirth = LocalDate.of(2001, 2, 15)
            )
        )
    )

/** 3期生 */
val HINATAZAKA46_MEMBERS_GEN3 =
    JoinNewMembersCommand(
        groupId = 0,
        joinDate = LocalDate.of(2018, 8, 19),
        newMembers = listOf(
            NewMember(
                firstName = "茉莉",
                familyName = "森本",
                firstNameKana = "まりぃ",
                familyNameKana = "もりもと",
                dateOfBirth = LocalDate.of(2004, 2, 23)
            ),
        )
    )

/** 4期生 */
val HINATAZAKA46_MEMBERS_GEN4 =
    JoinNewMembersCommand(
        groupId = 0,
        joinDate = LocalDate.of(2022, 9, 21),
        newMembers = listOf(
            NewMember(
                firstName = "莉奈",
                familyName = "渡辺",
                firstNameKana = "りな",
                familyNameKana = "わたなべ",
                dateOfBirth = LocalDate.of(2009, 2, 7)
            ),
            NewMember(
                firstName = "夏菜実",
                familyName = "小西",
                firstNameKana = "かなみ",
                familyNameKana = "こにし",
                dateOfBirth = LocalDate.of(2004, 10, 3)
            ),
            NewMember(
                firstName = "理央",
                familyName = "清水",
                firstNameKana = "りお",
                familyNameKana = "しみず",
                dateOfBirth = LocalDate.of(2005, 1, 15)
            )
        )
    )

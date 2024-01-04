package com.example.my_application.initial_data.sakamichi

import com.example.my_application.application.sakamichi.CreateNewGroupCommand
import com.example.my_application.application.sakamichi.JoinNewMembersCommand
import com.example.my_application.application.sakamichi.NewMember
import java.time.LocalDate

/** 乃木坂46 */
val NOGIZAKA46 =
    CreateNewGroupCommand(
        groupName = "乃木坂46",
        formationDate = LocalDate.of(2011, 8, 21),
        initialMembers = listOf(
            NewMember(
                firstName = "飛鳥",
                familyName = "齋藤",
                firstNameKana = "あすか",
                familyNameKana = "さいとう",
                dateOfBirth = LocalDate.of(1998, 8, 10)
            ),
            NewMember(
                firstName = "七瀬",
                familyName = "西野",
                firstNameKana = "ななせ",
                familyNameKana = "にしの",
                dateOfBirth = LocalDate.of(1994, 5, 25)
            ),
            NewMember(
                firstName = "絵梨花",
                familyName = "生田",
                firstNameKana = "えりか",
                familyNameKana = "いくた",
                dateOfBirth = LocalDate.of(1997, 1, 22)
            )
        )
    )


/** 2期生 */
val NOGIZAKA46_MEMBERS_GEN2 =
    JoinNewMembersCommand(
        groupId = 0,
        joinDate = LocalDate.of(2013, 3, 28),
        newMembers = listOf()
    )

/** 3期生 */
val NOGIZAKA46_MEMBERS_GEN3 =
    JoinNewMembersCommand(
        groupId = 0,
        joinDate = LocalDate.of(2016, 9, 4),
        newMembers = listOf(
            NewMember(
                firstName = "葉月",
                familyName = "向井",
                firstNameKana = "はづき",
                familyNameKana = "むかい",
                dateOfBirth = LocalDate.of(1999, 8, 23)
            ),
            NewMember(
                firstName = "祐希",
                familyName = "与田",
                firstNameKana = "ゆうき",
                familyNameKana = "よだ",
                dateOfBirth = LocalDate.of(2000, 5, 5)
            ),
            NewMember(
                firstName = "史緒里",
                familyName = "久保",
                firstNameKana = "しおり",
                familyNameKana = "くぼ",
                dateOfBirth = LocalDate.of(2001, 7, 14)
            )
        )
    )


/** 4期生 */
val NOGIZAKA46_MEMBERS_GEN4 =
    JoinNewMembersCommand(
        groupId = 0,
        joinDate = LocalDate.of(2013, 3, 28),
        newMembers = listOf(
            NewMember(
                firstName = "紗耶",
                familyName = "金川",
                firstNameKana = "さや",
                familyNameKana = "かながわ",
                dateOfBirth = LocalDate.of(2001, 10, 31)
            ),
            NewMember(
                firstName = "奈於",
                familyName = "弓木",
                firstNameKana = "なお",
                familyNameKana = "ゆみき",
                dateOfBirth = LocalDate.of(1999, 2, 3)
            ),
            NewMember(
                firstName = "沙耶香",
                familyName = "掛橋",
                firstNameKana = "さやか",
                familyNameKana = "かけはし",
                dateOfBirth = LocalDate.of(2002, 11, 20)
            )
        )
    )

/** 5期生 */
val NOGIZAKA46_MEMBERS_GEN5 =
    JoinNewMembersCommand(
        groupId = 0,
        joinDate = LocalDate.of(2013, 3, 28),
        newMembers = listOf(
            NewMember(
                firstName = "彩",
                familyName = "小川",
                firstNameKana = "あや",
                familyNameKana = "おがわ",
                dateOfBirth = LocalDate.of(2007, 6, 27)
            ),
            NewMember(
                firstName = "桜",
                familyName = "川﨑",
                firstNameKana = "さくら",
                familyNameKana = "かわさき",
                dateOfBirth = LocalDate.of(2003, 4, 17)
            ),
            NewMember(
                firstName = "姫奈",
                familyName = "岡本",
                firstNameKana = "ひな",
                familyNameKana = "おかもと",
                dateOfBirth = LocalDate.of(2003, 12, 17)
            ),
            NewMember(
                firstName = "瑛紗",
                familyName = "池田",
                firstNameKana = "てれさ",
                familyNameKana = "いけだ",
                dateOfBirth = LocalDate.of(2002, 5, 12)
            ),
            NewMember(
                firstName = "和",
                familyName = "井上",
                firstNameKana = "なぎ",
                familyNameKana = "いのうえ",
                dateOfBirth = LocalDate.of(2005, 2, 17)
            ),
            NewMember(
                firstName = "アルノ",
                familyName = "中西",
                firstNameKana = "あるの",
                familyNameKana = "なかにし",
                dateOfBirth = LocalDate.of(2003, 3, 17)
            )
        )
    )

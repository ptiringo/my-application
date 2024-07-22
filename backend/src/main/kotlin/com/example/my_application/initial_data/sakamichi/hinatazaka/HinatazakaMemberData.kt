package com.example.my_application.initial_data.sakamichi.hinatazaka

import com.example.my_application.application.sakamichi.CreateNewGroupCommand
import com.example.my_application.application.sakamichi.JoinNewMembersCommand
import com.example.my_application.application.sakamichi.NewMemberInfo
import java.time.LocalDate

/** 日向坂46 */
val HINATAZAKA46 =
    CreateNewGroupCommand(
        groupName = "日向坂46",
        formationDate = LocalDate.of(2015, 11, 30),
        initialMembers = listOf(
            NewMemberInfo(
                firstName = "ねる",
                familyName = "長濱",
                firstNameKana = "ねる",
                familyNameKana = "ながはま",
                dateOfBirth = LocalDate.of(1998, 9, 4)
            )
        )
    )

/** 1期生 */
val HINATAZAKA46_MEMBERS_GEN1 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2016, 5, 8),
        newMembers = listOf(
            NewMemberInfo(
                firstName = "史帆",
                familyName = "加藤",
                firstNameKana = "しほ",
                familyNameKana = "かとう",
                dateOfBirth = LocalDate.of(1998, 2, 22)
            ),
            NewMemberInfo(
                firstName = "久美",
                familyName = "佐々木",
                firstNameKana = "くみ",
                familyNameKana = "ささき",
                dateOfBirth = LocalDate.of(1996, 1, 22)
            ),
            NewMemberInfo(
                firstName = "京子",
                familyName = "齊藤",
                firstNameKana = "きょうこ",
                familyNameKana = "さいとう",
                dateOfBirth = LocalDate.of(1997, 9, 5)
            ),
            NewMemberInfo(
                firstName = "ねる",
                familyName = "長濱",
                firstNameKana = "ねる",
                familyNameKana = "ながはま",
                dateOfBirth = LocalDate.of(1998, 9, 4)
            ),
            NewMemberInfo(
                firstName = "眞緒",
                familyName = "井口",
                firstNameKana = "まお",
                familyNameKana = "いぐち",
                dateOfBirth = LocalDate.of(1995, 11, 10)
            ),
            NewMemberInfo(
                firstName = "紗理菜",
                familyName = "潮",
                firstNameKana = "さりな",
                familyNameKana = "うしお",
                dateOfBirth = LocalDate.of(1997, 12, 26)
            ),
            NewMemberInfo(
                firstName = "愛奈",
                familyName = "高瀬",
                firstNameKana = "まな",
                familyNameKana = "たかせ",
                dateOfBirth = LocalDate.of(1998, 9, 20)
            ),
            NewMemberInfo(
                firstName = "美玲",
                familyName = "佐々木",
                firstNameKana = "みれい",
                familyNameKana = "ささき",
                dateOfBirth = LocalDate.of(1999, 12, 17)
            ),
            NewMemberInfo(
                firstName = "優佳",
                familyName = "影山",
                firstNameKana = "ゆうか",
                familyNameKana = "かげやま",
                dateOfBirth = LocalDate.of(2001, 5, 8)
            ),
            NewMemberInfo(
                firstName = "彩花",
                familyName = "高本",
                firstNameKana = "あやか",
                familyNameKana = "たかもと",
                dateOfBirth = LocalDate.of(1998, 12, 2)
            ),
            NewMemberInfo(
                firstName = "芽実",
                familyName = "柿崎",
                firstNameKana = "めみ",
                familyNameKana = "かきざき",
                dateOfBirth = LocalDate.of(2001, 12, 2)
            ),
            NewMemberInfo(
                firstName = "芽依",
                familyName = "東村",
                firstNameKana = "めい",
                familyNameKana = "ひがしむら",
                dateOfBirth = LocalDate.of(1998, 8, 23)
            ),
        )
    )
}

/** 2期生 */
val HINATAZAKA46_MEMBERS_GEN2 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2017, 8, 15),
        newMembers = listOf(
            NewMemberInfo(
                firstName = "菜緒",
                familyName = "小坂",
                firstNameKana = "なお",
                familyNameKana = "こさか",
                dateOfBirth = LocalDate.of(2002, 9, 7)
            ),
            NewMemberInfo(
                firstName = "鈴花",
                familyName = "富田",
                firstNameKana = "すずか",
                familyNameKana = "とみた",
                dateOfBirth = LocalDate.of(2001, 1, 18)
            ),
            NewMemberInfo(
                firstName = "好花",
                familyName = "松田",
                firstNameKana = "このか",
                familyNameKana = "まつだ",
                dateOfBirth = LocalDate.of(1999, 4, 27)
            ),
            NewMemberInfo(
                firstName = "明里",
                familyName = "丹生",
                firstNameKana = "あかり",
                familyNameKana = "にぶ",
                dateOfBirth = LocalDate.of(2001, 2, 15)
            ),
            NewMemberInfo(
                firstName = "美玖",
                familyName = "金村",
                firstNameKana = "みく",
                familyNameKana = "金村",
                dateOfBirth = LocalDate.of(2002, 9, 10)
            ),
            NewMemberInfo(
                firstName = "陽菜",
                familyName = "河田",
                firstNameKana = "ひな",
                familyNameKana = "かわた",
                dateOfBirth = LocalDate.of(2001, 7, 23)
            ),
            NewMemberInfo(
                firstName = "愛萌",
                familyName = "宮田",
                firstNameKana = "まなも",
                familyNameKana = "みやた",
                dateOfBirth = LocalDate.of(1998, 4, 28)
            ),
            NewMemberInfo(
                firstName = "ひより",
                familyName = "濱岸",
                firstNameKana = "ひより",
                familyNameKana = "はまぎし",
                dateOfBirth = LocalDate.of(2002, 9, 28)
            )
        )
    )
}

/** 3期生 */
val HINATAZAKA46_MEMBERS_GEN3 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2018, 8, 19),
        newMembers = listOf(
            NewMemberInfo(
                firstName = "茉莉",
                familyName = "森本",
                firstNameKana = "まりぃ",
                familyNameKana = "もりもと",
                dateOfBirth = LocalDate.of(2004, 2, 23)
            ),
            NewMemberInfo(
                firstName = "ひなの",
                familyName = "上村",
                firstNameKana = "ひなの",
                familyNameKana = "かみむら",
                dateOfBirth = LocalDate.of(2004, 4, 12)
            ),
            NewMemberInfo(
                firstName = "晴世",
                familyName = "山口",
                firstNameKana = "はるよ",
                familyNameKana = "やまぐち",
                dateOfBirth = LocalDate.of(2004, 2, 23)
            ),
        )
    )
}

/** 4期生 */
val HINATAZAKA46_MEMBERS_GEN4 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2022, 9, 21),
        newMembers = listOf(
            NewMemberInfo(
                firstName = "莉奈",
                familyName = "渡辺",
                firstNameKana = "りな",
                familyNameKana = "わたなべ",
                dateOfBirth = LocalDate.of(2009, 2, 7)
            ),
            NewMemberInfo(
                firstName = "夏菜実",
                familyName = "小西",
                firstNameKana = "かなみ",
                familyNameKana = "こにし",
                dateOfBirth = LocalDate.of(2004, 10, 3)
            ),
            NewMemberInfo(
                firstName = "理央",
                familyName = "清水",
                firstNameKana = "りお",
                familyNameKana = "しみず",
                dateOfBirth = LocalDate.of(2005, 1, 15)
            ),
            NewMemberInfo(
                firstName = "陽子",
                familyName = "正源司",
                firstNameKana = "ようこ",
                familyNameKana = "しょうげんじ",
                dateOfBirth = LocalDate.of(2007, 2, 14)
            ),
            NewMemberInfo(
                firstName = "帆夏",
                familyName = "岸",
                firstNameKana = "ほのか",
                familyNameKana = "きし",
                dateOfBirth = LocalDate.of(2004, 8, 15)
            ),
            NewMemberInfo(
                firstName = "葉留花",
                familyName = "山下",
                firstNameKana = "はるか",
                familyNameKana = "やました",
                dateOfBirth = LocalDate.of(2003, 5, 20)
            )
        )
    )
}

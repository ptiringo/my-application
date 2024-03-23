package com.example.my_application.initial_data.sakamichi

import com.example.my_application.application.sakamichi.*
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
            ),
            NewMember(
                firstName = "友梨奈",
                familyName = "平手",
                firstNameKana = "ゆりな",
                familyNameKana = "ひらて",
                dateOfBirth = LocalDate.of(2001, 6, 25)
            ),
            NewMember(
                firstName = "莉菜",
                familyName = "上村",
                firstNameKana = "りな",
                familyNameKana = "うえむら",
                dateOfBirth = LocalDate.of(1997, 1, 4)
            ),
            NewMember(
                firstName = "奈那",
                familyName = "織田",
                firstNameKana = "なな",
                familyNameKana = "おだ",
                dateOfBirth = LocalDate.of(1998, 6, 4)
            ),
            NewMember(
                firstName = "梨香",
                familyName = "尾関",
                firstNameKana = "りか",
                familyNameKana = "おぜき",
                dateOfBirth = LocalDate.of(1997, 10, 7)
            ),
            NewMember(
                firstName = "佑唯",
                familyName = "今泉",
                firstNameKana = "ゆい",
                familyNameKana = "いまいずみ",
                dateOfBirth = LocalDate.of(1998, 9, 30)
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
            ),
            NewMember(
                firstName = "茉里乃",
                familyName = "幸阪",
                firstNameKana = "まりの",
                familyNameKana = "こうさか",
                dateOfBirth = LocalDate.of(2002, 12, 19)
            ),
            NewMember(
                firstName = "梨名",
                familyName = "井上",
                firstNameKana = "りな",
                familyNameKana = "いのうえ",
                dateOfBirth = LocalDate.of(2001, 1, 29)
            ),
            NewMember(
                firstName = "唯衣",
                familyName = "武元",
                firstNameKana = "ゆい",
                familyNameKana = "たけもと",
                dateOfBirth = LocalDate.of(2002, 3, 23)
            ),
            NewMember(
                firstName = "里奈",
                familyName = "松田",
                firstNameKana = "りな",
                familyNameKana = "まつだ",
                dateOfBirth = LocalDate.of(1999, 10, 13)
            ),
            NewMember(
                firstName = "夏鈴",
                familyName = "藤吉",
                firstNameKana = "かりん",
                familyNameKana = "ふじよし",
                dateOfBirth = LocalDate.of(2001, 8, 29)
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
            ),
            NewMember(
                firstName = "愛季",
                familyName = "谷口",
                firstNameKana = "あいり",
                familyNameKana = "たにぐち",
                dateOfBirth = LocalDate.of(2005, 4, 12)
            ),
            NewMember(
                firstName = "美青",
                familyName = "的野",
                firstNameKana = "みお",
                familyNameKana = "まとの",
                dateOfBirth = LocalDate.of(2006, 11, 8)
            ),
            NewMember(
                firstName = "璃花",
                familyName = "石森",
                firstNameKana = "りか",
                familyNameKana = "いしもり",
                dateOfBirth = LocalDate.of(2002, 1, 13)
            ),
            NewMember(
                firstName = "理子",
                familyName = "遠藤",
                firstNameKana = "りこ",
                familyNameKana = "えんどう",
                dateOfBirth = LocalDate.of(2006, 1, 9)
            )
        )
    )
}

// シングルリリース

val START_OVER = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 6,
        title = "Start over!",
        releaseDate = LocalDate.of(2023, 6, 28)
    )
}

val SHOUNIN_YOKKYU = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 7,
        title = "承認欲求",
        releaseDate = LocalDate.of(2023, 10, 18)
    )
}

val IKUTSU_NO_KORONI_MODORITAINOKA = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 8,
        title = "何歳の頃に戻りたいのか",
        releaseDate = LocalDate.of(2024, 2, 21)
    )
}

// ライブ

val FOURTH_ARENA_TOUR_2024 = { groupId: Long ->
    HoldLiveCommand(
        groupId = groupId,
        title = "4th ARENA TOUR 2024 新・櫻前線 -Go on back?- IN 東京ドーム"
    )
}

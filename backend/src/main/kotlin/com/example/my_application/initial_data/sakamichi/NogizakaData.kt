package com.example.my_application.initial_data.sakamichi

import com.example.my_application.application.sakamichi.CreateNewGroupCommand
import com.example.my_application.application.sakamichi.JoinNewMembersCommand
import com.example.my_application.application.sakamichi.NewMember
import com.example.my_application.application.sakamichi.ReleaseNewSingleCommand
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
            ),
            NewMember(
                firstName = "麻衣",
                familyName = "白石",
                firstNameKana = "まい",
                familyNameKana = "しらいし",
                dateOfBirth = LocalDate.of(1992, 8, 20)
            ),
            NewMember(
                firstName = "まあや",
                familyName = "和田",
                firstNameKana = "まあや",
                familyNameKana = "わだ",
                dateOfBirth = LocalDate.of(1998, 4, 23)
            ),
            NewMember(
                firstName = "沙友理",
                familyName = "松村",
                firstNameKana = "さゆり",
                familyNameKana = "まつむら",
                dateOfBirth = LocalDate.of(1992, 8, 27)
            ),
            NewMember(
                firstName = "美彩",
                familyName = "衛藤",
                firstNameKana = "みさ",
                familyNameKana = "えとう",
                dateOfBirth = LocalDate.of(1993, 1, 4)
            ),
            NewMember(
                firstName = "花奈",
                familyName = "中田",
                firstNameKana = "かな",
                familyNameKana = "なかだ",
                dateOfBirth = LocalDate.of(1994, 8, 6)
            ),
            NewMember(
                firstName = "麻衣",
                familyName = "深川",
                firstNameKana = "まい",
                familyNameKana = "ふかがわ",
                dateOfBirth = LocalDate.of(1991, 3, 29)
            ),
            NewMember(
                firstName = "日芽香",
                familyName = "中元",
                firstNameKana = "ひめか",
                familyNameKana = "なかもと",
                dateOfBirth = LocalDate.of(1996, 4, 13)
            ),
            NewMember(
                firstName = "佑美",
                familyName = "若月",
                firstNameKana = "ゆみ",
                familyNameKana = "わかつき",
                dateOfBirth = LocalDate.of(1994, 6, 27)
            ),
            NewMember(
                firstName = "里奈",
                familyName = "生駒",
                firstNameKana = "りな",
                familyNameKana = "いこま",
                dateOfBirth = LocalDate.of(1995, 12, 29)
            ),
            NewMember(
                firstName = "優里",
                familyName = "斉藤",
                firstNameKana = "ゆうり",
                familyNameKana = "さいとう",
                dateOfBirth = LocalDate.of(1993, 7, 20)
            ),
            NewMember(
                firstName = "里菜",
                familyName = "大和",
                firstNameKana = "りな",
                familyNameKana = "やまと",
                dateOfBirth = LocalDate.of(1994, 12, 14)
            ),
            NewMember(
                firstName = "奈々未",
                familyName = "橋本",
                firstNameKana = "ななみ",
                familyNameKana = "はしもと",
                dateOfBirth = LocalDate.of(1993, 2, 20)
            ),
            NewMember(
                firstName = "一実",
                familyName = "高山",
                firstNameKana = "かずみ",
                familyNameKana = "たかやま",
                dateOfBirth = LocalDate.of(1994, 2, 8)
            ),
            NewMember(
                firstName = "真夏",
                familyName = "秋元",
                firstNameKana = "まなつ",
                familyNameKana = "あきもと",
                dateOfBirth = LocalDate.of(1993, 8, 20)
            ),
            NewMember(
                firstName = "小百合",
                familyName = "井上",
                firstNameKana = "さゆり",
                familyNameKana = "いのうえ",
                dateOfBirth = LocalDate.of(1994, 12, 14)
            ),
            NewMember(
                firstName = "万理華",
                familyName = "伊藤",
                firstNameKana = "まりか",
                familyNameKana = "いとう",
                dateOfBirth = LocalDate.of(1996, 2, 20)
            ),
            NewMember(
                firstName = "寧々",
                familyName = "伊藤",
                firstNameKana = "ねね",
                familyNameKana = "いとう",
                dateOfBirth = LocalDate.of(1995, 12, 12)
            ),
            NewMember(
                firstName = "成良",
                familyName = "宮澤",
                firstNameKana = "せいら",
                familyNameKana = "みやざわ",
                dateOfBirth = LocalDate.of(1993, 10, 29)
            ),
            NewMember(
                firstName = "玲香",
                familyName = "桜井",
                firstNameKana = "れいか",
                familyNameKana = "さくらい",
                dateOfBirth = LocalDate.of(1994, 5, 16)
            ),
            NewMember(
                firstName = "清羅",
                familyName = "畠中",
                firstNameKana = "せいら",
                familyNameKana = "はたなか",
                dateOfBirth = LocalDate.of(1995, 12, 5)
            ),
            NewMember(
                firstName = "日奈",
                familyName = "樋口",
                firstNameKana = "ひな",
                familyNameKana = "ひぐち",
                dateOfBirth = LocalDate.of(1998, 1, 31)
            ),
        )
    )


/** 2期生 */
val NOGIZAKA46_MEMBERS_GEN2 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2013, 3, 28),
        newMembers = listOf(
            NewMember(
                firstName = "相楽",
                familyName = "伊織",
                firstNameKana = "さがら",
                familyNameKana = "いおり",
                dateOfBirth = LocalDate.of(1997, 11, 26)
            ),
            NewMember(
                firstName = "純奈",
                familyName = "伊藤",
                firstNameKana = "じゅんな",
                familyNameKana = "いとう",
                dateOfBirth = LocalDate.of(1998, 11, 30)
            ),
            NewMember(
                firstName = "絢音",
                familyName = "鈴木",
                firstNameKana = "あやね",
                familyNameKana = "すずき",
                dateOfBirth = LocalDate.of(1999, 3, 5)
            ),
            NewMember(
                firstName = "かりん",
                familyName = "伊藤",
                firstNameKana = "かりん",
                familyNameKana = "いとう",
                dateOfBirth = LocalDate.of(1993, 5, 26)
            ),
            NewMember(
                firstName = "怜奈",
                familyName = "山崎",
                firstNameKana = "れな",
                familyNameKana = "やまざき",
                dateOfBirth = LocalDate.of(1997, 5, 21)
            ),
            NewMember(
                firstName = "未央奈",
                familyName = "堀",
                firstNameKana = "みおな",
                familyNameKana = "ほり",
                dateOfBirth = LocalDate.of(1996, 10, 15)
            ),
            NewMember(
                firstName = "日奈子",
                familyName = "北野",
                firstNameKana = "ひなこ",
                familyNameKana = "きたの",
                dateOfBirth = LocalDate.of(1996, 7, 17)
            ),
            NewMember(
                firstName = "里沙子",
                familyName = "矢田",
                firstNameKana = "りさこ",
                familyNameKana = "やだ",
                dateOfBirth = LocalDate.of(1995, 3, 8)
            )
        )
    )
}

/** 3期生 */
val NOGIZAKA46_MEMBERS_GEN3 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
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
            ),
            NewMember(
                firstName = "蓮加",
                familyName = "岩本",
                firstNameKana = "れんか",
                familyNameKana = "いわもと",
                dateOfBirth = LocalDate.of(2004, 2, 2)
            ),
            NewMember(
                firstName = "美月",
                familyName = "山下",
                firstNameKana = "みづき",
                familyNameKana = "やました",
                dateOfBirth = LocalDate.of(1999, 7, 26)
            ),
            NewMember(
                firstName = "綾乃",
                familyName = "吉田",
                firstNameKana = "あやの",
                familyNameKana = "よしだ",
                middleName = "クリスティー",
                dateOfBirth = LocalDate.of(1995, 9, 6)
            ),
            NewMember(
                firstName = "美波",
                familyName = "梅澤",
                firstNameKana = "みなみ",
                familyNameKana = "うめざわ",
                dateOfBirth = LocalDate.of(1999, 1, 6)
            ),
            NewMember(
                firstName = "麗乃",
                familyName = "中村",
                firstNameKana = "れの",
                familyNameKana = "なかむら",
                dateOfBirth = LocalDate.of(2001, 9, 27)
            ),
            NewMember(
                firstName = "珠美",
                familyName = "阪口",
                firstNameKana = "たまみ",
                familyNameKana = "さかぐち",
                dateOfBirth = LocalDate.of(2001, 11, 10)
            ),
            NewMember(
                firstName = "楓",
                familyName = "佐藤",
                firstNameKana = "かえで",
                familyNameKana = "さとう",
                dateOfBirth = LocalDate.of(1998, 3, 23)
            ),
        )
    )
}


/** 4期生 */
val NOGIZAKA46_MEMBERS_GEN4 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2018, 11, 29),
        newMembers = listOf(
            NewMember(
                firstName = "紗耶",
                familyName = "金川",
                firstNameKana = "さや",
                familyNameKana = "かながわ",
                dateOfBirth = LocalDate.of(2001, 10, 31)
            ),
            NewMember(
                firstName = "沙耶香",
                familyName = "掛橋",
                firstNameKana = "さやか",
                familyNameKana = "かけはし",
                dateOfBirth = LocalDate.of(2002, 11, 20)
            ),
            NewMember(
                firstName = "さくら",
                familyName = "遠藤",
                firstNameKana = "さくら",
                familyNameKana = "えんどう",
                dateOfBirth = LocalDate.of(2001, 10, 3)
            ),
            NewMember(
                firstName = "奈於",
                familyName = "弓木",
                firstNameKana = "なお",
                familyNameKana = "ゆみき",
                dateOfBirth = LocalDate.of(1999, 2, 3)
            ),
            NewMember(
                firstName = "明香",
                familyName = "黒見",
                firstNameKana = "はるか",
                familyNameKana = "くろみ",
                dateOfBirth = LocalDate.of(2004, 1, 19)
            ),
            NewMember(
                firstName = "美佑",
                familyName = "松尾",
                firstNameKana = "みゆ",
                familyNameKana = "まつお",
                dateOfBirth = LocalDate.of(2004, 1, 3)
            ),
            NewMember(
                firstName = "璃果",
                familyName = "佐藤",
                firstNameKana = "りか",
                familyNameKana = "さとう",
                dateOfBirth = LocalDate.of(2001, 8, 9)
            ),
            NewMember(
                firstName = "あやめ",
                familyName = "筒井",
                firstNameKana = "あやめ",
                familyNameKana = "つつい",
                dateOfBirth = LocalDate.of(2004, 6, 8)
            ),
            NewMember(
                firstName = "レイ",
                familyName = "清宮",
                firstNameKana = "れい",
                familyNameKana = "せいみや",
                dateOfBirth = LocalDate.of(2003, 8, 1)
            ),
        )
    )
}

/** 5期生 */
val NOGIZAKA46_MEMBERS_GEN5 = { groupId: Long ->
    JoinNewMembersCommand(
        groupId = groupId,
        joinDate = LocalDate.of(2022, 2, 1),
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
            ),
            NewMember(
                firstName = "美空",
                familyName = "一ノ瀬",
                firstNameKana = "みく",
                familyNameKana = "いちのせ",
                dateOfBirth = LocalDate.of(2003, 5, 24)
            ),
            NewMember(
                firstName = "茉央",
                familyName = "五百城",
                firstNameKana = "まお",
                familyNameKana = "いおき",
                dateOfBirth = LocalDate.of(2005, 7, 29)
            ),
            NewMember(
                firstName = "咲月",
                familyName = "菅原",
                firstNameKana = "さつき",
                familyNameKana = "すがわら",
                dateOfBirth = LocalDate.of(2005, 10, 31)
            ),
            NewMember(
                firstName = "奈央",
                familyName = "冨里",
                firstNameKana = "なお",
                familyNameKana = "とみさと",
                dateOfBirth = LocalDate.of(2006, 9, 18)
            ),
            NewMember(
                firstName = "いろは",
                familyName = "奥田",
                firstNameKana = "いろは",
                familyNameKana = "おくだ",
                dateOfBirth = LocalDate.of(2005, 8, 20)
            )
        )
    )
}

val BARRETTA = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 7,
        title = "バレッタ",
        releaseDate = LocalDate.of(2013, 11, 27)
    )
}

val SING_OUT = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 23,
        title = "Sing Out!",
        releaseDate = LocalDate.of(2019, 5, 29)
    )
}

/** しあわせの保護色 */
val SHIAWASE_NO_HOGOSHOKU = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 25,
        title = "しあわせの保護色",
        releaseDate = LocalDate.of(2020, 3, 25)
    )
}

/** Monopoly **/
val MONOPOLY = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 35,
        title = "Monopoly",
        releaseDate = LocalDate.of(2023, 12, 6)
    )
}

/** チャンスは平等 **/
val CHANCE_HA_BYOUDOU = { groupId: Long ->
    ReleaseNewSingleCommand(
        groupId = groupId,
        number = 35,
        title = "チャンスは平等",
        releaseDate = LocalDate.of(2024, 4, 10)
    )
}

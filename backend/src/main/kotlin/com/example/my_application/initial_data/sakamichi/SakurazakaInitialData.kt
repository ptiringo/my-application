package com.example.my_application.initial_data.sakamichi

import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.member.BecomingSakuraMember
import com.example.my_application.domain.sakamichi.member.Name
import com.example.my_application.domain.sakamichi.member.SakurazakaMember
import java.time.LocalDate

val SAKURAZAKA46 = Group(name = "櫻坂46")

/** 1期生 */
val SAKURAZAKA_MEMBERS_1st: List<SakurazakaMember> = listOf(
    SakurazakaMember(
        Name("友香", "菅井", "ゆうか", "すがい"),
        LocalDate.of(1995, 11, 29),
        BecomingSakuraMember.FIRST
    ).apply {
        graduate()
    },
    SakurazakaMember(
        Name("葵", "原田", "あおい", "はらだ"),
        LocalDate.of(2000, 5, 7),
        BecomingSakuraMember.FIRST
    ).apply {
        graduate()
    },
    SakurazakaMember(
        Name("冬優花", "齋藤", "ふゆか", "さいとう"),
        LocalDate.of(1998, 2, 15),
        BecomingSakuraMember.FIRST
    ),
    SakurazakaMember(
        Name("由依", "小林", "ゆい", "こばやし"),
        LocalDate.of(1999, 10, 23),
        BecomingSakuraMember.FIRST
    ),
)

/** 2期生 */
val SAKURAZAKA_MEMBERS_2nd: List<SakurazakaMember> = listOf(
    SakurazakaMember(
        Name("光莉", "遠藤", "ひかり", "えんどう"),
        LocalDate.of(1999, 4, 17),
        BecomingSakuraMember.NEW_SECOND
    ).apply {
        takeLeaveOfAbsence(LocalDate.of(2021, 9, 6))
        comeBack(LocalDate.of(2021, 12, 8))
        takeLeaveOfAbsence(LocalDate.of(2023, 4, 19))
    },
)

val TAMURA_HONO = SakurazakaMember(
    Name("保乃", "田村", "ほの", "たむら"),
    LocalDate.of(1998, 10, 21),
    BecomingSakuraMember.SECOND
)

/** 3期生 */
val SAKURAZAKA_MEMBERS_3rd: List<SakurazakaMember> = listOf(
    SakurazakaMember(
        Name("麗奈", "小田倉", "おだくら", "れいな"),
        LocalDate.of(2004, 7, 25),
        BecomingSakuraMember.THIRD
    ),
    SakurazakaMember(
        Name("凪紗", "小島", "なぎさ", "こじま"),
        LocalDate.of(2005, 7, 7),
        BecomingSakuraMember.THIRD
    ),
)

val MURAYAMA_MIU = SakurazakaMember(
    Name("美羽", "村山", "みう", "むらやま"),
    LocalDate.of(2005, 2, 15),
    BecomingSakuraMember.THIRD
)

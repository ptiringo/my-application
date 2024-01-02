package com.example.my_application.initial_data.sakamichi

import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.member.BecomingHinataMember
import com.example.my_application.domain.sakamichi.member.HinatazakaMember
import com.example.my_application.domain.sakamichi.member.Name
import java.time.LocalDate

val HINATAZAKA46 = Group(name = "日向坂46")

/** 1期生 */
val HINATAZAKA_MEMBERS_1st = listOf(
    HinatazakaMember(
        Name("史帆", "加藤", "しほ", "かとう"),
        LocalDate.of(1998, 2, 22),
        BecomingHinataMember.FIRST
    ),
    HinatazakaMember(
        Name("久美", "佐々木", "くみ", "ささき"),
        LocalDate.of(1996, 1, 22),
        BecomingHinataMember.FIRST
    ),
    HinatazakaMember(
        Name("京子", "斉藤", "きょうこ", "さいとう"),
        LocalDate.of(1997, 9, 5),
        BecomingHinataMember.FIRST
    ),
)

/** 2期生 */
val HINATAZAKA_MEMBERS_2nd = listOf(
    HinatazakaMember(
        Name("菜緒", "小坂", "なお", "こさか"),
        LocalDate.of(2002, 9, 7),
        BecomingHinataMember.SECOND
    ),
    HinatazakaMember(
        Name("鈴花", "富田", "すずか", "とみた"),
        LocalDate.of(2001, 1, 18),
        BecomingHinataMember.SECOND
    ),
    HinatazakaMember(
        Name("好花", "松田", "このか", "まつだ"),
        LocalDate.of(1999, 4, 27),
        BecomingHinataMember.SECOND
    ),
)

val NIBU_AKARI = HinatazakaMember(
    Name("明里", "丹生", "あかり", "にぶ"),
    LocalDate.of(2001, 2, 15),
    BecomingHinataMember.SECOND
)

/** 3期生 */
val HINATAZAKA_MEMBERS_3rd = listOf(
    HinatazakaMember(
        Name("茉莉", "森本", "まりぃ", "もりもと"),
        LocalDate.of(2004, 2, 23),
        BecomingHinataMember.THIRD
    ),
)

/** 4期生 */
val HINATAZAKA_MEMBERS_4th = listOf(
    HinatazakaMember(
        Name("莉奈", "渡辺", "りな", "わたなべ"),
        LocalDate.of(2009, 2, 7),
        BecomingHinataMember.FOURTH
    ),
)

val KONISHI_KANAMI = HinatazakaMember(
    Name("夏菜実", "小西", "かなみ", "こにし"),
    LocalDate.of(2004, 10, 3),
    BecomingHinataMember.FOURTH
)

val SHIMIZU_RIO = HinatazakaMember(
    Name("理央", "清水", "りお", "しみず"),
    LocalDate.of(2005, 1, 15),
    BecomingHinataMember.FOURTH
)

package com.example.my_application.initial_data.sakamichi

import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.member.BecomingNogizakaMember
import com.example.my_application.domain.sakamichi.member.Name
import com.example.my_application.domain.sakamichi.member.NogizakaMember
import java.time.LocalDate

val NOGIZAKA46 = Group(name = "乃木坂46")

/** 1期生 */
val NOGIZAKA_MEMBERS_1st = listOf(
    NogizakaMember(
        Name("飛鳥", "齋藤", "あすか", "さいとう"),
        LocalDate.of(1998, 8, 10),
        BecomingNogizakaMember.FIRST
    ).apply {
        graduate()
    },
    NogizakaMember(
        Name("七瀬", "西野", "ななせ", "にしの"),
        LocalDate.of(1994, 5, 25),
        BecomingNogizakaMember.FIRST
    ).apply {
        graduate()
    },
)

/** 3期生 */
val NOGIZAKA_MEMBERS_3rd = listOf(
    NogizakaMember(
        Name("葉月", "向井", "はづき", "むかい"),
        LocalDate.of(1999, 8, 23),
        BecomingNogizakaMember.THIRD
    ),
    NogizakaMember(
        Name("祐希", "与田", "ゆうき", "よだ"),
        LocalDate.of(2000, 5, 5),
        BecomingNogizakaMember.THIRD
    ),
)

val KUBO_SHIORI = NogizakaMember(
    Name("史緒里", "久保", "しおり", "くぼ"),
    LocalDate.of(2001, 7, 14),
    BecomingNogizakaMember.THIRD
)


/** 4期生 */
val KANAGAWA_SAYA = NogizakaMember(
    name = Name("紗耶", "かながわ", "さや", "かながわ"),
    dateOfBirth = LocalDate.of(2001, 10, 31),
    becomingMember = BecomingNogizakaMember.FOURTH
)

/** 5期生 */
val NOGIZAKA_MEMBERS_5th = listOf(
    NogizakaMember(
        Name("彩", "小川", "あや", "おがわ"),
        LocalDate.of(2007, 6, 27),
        BecomingNogizakaMember.FIFTH
    ),
    NogizakaMember(
        Name("桜", "川﨑", "さくら", "かわさき"),
        LocalDate.of(2003, 4, 17),
        BecomingNogizakaMember.FIFTH
    ),
    NogizakaMember(
        Name("姫奈", "岡本", "ひな", "おかもと"),
        LocalDate.of(2003, 12, 17),
        BecomingNogizakaMember.FIFTH
    ),
    NogizakaMember(
        Name("瑛紗", "池田", "てれさ", "いけだ"),
        LocalDate.of(2002, 5, 12),
        BecomingNogizakaMember.FIFTH
    ),
    NogizakaMember(
        Name("和", "井上", "なぎ", "いのうえ"),
        LocalDate.of(2005, 2, 17),
        BecomingNogizakaMember.FIFTH
    ),
    NogizakaMember(
        name = Name("アルノ", "中西", "あるの", "なかにし"),
        dateOfBirth = LocalDate.of(2003, 3, 17),
        becomingMember = BecomingNogizakaMember.FIFTH
    )
)

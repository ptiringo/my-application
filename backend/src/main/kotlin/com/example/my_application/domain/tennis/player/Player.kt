package com.example.my_application.domain.tennis.player

import com.example.my_application.domain.tennis.Country
import java.time.LocalDate
import javax.persistence.*

/** プレイヤー */
@Entity
class Player(
    /** 名前 */
    @Column(nullable = false)
    val firstName: String,

    /** 苗字 */
    @Column(nullable = false)
    val familyName: String,

    /** 生年月日 */
    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    /** 国籍 */
    @Enumerated(EnumType.STRING)
    val country: Country,

    /** 利き手 */
    @Enumerated(EnumType.STRING)
    val dominantHand: DominantHand,

    /** バックハンドスタイル */
    @Enumerated(EnumType.STRING)
    val backhandStyle: BackhandStyle
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

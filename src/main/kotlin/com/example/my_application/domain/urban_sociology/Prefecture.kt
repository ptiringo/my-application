package com.example.my_application.domain.urban_sociology

import javax.persistence.*

/** 都道府県 */
@Entity
class Prefecture(
    @Column(nullable = false)
    val name: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val type: PrefectureType,

    @Id
    @GeneratedValue
    val id: Long = 0
)

/** 都道府県種類 */
enum class PrefectureType {
    /** 都 */
    TO,

    /** 道 */
    DOU,

    /** 府 */
    FU,

    /** 県 */
    KEN
}

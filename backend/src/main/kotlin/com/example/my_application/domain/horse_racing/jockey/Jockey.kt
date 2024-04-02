package com.example.my_application.domain.horse_racing.jockey

import org.hibernate.annotations.Comment
import javax.persistence.*

@Entity
class Jockey(
    @Embedded
    val name: Name,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

@Embeddable
data class Name(
    /** 名前（かな） */
    @Comment("名前（かな）")
    @Column(nullable = false, length = 30)
    val firstNameKana: String,

    /** 名字（かな） */
    @Comment("名字（かな）")
    @Column(nullable = false, length = 30)
    val familyNameKana: String,

    /** 名前（漢字） */
    @Comment("名前（漢字）")
    @Column(nullable = true, length = 30)
    val firstNameKanji: String? = null,

    /** 名字（漢字） */
    @Comment("名字（漢字）")
    @Column(nullable = true, length = 30)
    val familyNameKanji: String? = null,

    /** 名前（英字） */
    @Comment("名前（英字）")
    @Column(nullable = true, length = 30)
    val firstNameAlphabet: String? = null,

    /** 名字（英字） */
    @Comment("名字（英字）")
    @Column(nullable = true, length = 30)
    val familyNameAlphabet: String? = null,
)

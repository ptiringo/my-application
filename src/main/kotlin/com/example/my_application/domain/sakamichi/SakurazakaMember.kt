package com.example.my_application.domain.sakamichi

import org.hibernate.annotations.Comment
import javax.persistence.*

@Entity
class SakurazakaMember(
    name: Name,

    @Enumerated(EnumType.STRING)
    @Comment("期")
    val becomingMember: BecomingSakuraMember

) : Member(name = name)

/** 期 */
enum class BecomingSakuraMember {
    FIRST, SECOND, NEW_SECOND, THIRD
}
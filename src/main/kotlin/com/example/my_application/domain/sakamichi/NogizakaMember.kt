package com.example.my_application.domain.sakamichi

import org.hibernate.annotations.Comment
import javax.persistence.*

@Entity
class NogizakaMember(
    name: Name,

    @Enumerated(EnumType.STRING)
    @Comment("期")
    @Column(nullable = false, length = 20)
    val becomingMember: BecomingNogizakaMember

) : Member(name = name)

/** 期 */
enum class BecomingNogizakaMember {
    FIRST, SECOND, THIRD, FOURTH, NEW_FOURTH,

    /** 5期 */
    FIFTH
}

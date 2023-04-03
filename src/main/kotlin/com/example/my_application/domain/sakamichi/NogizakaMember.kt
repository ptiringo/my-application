package com.example.my_application.domain.sakamichi

import org.hibernate.annotations.Comment
import java.time.LocalDate
import javax.persistence.*

@Entity
class NogizakaMember(
    name: Name,

    dateOfBirth: LocalDate,

    @Enumerated(EnumType.STRING)
    @Comment("期")
    @Column(nullable = false)
    val becomingMember: BecomingNogizakaMember

) : Member(name = name, dateOfBirth = dateOfBirth)

/** 期 */
enum class BecomingNogizakaMember {
    FIRST, SECOND, THIRD, FOURTH, NEW_FOURTH,

    /** 5期 */
    FIFTH
}

package com.example.my_application.domain.sakamichi

import org.hibernate.annotations.Comment
import java.time.LocalDate
import javax.persistence.*

@Entity
class SakurazakaMember(
    name: Name,

    dateOfBirth: LocalDate,

    @Enumerated(EnumType.STRING)
    @Comment("期")
    @Column(nullable = false)
    val becomingMember: BecomingSakuraMember

) : Member(name = name, dateOfBirth = dateOfBirth)

/** 期 */
enum class BecomingSakuraMember {
    FIRST, SECOND, NEW_SECOND, THIRD
}

package com.example.my_application.domain.sakamichi.member

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class SakurazakaMember(
    name: Name,

    dateOfBirth: LocalDate,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val becomingMember: BecomingSakuraMember

) : Member(name = name, dateOfBirth = dateOfBirth)

/** 期 */
enum class BecomingSakuraMember {
    FIRST, SECOND, NEW_SECOND, THIRD
}

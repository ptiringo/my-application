package com.example.my_application.domain.sakamichi

import java.time.LocalDate
import javax.persistence.*

@Entity
class HinatazakaMember(
    name: Name,

    dateOfBirth: LocalDate,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val becomingMember: BecomingHinataMember

) : Member(name = name, dateOfBirth = dateOfBirth)

/** 期 */
enum class BecomingHinataMember {
    FIRST, SECOND, THIRD, NEW_THIRD, FOURTH
}

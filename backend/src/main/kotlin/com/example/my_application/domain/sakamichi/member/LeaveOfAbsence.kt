package com.example.my_application.domain.sakamichi.member

import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

/** 活動休止 */
@Entity
class LeaveOfAbsence(
    @EmbeddedId
    val leaveOfAbsenceId: LeaveOfAbsenceId,

    var endAt: LocalDate? = null
) {
    constructor(member: Member, startAt: LocalDate, endAt: LocalDate? = null) : this(
        LeaveOfAbsenceId(
            member,
            startAt
        ), endAt
    )
}

@Embeddable
data class LeaveOfAbsenceId(

    @ManyToOne(optional = false)
    val member: Member,

    @Column(nullable = false)
    val startAt: LocalDate

) : Serializable

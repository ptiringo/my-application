package com.example.my_application.domain.sakamichi.member

import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

/** 活動休止 */
@Entity
class BreakOfActivity(
    member: Member,
    startAt: LocalDate
) {
    @EmbeddedId
    val breakOfActivityId: BreakOfActivityId = BreakOfActivityId(member = member, startAt = startAt)

    @OneToOne
    var returnToActivity: ReturnToActivity? = null
}

@Embeddable
data class BreakOfActivityId(

    @ManyToOne(optional = false)
    val member: Member,

    @Column(nullable = false)
    val startAt: LocalDate

) : Serializable

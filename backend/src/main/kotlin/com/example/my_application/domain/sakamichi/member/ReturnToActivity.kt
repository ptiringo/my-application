package com.example.my_application.domain.sakamichi.member

import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

/** 活動再開 */
@Entity
class ReturnToActivity(
    breakOfActivity: BreakOfActivity,
    resumptionDate: LocalDate
) {
    @EmbeddedId
    val breakOfActivityId: ReturnToActivityId =
        ReturnToActivityId(breakOfActivity = breakOfActivity, resumptionDate = resumptionDate)
}

@Embeddable
data class ReturnToActivityId(

    @OneToOne(optional = false)
    val breakOfActivity: BreakOfActivity,

    @Column(nullable = false)
    val resumptionDate: LocalDate

) : Serializable

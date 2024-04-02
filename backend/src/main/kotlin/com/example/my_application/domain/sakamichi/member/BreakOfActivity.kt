package com.example.my_application.domain.sakamichi.member

import java.time.LocalDate
import javax.persistence.*

/** 活動休止 */
@Entity
class BreakOfActivity(

    @ManyToOne(optional = false)
    val member: Member,

    /** 活動休止開始日 */
    @Column(nullable = false)
    val startedDate: LocalDate,
) {
    @Id
    @GeneratedValue
    val id: Long = 0

    @OneToOne(
        optional = true,
        fetch = FetchType.EAGER,
        mappedBy = "breakOfActivity",
        cascade = [CascadeType.ALL]
    )
    var returnToActivity: ReturnToActivity? = null
}

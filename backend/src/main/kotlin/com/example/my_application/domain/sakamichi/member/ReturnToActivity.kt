package com.example.my_application.domain.sakamichi.member

import java.time.LocalDate
import javax.persistence.*

/** 活動再開 */
@Entity
class ReturnToActivity(

    @OneToOne(optional = false)
    val breakOfActivity: BreakOfActivity,

    /** 活動再開日 */
    @Column(nullable = false)
    val returnedDate: LocalDate,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

package com.example.my_application.domain.sakamichi.live

import java.time.LocalDate
import java.time.LocalTime
import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/** ライブスケジュール */
@Entity
class LiveSchedule(
    /** 日付 */
    val date: LocalDate,

    /** 会場 */
    @ElementCollection
    val venue: Set<String>,

    /** 開場時刻 */
    val openAt: LocalTime,

    /** 開演時刻 */
    val startAt: LocalTime,

    /** メンバー */
    @ManyToOne(optional = false)
    val live: Live,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}


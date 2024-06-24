package com.example.my_application.domain.sakamichi.live

import com.example.my_application.domain.sakamichi.group.Group
import java.time.LocalDate
import java.time.LocalTime
import javax.persistence.*

/** ライブ */
@Entity
class Live(

    /** グループ */
    @ManyToOne(
        cascade = [],
        fetch = FetchType.LAZY,
        optional = false
    )
    @JoinColumn(name = "group_id")
    val group: Group,

    /** 公演名 */
    val title: String,
) {
    /** ライブスケジュール */
    @OneToMany(
        cascade = [CascadeType.ALL],
        fetch = FetchType.EAGER,
        mappedBy = "live"
    )
    val schedules: MutableList<LiveSchedule> = arrayListOf()

    @Id
    @GeneratedValue
    val id: Long = 0

    /** ライブスケジュールを追加する */
    fun addSchedule(
        date: LocalDate,
        venue: Set<String>,
        openAt: LocalTime,
        startAt: LocalTime
    ) {
        this.schedules.add(
            LiveSchedule(
                date = date,
                venue = venue,
                openAt = openAt,
                startAt = startAt,
                live = this
            )
        )
    }
}

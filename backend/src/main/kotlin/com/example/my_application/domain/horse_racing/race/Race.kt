package com.example.my_application.domain.horse_racing.race

import com.example.my_application.domain.horse_racing.TrackSurface
import com.example.my_application.domain.horse_racing.racecourse.Racecourse
import javax.persistence.*

/** レース */
@Entity
class Race(
    /** レース名 */
    @Column(nullable = false)
    val name: String,

    /** グレード */
    @Enumerated(EnumType.STRING)
    val grade: Grade,

    /** 開催競馬場 */
    @ManyToOne(fetch = FetchType.EAGER)
    val racecourse: Racecourse,

    /** 馬場（表面素材） */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val trackSurface: TrackSurface,

    /** 距離 */
    @Column(nullable = false)
    val distance: Int,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

/** グレード */
enum class Grade {
    /** G1 */
    G1,

    /** G2 */
    G2,

    /** G3 */
    G3
}

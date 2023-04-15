package com.example.my_application.domain.horse_racing

import javax.persistence.*

@Entity
class Race(
    @Column(nullable = false)
    val name: String,

    @Enumerated(EnumType.STRING)
    val grade: Grade,

    @ManyToOne(fetch = FetchType.EAGER)
    val racecourse: Racecourse,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val trackSurface: TrackSurface,

    @Column(nullable = false)
    val distance: Int,

    @Id
    @GeneratedValue
    val id: Long = 0,
)

enum class Grade {
    G1, G2, G3
}

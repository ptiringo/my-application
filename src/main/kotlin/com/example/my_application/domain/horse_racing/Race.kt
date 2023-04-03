package com.example.my_application.domain.horse_racing

import javax.persistence.*

@Entity
class Race(
    @Id
    @GeneratedValue
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,

    @ManyToOne(fetch = FetchType.EAGER)
    val racecourse: Racecourse,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val trackSurface: TrackSurface,

    @Column(nullable = false)
    val distance: Int
)

package com.example.my_application.domain.tennis

import javax.persistence.*

/** 大会 */
@Entity
class Tournament(

    /** 大会名 */
    @Column(nullable = false)
    val name: String,

    /** 開催地 */
    @Column(nullable = false)
    val location: String,

    @Enumerated(EnumType.STRING)
    val tournamentCategory: TournamentCategory,

    @Enumerated(EnumType.STRING)
    val tennisSurface: TennisSurface,

    @Id
    @GeneratedValue
    val id: Long = 0
)

enum class TournamentCategory {
    GRAND_SLAM,
    ATP_FINALS,
    ATP_TOUR_MASTERS_1000,
    ATP_TOUR_500,
    ATP_TOUR_250,
    ATP_CHALLENGER_TOUR
}

enum class TennisSurface {
    HARD,
    CLAY,
    GRASS
}

package com.example.my_application.domain.tennis.tournament

import com.example.my_application.domain.tennis.held_tournament.HeldTournament
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

    /** 大会カテゴリ */
    @Enumerated(EnumType.STRING)
    val tournamentCategory: TournamentCategory,

    /** サーフェス */
    @Enumerated(EnumType.STRING)
    val tennisSurface: TennisSurface,

    /** 開催された大会 */
    @OneToMany(mappedBy = "tournament", cascade = [], fetch = FetchType.LAZY)
    val heldTournaments: MutableSet<HeldTournament> = mutableSetOf(),
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

/** 大会カテゴリ */
enum class TournamentCategory {
    /** グランドスラム */
    GRAND_SLAM,

    /** ATPファイナルズ */
    ATP_FINALS,

    /** ATPツアーマスターズ1000 */
    ATP_TOUR_MASTERS_1000,

    /** ATPツアー500 */
    ATP_TOUR_500,

    /** ATPツアー250 */
    ATP_TOUR_250,
    
    ATP_CHALLENGER_TOUR,
}

/** サーフェス */
enum class TennisSurface {
    HARD,
    CLAY,
    GRASS
}

package com.example.my_application.domain.tennis.held_tournament

import com.example.my_application.domain.tennis.tournament.Tournament
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/** 開催された大会 */
@Entity
class HeldTournament(

    /** 大会 */
    @ManyToOne
    val tournament: Tournament,

    val startDate: LocalDate,
    
    val endDate: LocalDate,

    @Id
    @GeneratedValue
    val id: Long = 0
)

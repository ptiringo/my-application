package com.example.my_application.domain.horse_racing.horse

import javax.persistence.*

/** 競走馬 */
@Entity
class Racehorse(
    @OneToOne
    @MapsId
    @JoinColumn(name = "horse_id", nullable = false)
    val horse: Horse,
) {
    @Id
    @GeneratedValue
    val id: Long = 0

    init {
        this.horse.racehorse = this
    }
}

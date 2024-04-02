package com.example.my_application.domain.horse_racing.horse

import javax.persistence.*

/** 種牡馬 */
@Entity
class Stallion(
    @OneToOne
    @MapsId
    @JoinColumn(name = "horse_id", nullable = false)
    val horse: Horse,
) {
    @Id
    @GeneratedValue
    val id: Long = 0

    init {
        this.horse.stallion = this
    }
}

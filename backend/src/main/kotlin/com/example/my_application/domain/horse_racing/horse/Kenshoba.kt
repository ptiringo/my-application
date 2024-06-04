package com.example.my_application.domain.horse_racing.horse

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.MapsId
import javax.persistence.OneToOne

/** 顕彰馬 */
@Entity
class Kenshoba(
    @OneToOne
    @MapsId
    @JoinColumn(name = "horse_id", nullable = false)
    val horse: Horse,

    @Column(nullable = false)
    val selectedYear: Int
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

package com.example.my_application.domain.horse_racing.horse

import java.time.LocalDate
import javax.persistence.*

/** 馬 */
@Entity
class Horse(

    /** 馬名 */
    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    @OneToOne(mappedBy = "horse", cascade = [CascadeType.ALL])
    @JoinColumn(nullable = true)
    @PrimaryKeyJoinColumn
    var racehorse: Racehorse? = null,

    @OneToOne(mappedBy = "horse", cascade = [CascadeType.ALL])
    @JoinColumn(nullable = true)
    @PrimaryKeyJoinColumn
    var stallion: Stallion? = null
) {
    @OneToOne(mappedBy = "horse", cascade = [CascadeType.ALL])
    @JoinColumn(nullable = true)
    @PrimaryKeyJoinColumn
    var kenshoba: Kenshoba? = null

    @Id
    @GeneratedValue
    val id: Long = 0

    /** 年齢 */
    val age get() = LocalDate.now().year - this.dateOfBirth.year

    /** 顕彰場として選出される */
    fun selectedAsKenshoba(year: Int) {
        this.kenshoba = Kenshoba(this, year)
    }
}

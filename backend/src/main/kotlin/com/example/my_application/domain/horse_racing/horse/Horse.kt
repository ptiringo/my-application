package com.example.my_application.domain.horse_racing.horse

import java.time.LocalDate
import javax.persistence.*

/** 馬 */
@Entity
class Horse(
    @Id
    @GeneratedValue
    val id: Long = 0,

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
    val age get() = LocalDate.now().year - dateOfBirth.year
}

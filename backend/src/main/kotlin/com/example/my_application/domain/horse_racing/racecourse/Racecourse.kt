package com.example.my_application.domain.horse_racing.racecourse

import com.example.my_application.domain.horse_racing.Country
import javax.persistence.*

/** 競馬場 */
@Entity
class Racecourse(
    /** 競馬場名 */
    @Column(nullable = false)
    val name: String,

    /** 国 */
    @Enumerated(EnumType.STRING)
    val country: Country,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

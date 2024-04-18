package com.example.my_application.domain.tennis.player

import com.example.my_application.domain.tennis.Country
import java.time.LocalDate
import javax.persistence.*

@Entity
class Player(
    @Column(nullable = false)
    val firstName: String,

    @Column(nullable = false)
    val familyName: String,

    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    @Enumerated(EnumType.STRING)
    val country: Country,

    @Enumerated(EnumType.STRING)
    val dominantHand: DominantHand,

    @Enumerated(EnumType.STRING)
    val backhandStyle: BackhandStyle
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

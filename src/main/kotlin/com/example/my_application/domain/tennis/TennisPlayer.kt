package com.example.my_application.domain.tennis

import java.time.LocalDate
import javax.persistence.*

@Entity
class TennisPlayer(
    @Column(nullable = false)
    val firstName: String,

    @Column(nullable = false)
    val familyName: String,

    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    @Enumerated(EnumType.STRING)
    val country: Country,

    @Id
    @GeneratedValue
    val id: Long = 0
)

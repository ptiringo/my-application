package com.example.my_application.domain.horse_racing.racecourse

import com.example.my_application.domain.horse_racing.Country
import javax.persistence.*

@Entity
class Racecourse(
    @Column(nullable = false)
    val name: String,

    @Enumerated(EnumType.STRING)
    val country: Country,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

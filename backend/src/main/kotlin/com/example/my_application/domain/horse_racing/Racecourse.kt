package com.example.my_application.domain.horse_racing

import javax.persistence.*

@Entity
class Racecourse(
    @Column(nullable = false)
    val name: String,

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    val country: Country,

    @Id
    @GeneratedValue
    val id: Long = 0
)

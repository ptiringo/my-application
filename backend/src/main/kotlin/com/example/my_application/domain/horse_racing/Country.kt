package com.example.my_application.domain.horse_racing

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Country(
    @Column(nullable = false)
    val name: String,

    @Id
    @GeneratedValue
    val id: Long = 0
)

package com.example.my_application.domain.horse_racing

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Race(
    @Id
    @GeneratedValue
    val id: Long = 0,

    @Column(nullable = false, length = 50)
    val name: String
)

package com.example.my_application.domain.horse_racing

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Racehorse(
    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    @Id
    @GeneratedValue
    val id: Long = 0
) {
    val age get() = LocalDate.now().year - dateOfBirth.year
}

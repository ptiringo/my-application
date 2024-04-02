package com.example.my_application.domain.sakamichi

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class TVProgram(
    @Column(nullable = false)
    val title: String,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

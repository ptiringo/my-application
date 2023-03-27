package com.example.my_application.domain.urban_sociology.ikebukuro

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class IkebukuroIncident(
    @Id
    @GeneratedValue
    val id: Long = 0,

    @Column(nullable = false, length = 255)
    val summary: String,

    val occurredOn: LocalDate
)

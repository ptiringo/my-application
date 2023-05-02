package com.example.my_application.domain.urban_sociology.ikebukuro

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class IkebukuroIncident(

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val occurredOn: LocalDate,

    @Id
    @GeneratedValue
    val id: Long = 0,
)

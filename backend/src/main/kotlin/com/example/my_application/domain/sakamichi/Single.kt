package com.example.my_application.domain.sakamichi

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Single(

    val number: Int,

    val title: String,

    @Id
    val id: Long = 0,
)

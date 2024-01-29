package com.example.my_application.domain.sakamichi.song

import javax.persistence.*

@Entity
class Position(
    /** 何列目か */
    @Column(nullable = false, name = "row_number")
    val row: Int,

    /** 左から何番目か */
    val positionFromTheLeft: Int,

    @ManyToOne(optional = false)
    val formation: Formation,

    @Id
    @GeneratedValue
    val id: Long = 0,
)

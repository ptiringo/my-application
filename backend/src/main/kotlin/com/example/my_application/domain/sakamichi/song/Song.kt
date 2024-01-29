package com.example.my_application.domain.sakamichi.song

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne

/** 曲 */
@Entity
class Song(
    /** 曲名 */
    val title: String,

    @OneToOne
    val formation: Formation,

    @Id
    @GeneratedValue
    val id: Long = 0,
)

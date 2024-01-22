package com.example.my_application.domain.horse_racing.horce_owner

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/** 馬主 */
@Entity
class HorseOwner(
    /** 氏名 */
    @Column(nullable = false)
    val name: String,

    @Id
    @GeneratedValue
    val id: Long = 0,
)

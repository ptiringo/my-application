package com.example.my_application.domain.tennis.match

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/** 試合 */
@Entity
class Match {
    @Id
    @GeneratedValue
    val id: Long = 0
}

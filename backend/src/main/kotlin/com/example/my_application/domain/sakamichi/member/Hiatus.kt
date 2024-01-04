package com.example.my_application.domain.sakamichi.member

import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

/** 活動休止 */
@Entity
class Hiatus(
    @EmbeddedId
    val hiatusId: HiatusId
)

@Embeddable
data class HiatusId(

    @ManyToOne(optional = false)
    val member: Member,

    @Column(nullable = false)
    val startAt: LocalDate

) : Serializable

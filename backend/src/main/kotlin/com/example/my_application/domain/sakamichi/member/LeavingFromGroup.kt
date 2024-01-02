package com.example.my_application.domain.sakamichi.member

import java.io.Serializable
import javax.persistence.*

@Entity
class LeavingFromGroup(

    @Id
    val id: Long = 0,

    @OneToOne
    @JoinColumn(name = "member_id", nullable = false)
    @MapsId
    val member: Member,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val type: LeavingType
) : Serializable

enum class LeavingType {
    /** 卒業 */
    GRADUATION
}

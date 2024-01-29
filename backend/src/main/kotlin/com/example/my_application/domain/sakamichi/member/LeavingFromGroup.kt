package com.example.my_application.domain.sakamichi.member

import java.time.LocalDate
import javax.persistence.*

/** グループからの脱退 */
@Entity
class LeavingFromGroup(
    /** メンバー */
    @OneToOne
    @JoinColumn(name = "member_id", nullable = false)
    @MapsId
    val member: Member,

    /** 脱退の種類 */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val type: LeavingType,

    /** 脱退日 */
    @Column(nullable = false)
    val leavedDate: LocalDate,

    @Id
    val id: Long = 0
)

/** 脱退の種類 */
enum class LeavingType {
    /** 卒業 */
    GRADUATION,

    /** 活動辞退 */
    WITHDRAWAL_FROM_ACTIVITY
}

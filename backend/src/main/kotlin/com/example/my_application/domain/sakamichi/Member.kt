package com.example.my_application.domain.sakamichi

import java.time.LocalDate
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Member(

    @Embedded
    val name: Name,

    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    @OneToOne(
        optional = true,
        fetch = FetchType.EAGER,
        mappedBy = "member",
        cascade = [CascadeType.ALL]
    )
    var leavingFromGroup: LeavingFromGroup? = null,

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "leaveOfAbsenceId.member",
        cascade = [CascadeType.ALL]
    )
    @OrderBy("startAt")
    var leaveOfAbsences: MutableList<LeaveOfAbsence> = arrayListOf(),

    @Id
    @GeneratedValue
    val id: Long = 0
) {
    val age get() = dateOfBirth.until(LocalDate.now()).years

    /** 卒業 */
    fun graduate() {
        this.leavingFromGroup = LeavingFromGroup(member = this, type = LeavingType.GRADUATION)
    }

    fun takeLeaveOfAbsence(startAt: LocalDate) {
        this.leaveOfAbsences.add(LeaveOfAbsence(member = this, startAt = startAt))
    }

    fun comeBack(endAt: LocalDate) {
        this.leaveOfAbsences.last().endAt = endAt
    }
}

@Embeddable
class Name(
    /** 名前 */
    @Column(nullable = false)
    val firstName: String,

    /** 名字 */
    @Column(nullable = false)
    val familyName: String,

    /** 名前（かな） */
    @Column(nullable = false)
    val firstNameKana: String,

    /** 名字（かな） */
    @Column(nullable = false)
    val familyNameKana: String
)

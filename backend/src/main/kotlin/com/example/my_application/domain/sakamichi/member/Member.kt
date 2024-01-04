package com.example.my_application.domain.sakamichi.member

import com.example.my_application.domain.sakamichi.group.Generation
import java.time.LocalDate
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
final class Member(
    @Embedded
    val name: Name,

    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    @ManyToOne(fetch = FetchType.EAGER)
    val generation: Generation,

    @OneToOne(
        optional = true,
        fetch = FetchType.EAGER,
        mappedBy = "member",
        cascade = [CascadeType.ALL]
    )
    var leavingFromGroup: LeavingFromGroup?,

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "leaveOfAbsenceId.member",
        cascade = [CascadeType.ALL]
    )
    @OrderBy("startAt")
    val hiatuses: MutableList<Hiatus>,

    @Id
    @GeneratedValue
    val id: Long = 0
) {
    init {
        this.generation.members.add(this)
    }

    constructor(name: Name, dateOfBirth: LocalDate, generation: Generation) : this(
        name = name,
        dateOfBirth = dateOfBirth,
        generation = generation,
        leavingFromGroup = null,
        hiatuses = arrayListOf()
    )

    val age get() = dateOfBirth.until(LocalDate.now()).years

    /** 卒業 */
    fun graduate() {
        this.leavingFromGroup = LeavingFromGroup(member = this, type = LeavingType.GRADUATION)
    }

    fun takeLeaveOfAbsence(startAt: LocalDate) {
        this.hiatuses.add(Hiatus(member = this, startAt = startAt))
    }

    fun comeBack(endAt: LocalDate) {
        this.hiatuses.last().endAt = endAt
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

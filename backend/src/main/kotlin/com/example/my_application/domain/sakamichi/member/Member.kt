package com.example.my_application.domain.sakamichi.member

import com.example.my_application.domain.sakamichi.group.Generation
import java.time.LocalDate
import javax.persistence.*

/** メンバー */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Member(

    /** 名前 */
    @Embedded
    val name: Name,

    /** 生年月日 */
    @Column(nullable = false)
    val dateOfBirth: LocalDate,

    /** 期 */
    @ManyToOne(fetch = FetchType.EAGER)
    val generation: Generation,

    /** グループからの脱退 */
    @OneToOne(
        optional = true,
        fetch = FetchType.EAGER,
        mappedBy = "member",
        cascade = [CascadeType.ALL]
    )
    var leavingFromGroup: LeavingFromGroup? = null,

    /** 活動休止 */
    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "member",
        cascade = [CascadeType.ALL],
    )
    @OrderBy("started_date")
    val breakOfActivities: MutableList<BreakOfActivity> = arrayListOf(),

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
        breakOfActivities = arrayListOf()
    )

    /** 年齢 */
    val age get() = dateOfBirth.until(LocalDate.now()).years

    /** 現在活動休止中かどうか */
    val isCurrentlyBreakOfActivity
        get() = this.hasBeenBreakOfActivity && this.breakOfActivities.maxBy { it.startedDate }.returnToActivity == null

    /** 現在進行中含め過去に活動休止したことがあるか */
    private val hasBeenBreakOfActivity get() = this.breakOfActivities.isNotEmpty()

    /** 卒業 */
    fun graduate(leavedDate: LocalDate) {
        this.leavingFromGroup = LeavingFromGroup(
            member = this,
            type = LeavingType.GRADUATION,
            leavedDate = leavedDate
        )
    }

    /** 活動辞退 */
    fun withdrawFromActivity(leavedDate: LocalDate) {
        this.leavingFromGroup = LeavingFromGroup(
            member = this,
            type = LeavingType.WITHDRAWAL_FROM_ACTIVITY,
            leavedDate = leavedDate
        )
    }

    /** 活動休止 */
    fun startBreakOfActivity(startAt: LocalDate): BreakOfActivity {
        check(!this.hasBeenBreakOfActivity || this.isCurrentlyBreakOfActivity) {
            "活動休止中のメンバーは活動休止できません。"
        }
        val breakOfActivity = BreakOfActivity(member = this, startedDate = startAt)
        this.breakOfActivities.add(breakOfActivity)
        return breakOfActivity
    }

    /** 活動再開 */
    fun comeBack(endAt: LocalDate): ReturnToActivity {
        check(this.isCurrentlyBreakOfActivity) {
            "活動休止中でないメンバーは活動再開できません。"
        }
        val breakOfActivity = this.breakOfActivities.last()
        val returnToActivity = ReturnToActivity(
            breakOfActivity = breakOfActivity,
            returnedDate = endAt
        )
        breakOfActivity.returnToActivity = returnToActivity
        return returnToActivity
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
    val familyNameKana: String,

    /** ミドルネーム */
    val middleName: String? = null
)

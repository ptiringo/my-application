package com.example.my_application.domain.sakamichi.group

import com.example.my_application.domain.sakamichi.member.Member
import java.time.LocalDate
import javax.persistence.*

/** 期 */
@Entity
class Generation(
    /** グループ */
    @ManyToOne @JoinColumn(name = "group_id") val group: Group,

    /** メンバー */
    @OneToMany(
        mappedBy = "generation", cascade = [CascadeType.PERSIST]
    ) val members: MutableList<Member>,

    /** 加入日 */
    @Column(nullable = false) val joinDate: LocalDate,
) {
    @Id
    @GeneratedValue
    val id: Long = 0

    init {
        this.group.generation.add(this)
        this.members.forEach { it.generation = this }
    }
}

package com.example.my_application.domain.sakamichi.group

import com.example.my_application.domain.sakamichi.member.Member
import java.time.LocalDate
import javax.persistence.*

@Entity
class Generation(
    @ManyToOne
    @JoinColumn(name = "group_id")
    val group: Group,

    @OneToMany(mappedBy = "generation", cascade = [CascadeType.PERSIST])
    val members: MutableList<Member> = arrayListOf(),

    @Column(nullable = false)
    val joinDate: LocalDate,

    @Id
    @GeneratedValue
    val id: Long = 0
) {
    constructor(group: Group, joinDate: LocalDate) : this(group = group, joinDate = joinDate, id = 0)

    init {
        this.group.generation.add(this)
    }
}

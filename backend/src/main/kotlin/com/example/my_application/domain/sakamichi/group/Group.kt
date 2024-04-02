package com.example.my_application.domain.sakamichi.group

import com.example.my_application.domain.sakamichi.member.Member
import com.example.my_application.domain.sakamichi.single.Single
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "sakamichi_group")
final class Group(
    /** グループ名 */
    name: String,

    @Column(nullable = false)
    val formationDate: LocalDate,

    members: MutableList<Member>,
) {
    @Id
    @GeneratedValue
    val id: Long = 0

    @OneToMany(
        fetch = FetchType.LAZY,
        mappedBy = "group",
        cascade = [CascadeType.ALL],
    )
    val groupAttributesHistories: MutableList<GroupAttributes> = arrayListOf()

    @OneToMany(mappedBy = "group", cascade = [CascadeType.PERSIST])
    val generation: MutableList<Generation> = arrayListOf()

    init {
        this.groupAttributesHistories += GroupAttributes(group = this, groupName = name)
        this.generation += Generation(group = this, joinDate = this.formationDate, members = members)
    }

    fun releaseNewSingle(number: Int, title: String, releaseDate: LocalDate): Single {
        return Single(number = number, title = title, group = this, releaseDate = releaseDate)
    }
}

package com.example.my_application.domain.sakamichi.group

import com.example.my_application.domain.sakamichi.member.Member
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "sakamichi_group")
class Group(
    /** グループ名 */
    name: String,

    /** 結成日 */
    @Column(nullable = false) val formationDate: LocalDate,

    members: MutableList<Member>,
) {
    @Id
    @GeneratedValue
    val id: Long = 0

    /** グループ属性履歴 */
    @OneToMany(
        fetch = FetchType.LAZY,
        mappedBy = "group",
        cascade = [CascadeType.ALL]
    )
    val groupAttributesHistories: MutableList<GroupAttributes> = arrayListOf()

    /** 期 */
    @OneToMany(mappedBy = "group", cascade = [CascadeType.PERSIST])
    val generation: MutableList<Generation> = arrayListOf()

    init {
        this.groupAttributesHistories += GroupAttributes(group = this, groupName = name)
        this.generation += Generation(group = this, joinDate = this.formationDate, members = members)
    }
}

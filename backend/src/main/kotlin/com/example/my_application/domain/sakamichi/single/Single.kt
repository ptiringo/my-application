package com.example.my_application.domain.sakamichi.single

import com.example.my_application.domain.sakamichi.group.Group
import javax.persistence.*

@Entity
class Single(

    val title: String,

    @ManyToOne
    @JoinColumn(name = "group_id", foreignKey = ForeignKey(name = "fk_single_group"))
    val group: Group,

    @Id @GeneratedValue
    val id: Long = 0,
)

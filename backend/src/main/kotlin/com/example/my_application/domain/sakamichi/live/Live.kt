package com.example.my_application.domain.sakamichi.live

import com.example.my_application.domain.sakamichi.group.Group
import javax.persistence.*

/** ライブ */
@Entity
class Live(

    /** グループ */
    @ManyToOne(
        cascade = [],
        fetch = FetchType.LAZY,
        optional = false
    )
    @JoinColumn(name = "group_id")
    val group: Group,

    /** 公演名 */
    val title: String,

    @Id
    @GeneratedValue
    val id: Long = 0,
)

package com.example.my_application.domain.sakamichi.single

import com.example.my_application.domain.sakamichi.group.Group
import java.time.LocalDate
import javax.persistence.*

/** シングル */
@Entity
class Single(

    val title: String,

    @ManyToOne
    @JoinColumn(name = "group_id", foreignKey = ForeignKey(name = "fk_single_group"))
    val group: Group,

    val releaseDate: LocalDate,

    @Id @GeneratedValue
    val id: Long = 0,
)


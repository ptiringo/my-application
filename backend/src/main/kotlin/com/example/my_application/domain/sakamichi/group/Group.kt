package com.example.my_application.domain.sakamichi.group

import com.example.my_application.domain.sakamichi.single.Single
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "sakamichi_group")
class Group(
    val name: String,

    @Id @GeneratedValue
    val id: Long = 0,

    @Column(nullable = false)
    val formationDate: LocalDate,

    @OneToMany(mappedBy = "group", cascade = [CascadeType.PERSIST])
    val generation: MutableList<Generation> = arrayListOf(),
) {
    constructor(name: String, formationDate: LocalDate) : this(name = name, formationDate = formationDate, id = 0)

    fun releaseNewSingle(number: Int, title: String, releaseDate: LocalDate): Single {
        return Single(number = number, title = title, group = this, releaseDate = releaseDate)
    }
}

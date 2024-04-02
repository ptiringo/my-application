package com.example.my_application.domain.sakamichi.song

import javax.persistence.*

@Entity
class Formation(
    /** メンバーとそのポジション */
    @OneToMany(mappedBy = "formation")
    val positions: List<Position>,

    @OneToOne(mappedBy = "formation")
    val song: Song,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

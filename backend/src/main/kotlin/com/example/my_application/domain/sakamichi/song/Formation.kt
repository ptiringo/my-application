package com.example.my_application.domain.sakamichi.song

import javax.persistence.*

/** フォーメーション */
@Entity
class Formation(
    /** メンバーとそのポジション */
    @OneToMany(mappedBy = "formation")
    val positions: List<Position>,

    /** 曲 */
    @OneToOne(mappedBy = "formation")
    val song: Song,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

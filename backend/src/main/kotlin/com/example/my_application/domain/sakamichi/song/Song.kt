package com.example.my_application.domain.sakamichi.song

import com.example.my_application.domain.sakamichi.single_product.SingleProductSong
import javax.persistence.*

/** 曲 */
@Entity
class Song(
    /** 曲名 */
    val title: String,

    /** フォーメーション */
    @OneToOne
    val formation: Formation,

    /** シングル製品曲 */
    @ManyToMany
    val singleProductSongs: List<SingleProductSong> = emptyList(),
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

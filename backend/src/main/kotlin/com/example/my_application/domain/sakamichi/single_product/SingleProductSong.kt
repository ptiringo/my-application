package com.example.my_application.domain.sakamichi.single_product

import com.example.my_application.domain.sakamichi.song.Song
import javax.persistence.*

/** シングル製品曲 */
@Entity
class SingleProductSong(

    /** 番号 */
    val number: Int,

    /** シングル製品 */
    @ManyToOne
    val singleProduct: SingleProduct,

    /** 曲 */
    @ManyToMany(
        mappedBy = "singleProductSongs",
        cascade = [CascadeType.ALL],
        fetch = FetchType.LAZY
    )
    val songs: List<Song> = emptyList(),
) {
    @Id
    val id: Long = 0
}

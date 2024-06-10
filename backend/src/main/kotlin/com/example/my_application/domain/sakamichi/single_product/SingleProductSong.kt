package com.example.my_application.domain.sakamichi.single_product

import com.example.my_application.domain.sakamichi.song.Song
import javax.persistence.*

@Entity
class SingleProductSong(

    val number: Int,

    @ManyToOne
    val singleProduct: SingleProduct,

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

package com.example.my_application.domain.sakamichi.single_product

import com.example.my_application.domain.sakamichi.single.Single
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

/** シングル製品 */
@Entity
class SingleProduct(

    /** シングル */
    @ManyToOne(
        cascade = [],
        optional = false,
        fetch = FetchType.LAZY
    )
    val single: Single,

    /** シングル製品曲 */
    @OneToMany(
        mappedBy = "singleProduct",
        fetch = FetchType.LAZY,
        orphanRemoval = true
    )
    val singleProductSongs: List<SingleProductSong> = emptyList(),

    /** 発売日 */
    val releaseDate: LocalDate,
) {
    @Id
    val id: Long = 0
}

package com.example.my_application.domain.sakamichi.single

import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.single_product.SingleProduct
import java.time.LocalDate
import javax.persistence.*

/** シングル */
@Entity
class Single(

    /** シングルの通し番号 */
    val number: Int,

    /** タイトル */
    val title: String,

    /** グループ */
    @ManyToOne(
        cascade = [],
        fetch = FetchType.LAZY,
        optional = false
    )
    @JoinColumn(
        name = "group_id",
        foreignKey = ForeignKey(name = "fk_single_group")
    )
    val group: Group,

    /** リリース日 */
    val releaseDate: LocalDate,

    @OneToMany(
        mappedBy = "single",
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL],
        orphanRemoval = true
    )
    val singleProducts: List<SingleProduct> = emptyList(),
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}


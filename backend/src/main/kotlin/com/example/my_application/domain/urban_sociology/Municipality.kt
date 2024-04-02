package com.example.my_application.domain.urban_sociology

import javax.persistence.*
import javax.persistence.FetchType.EAGER

/** 市区町村 */
@Entity
class Municipality(

    @Column(nullable = false)
    val name: String,

    @ManyToOne(optional = false, fetch = EAGER)
    val prefecture: Prefecture,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val type: MunicipalityType,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

enum class MunicipalityType {
    /** 市 */
    SHI,

    /** 区 */
    KU,

    /** 町 */
    CHOU,

    /** 村 */
    SON
}

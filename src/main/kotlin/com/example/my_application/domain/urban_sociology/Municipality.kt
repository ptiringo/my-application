package com.example.my_application.domain.urban_sociology

import javax.persistence.*
import javax.persistence.FetchType.EAGER

/** 市区町村 */
@Entity
class Municipality(
    @Id
    @GeneratedValue
    val id: Long = 0,

    val name: String,

    @ManyToOne(optional = false, fetch = EAGER)
    val prefecture: Prefecture,

    @Enumerated(EnumType.STRING)
     val type: MunicipalityType
)

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
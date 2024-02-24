package com.example.my_application.domain.sakamichi.release_package

import com.example.my_application.domain.sakamichi.single.Single
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class ReleasePackage(

    @ManyToOne(
        cascade = [],
        optional = false,
        fetch = FetchType.LAZY
    )
    val single: Single,

    @Id
    val id: Long = 0,
)

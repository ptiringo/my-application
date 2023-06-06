package com.example.my_application.domain.sakamichi

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.UniqueConstraint

@Entity
@Table(uniqueConstraints = [UniqueConstraint(columnNames = ["groupCode", "number"])])
class Single(

    val groupCode: Group,

    val number: Int,

    val title: String,

    @Id
    val id: Long = 0,
)

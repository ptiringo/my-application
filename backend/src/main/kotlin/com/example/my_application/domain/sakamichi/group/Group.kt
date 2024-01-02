package com.example.my_application.domain.sakamichi.group

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "sakamichi_group")
class Group(
    val name: String,

    @Id
    val id: Long = 0,
)

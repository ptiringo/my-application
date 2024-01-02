package com.example.my_application.domain.sakamichi.group

import com.example.my_application.domain.sakamichi.single.Single
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "sakamichi_group")
class Group(
    val name: String,

    @Id @GeneratedValue
    val id: Long = 0,
) {
    fun releaseNewSingle(title: String): Single {
        return Single(title = title, group = this)
    }
}

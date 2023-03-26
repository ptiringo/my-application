package com.example.my_application.domain.sakamichi

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class NogizakaMember(
    @Id
    @GeneratedValue
    val id: Long = 0,

    /** 名前 */
    @Column(nullable = false)
    val firstName: String,

    /** 名字 */
    @Column(nullable = false)
    val familyName: String
)
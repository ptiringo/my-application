package com.example.my_application.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class NogizakaMember {
    @Id
    @GeneratedValue
    val id: Long? = null

    /** 名前 */
    lateinit var firstName: String

    /** 名字 */
    lateinit var familyName: String
}
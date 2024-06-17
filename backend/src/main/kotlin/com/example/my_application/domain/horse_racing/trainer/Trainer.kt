package com.example.my_application.domain.horse_racing.trainer

import org.hibernate.annotations.Comment
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/** 調教師 */
@Entity
class Trainer(
    /** 名前 */
    @Comment("名前")
    @Column(nullable = false, length = 30)
    val firstName: String,

    /** 名字 */
    @Comment("名字")
    @Column(nullable = false, length = 30)
    val familyName: String,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

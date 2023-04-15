package com.example.my_application.domain.horse_racing

import com.example.my_application.domain.sakamichi.Name
import org.hibernate.annotations.Comment
import javax.persistence.*

@Entity
class Jockey(
    @Embedded
    val name: Name,

    @Id
    @GeneratedValue
    val id: Long = 0
)

@Embeddable
class Name(
    /** 名前 */
    @Comment("名前")
    @Column(nullable = false, length = 30)
    val firstName: String,

    /** 名字 */
    @Comment("名字")
    @Column(nullable = false, length = 30)
    val familyName: String,

    /** 名前（かな） */
    @Comment("名前（かな）")
    @Column(nullable = false, length = 30)
    val firstNameKana: String,

    /** 名字（かな） */
    @Comment("名字（かな）")
    @Column(nullable = false, length = 30)
    val familyNameKana: String
)

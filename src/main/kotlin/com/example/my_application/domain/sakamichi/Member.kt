package com.example.my_application.domain.sakamichi

import org.hibernate.annotations.Comment
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Member(
    @Id
    @GeneratedValue
    val id: Long = 0,

    @Embedded
    val name: Name,

    @OneToOne(
        optional = true,
        fetch = FetchType.EAGER,
        mappedBy = "member",
        cascade = [CascadeType.ALL]
    )
    var leavingFromGroup: LeavingFromGroup? = null
) {
    fun graduate() {
        this.leavingFromGroup = LeavingFromGroup(member = this, type = LeavingType.GRADUATION)
    }
}

@Embeddable
class Name(
    /** 名前 */
    @Comment("名前")
    @Column(nullable = false)
    val firstName: String,

    /** 名字 */
    @Comment("名字")
    @Column(nullable = false)
    val familyName: String,

    /** 名前（かな） */
    @Comment("名前（かな）")
    @Column(nullable = false)
    val firstNameKana: String,

    /** 名字（かな） */
    @Comment("名字（かな）")
    @Column(nullable = false)
    val familyNameKana: String
)
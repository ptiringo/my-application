package com.example.my_application.domain.horse_racing.agent

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/** 騎乗依頼仲介者（エージェント） **/
@Entity
class Agent(

    /** 氏名 */
    @Column(nullable = false)
    val name: String,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

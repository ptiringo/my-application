package com.example.my_application.domain.sakamichi.group;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/** グループ属性 */
@Entity
class GroupAttributes(

    @ManyToOne(optional = false)
    val group: Group,

    /** グループ名 */
    val groupName: String,
) {
    @Id
    @GeneratedValue
    val id: Long = 0
}

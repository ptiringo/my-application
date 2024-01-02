package com.example.my_application.application.sakamichi

import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.infrastructure.sakamichi.group.GroupRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class SakamichiGroupService {

    @Inject
    lateinit var groupRepository: GroupRepository

    @Transactional
    fun createNewGroup(group: Group) {
        groupRepository.persist(group)
    }
}

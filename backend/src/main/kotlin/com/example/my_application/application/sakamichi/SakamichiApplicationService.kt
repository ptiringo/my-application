package com.example.my_application.application.sakamichi

import com.example.my_application.domain.sakamichi.group.Generation
import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.member.Member
import com.example.my_application.domain.sakamichi.member.Name
import com.example.my_application.domain.sakamichi.single.Single
import com.example.my_application.infrastructure.sakamichi.group.GroupRepository
import com.example.my_application.infrastructure.sakamichi.member.MemberRepository
import com.example.my_application.infrastructure.sakamichi.single.SingleRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class SakamichiApplicationService {

    @Inject
    lateinit var groupRepository: GroupRepository

    @Inject
    lateinit var memberRepository: MemberRepository

    @Inject
    lateinit var singleRepository: SingleRepository

    @Transactional
    fun createNewGroup(createNewGroupCommand: CreateNewGroupCommand): Group {
        val group = Group(
            name = createNewGroupCommand.groupName,
            formationDate = createNewGroupCommand.formationDate
        )

        val initialGeneration = Generation(
            group = group,
            joinDate = group.formationDate
        )

        createNewGroupCommand.initialMembers.map {
            Member(
                name = Name(
                    firstName = it.firstName,
                    familyName = it.familyName,
                    firstNameKana = it.firstNameKana,
                    familyNameKana = it.familyNameKana
                ),
                dateOfBirth = it.dateOfBirth,
                generation = initialGeneration
            )
        }
        groupRepository.persist(group)
        return group
    }

    @Transactional
    fun joinNewMembers(joinNewMembersCommand: JoinNewMembersCommand): Generation {
        val group = groupRepository.findById(joinNewMembersCommand.groupId)!!

        val generation = Generation(
            group = group,
            joinDate = joinNewMembersCommand.joinDate
        )

        joinNewMembersCommand.newMembers.map {
            Member(
                name = Name(
                    firstName = it.firstName,
                    familyName = it.familyName,
                    firstNameKana = it.firstNameKana,
                    familyNameKana = it.familyNameKana
                ),
                dateOfBirth = it.dateOfBirth,
                generation = generation
            )
        }

        return generation
    }

    @Transactional
    fun releaseNewSingle(groupId: Long, title: String): Single {
        val single = groupRepository.findById(groupId)!!.releaseNewSingle(title)
        singleRepository.persist(single)
        return single
    }

    
}

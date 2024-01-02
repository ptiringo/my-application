package com.example.my_application.application.sakamichi

import com.example.my_application.domain.sakamichi.group.Group
import com.example.my_application.domain.sakamichi.member.HinatazakaMember
import com.example.my_application.domain.sakamichi.member.NogizakaMember
import com.example.my_application.domain.sakamichi.member.SakurazakaMember
import com.example.my_application.domain.sakamichi.single.Single
import com.example.my_application.infrastructure.sakamichi.group.GroupRepository
import com.example.my_application.infrastructure.sakamichi.member.HinatazakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.member.NogizakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.member.SakurazakaMemberRepository
import com.example.my_application.infrastructure.sakamichi.single.SingleRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class SakamichiApplicationService {

    @Inject
    lateinit var nogizakaMemberRepository: NogizakaMemberRepository

    @Inject
    lateinit var sakurazakaMemberRepository: SakurazakaMemberRepository

    @Inject
    lateinit var hinatazakaMemberRepository: HinatazakaMemberRepository

    @Inject
    lateinit var groupRepository: GroupRepository

    @Inject
    lateinit var singleRepository: SingleRepository

    @Transactional
    fun createNewGroup(groupName: String): Group {
        val group = Group(name = groupName)
        groupRepository.persist(group)
        return group
    }

    @Transactional
    fun registerNogizakaMembers(nogizakaMembers: Iterable<NogizakaMember>) {
        nogizakaMemberRepository.persist(nogizakaMembers)
    }

    @Transactional
    fun registerNogizakaMembers(vararg nogizakaMembers: NogizakaMember) {
        this.registerNogizakaMembers(listOf(*nogizakaMembers))
    }

    @Transactional
    fun registerSakurazakaMembers(sakurazakaMembers: Iterable<SakurazakaMember>) {
        sakurazakaMemberRepository.persist(sakurazakaMembers)
    }

    @Transactional
    fun registerSakurazakaMembers(vararg sakurazakaMembers: SakurazakaMember) {
        this.registerSakurazakaMembers(listOf(*sakurazakaMembers))
    }

    @Transactional
    fun registerHinatazakaMembers(hinatazakaMembers: Iterable<HinatazakaMember>) {
        hinatazakaMemberRepository.persist(hinatazakaMembers)
    }

    @Transactional
    fun registerHinatazakaMembers(vararg hinatazakaMembers: HinatazakaMember) {
        this.registerHinatazakaMembers(listOf(*hinatazakaMembers))
    }

    @Transactional
    fun releaseNewSingle(groupId: Long, title: String): Single {
        val single = groupRepository.findById(groupId)!!.releaseNewSingle(title)
        singleRepository.persist(single)
        return single
    }
}
